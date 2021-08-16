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
public class Management {
    String name;
    int age;
    String gender;
    String address;

    public Management() {
    }

    public Management(String name, int age, String gioiTinh, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gioiTinh) {
        this.gender = gioiTinh;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CanBo{" + "name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + '}';
    }
    
    
    
    
}
