package com.jxareas.adapter.model;

public class EmployeeAdapterLdap implements Employee{

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap employeeLdap) {
        instance = employeeLdap;
    }


    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }


}
