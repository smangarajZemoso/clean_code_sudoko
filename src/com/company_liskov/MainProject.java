package com.company_liskov;
import java.util.List;

public class MainProject {

    public void start(List<Employee> employees) {

        for(Employee employee:employees) {
            employee.work();
        }
    }
}
