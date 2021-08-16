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
public class KySu extends Management{
    String training;

    public KySu() {
    }

    public KySu(String training) {
        this.training = training;
    }

    public KySu(String training, String name, int age, String gioiTinh, String address) {
        super(name, age, gioiTinh, address);
        this.training = training;
    }

    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }

    @Override
    public String toString() {
        return "KySu{" + "name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", training=" + training + '}';
    }
    
      

}
