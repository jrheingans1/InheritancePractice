/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.concrete;

/**
 *
 * @author James
 */
public class SalariedEmployee extends Employee {

    private double annualSalary;
    private double annualBonusPay;

    /**
     *
     * @return
     */
    @Override
    public double getAnnualPay() {
        return annualSalary * 12 + annualBonusPay;
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
