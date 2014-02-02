/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author James
 */
public class SalariedPlusCommissionEmployee extends SalariedEmployee {

    private double commission;

    @Override
    public double getAnnualPay() {
        return this.getAnnualSalary() * 12 + this.getAnnualBonusPay() + commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

}
