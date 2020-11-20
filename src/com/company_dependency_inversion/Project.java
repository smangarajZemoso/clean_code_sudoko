package com.company_dependency_inversion;

import java.util.List;

public class Project {

    private List<IDeveloper> developers;

    public Project(List<IDeveloper> developers) {

        this.developers = developers;
    }

    public Project implement() {

        developers.forEach(d -> d.develop());
        return null;
    }

}