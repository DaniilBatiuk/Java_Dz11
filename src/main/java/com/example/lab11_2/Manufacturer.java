package com.example.lab11_2;

public class Manufacturer {
    private String manufacturerName;
    private String headquarters;
    private int employeesCount;
    private String description;
    private String logoUrl;

    public Manufacturer() {
    }

    public Manufacturer(String manufacturerName, String headquarters, int employeesCount, String description, String logoUrl) {
        this.manufacturerName = manufacturerName;
        this.headquarters = headquarters;
        this.employeesCount = employeesCount;
        this.description = description;
        this.logoUrl = logoUrl;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public int getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(int employeesCount) {
        this.employeesCount = employeesCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }
}
