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
public class NhanVien extends Management{
    String work;

    public NhanVien() {
    }

    public NhanVien(String work) {
        this.work = work;
    }

    public NhanVien(String work, String name, int age, String gioiTinh, String address) {
        super(name, age, gioiTinh, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", work=" + work + '}';
    }
    
    
}
