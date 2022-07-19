package com.jxareas.adapter;

import com.jxareas.adapter.model.Employee;
import com.jxareas.adapter.model.EmployeeAdapterLdap;
import com.jxareas.adapter.model.EmployeeLdap;

public class Main {
    public static void main(String... args) {
        EmployeeLdap employeeLdap = new EmployeeLdap("19289478", "Wick", "John", "johnwick@gmail.com");
        Employee employee = new EmployeeAdapterLdap(employeeLdap);
        System.out.println(employee.getId());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getEmail());
    }
}
