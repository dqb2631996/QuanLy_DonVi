/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL_DonVi;

/**
 *
 * @author mac
 */
public class CongNhan extends Management {
    int level;

    public CongNhan() {
    }

    public CongNhan(int level) {
        this.level = level;
    }

    public CongNhan(int level, String name, int age, String gioiTinh, String address) {
        super(name, age, gioiTinh, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "CongNhan{" + "name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", level=" + level + '}';
    }
    
    
}
