package com.company_dependency_inversion;

public class BackEndDeveloper implements IDeveloper {

    @Override
    public void develop() {
        writePython();
    }

    public void writePython() {
        System.out.println("Writing Python for Backend");
    }
}
