package com.company_dependency_inversion;

public class FrontEndDeveloper implements IDeveloper{

    @Override
    public void develop() {
        writeAngular();
    }

    public void writeAngular() {
        System.out.println("Writing Angular for frontend");
    }
}
