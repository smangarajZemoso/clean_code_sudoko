package com.company_dependency_inversion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    IDeveloper frontEndDeveloper = new FrontEndDeveloper();
    IDeveloper backEndDeveloper = new BackEndDeveloper();

    List<IDeveloper> developers = new ArrayList<>();

    Project project = new Project(developers).implement();

}
