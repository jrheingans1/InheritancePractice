/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author James
 */
public class SalariedEmployee implements Employee {

    private String lastName;
    private String firstName;
    private String employeeIdNumber;

    private double annualSalary;
    private double annualBonusPay;

    @Override
    public double getAnnualPay() {
        return annualSalary * 12 + annualBonusPay;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmployeeIdNumber() {
        return employeeIdNumber;
    }

    public void setEmployeeIdNumber(String employeeIdNumber) {
        this.employeeIdNumber = employeeIdNumber;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualBonusPay() {
        return annualBonusPay;
    }

    public void setAnnualBonusPay(double annualBonusPay) {
        this.annualBonusPay = annualBonusPay;
    }

}
