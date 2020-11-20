package com.company_dependency_inversion;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        IDeveloper frontEndDeveloper = new FrontEndDeveloper();
        IDeveloper backEndDeveloper = new BackEndDeveloper();

        List<IDeveloper> developers = new ArrayList<>();
        developers.add(frontEndDeveloper);
        developers.add(backEndDeveloper);

        Project project = new Project(developers);
        project.implement();
    }


}
