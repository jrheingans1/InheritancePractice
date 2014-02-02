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
public interface Employee {

    public abstract double getAnnualPay();

    public abstract String getLastName();

    public abstract void setLastName(String lastName);

    public abstract String getFirstName();

    public abstract void setFirstName(String firstName);

    public abstract String getEmployeeIdNumber();

    public abstract void setEmployeeIdNumber(String employeeIdNumber);
}
