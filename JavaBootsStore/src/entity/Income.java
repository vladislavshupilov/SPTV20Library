/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author vladislav
 */
public class Income implements Serializable {
    private double generalMoney;

    public double getGeneralMoney() {
        return generalMoney;
    }

    public void setGeneralMoney(double generalMoney) {
        this.generalMoney = generalMoney;
    }
}
