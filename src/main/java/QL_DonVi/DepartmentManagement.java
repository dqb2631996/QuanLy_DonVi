/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL_DonVi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class DepartmentManagement {

    ArrayList<Management> ds = new ArrayList<Management>();

    void menu() {
        System.out.println("1. Thêm Cán Bộ :");
        System.out.println("2. Tìm kiếm theo họ tên :");
        System.out.println("3. Hiện thị thông tin về danh sách các cán bộ :");
        System.out.println("4. Thoát khỏi chương trình.");
        System.out.println("- Nhập Thao Tác :");

    }

    void insertCongNhan() {
        Scanner sc = new Scanner(System.in);
        CongNhan cn = new CongNhan();
        System.out.println("Nhập Tên Công Nhân :");
        cn.name = sc.nextLine();
        System.out.println("Nhập Tuổi Công Nhân :");
        cn.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập Giới Tính :");
        cn.gender = sc.nextLine();
        System.out.println("Nhập Địa Chỉ :");
        cn.address = sc.nextLine();
        System.out.println("Nhập Cấp Bậc :");
        cn.level = sc.nextInt();

        ds.add(cn);

    }

    void insertKySu() {
        Scanner sc = new Scanner(System.in);
        KySu ks = new KySu();
        System.out.println("Nhập Tên Kỹ Sư :");
        ks.name = sc.nextLine();
        System.out.println("Nhập Tuổi Kỹ Sư :");
        ks.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập Giới Tính :");
        ks.gender = sc.nextLine();
        System.out.println("Nhập Địa Chỉ :");
        ks.address = sc.nextLine();
        System.out.println("Nhập Ngành Đào Tạo :");
        ks.training = sc.nextLine();

        ds.add(ks);

    }

    void insertNhanVien() {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien();
        System.out.println("Nhập Tên Nhân Viên :");
        nv.name = sc.nextLine();
        System.out.println("Nhập Tuổi Nhân Viên :");
        nv.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập Giới Tính :");
        nv.gender = sc.nextLine();
        System.out.println("Nhập Địa Chỉ :");
        nv.address = sc.nextLine();
        System.out.println("Nhập Công Việc :");
        nv.work = sc.nextLine();

        ds.add(nv);
    }

    void searchNAME() {
        System.out.println("Nhập Tên :");
        Scanner sc = new Scanner(System.in);
        String nhapten = sc.nextLine();

        for (int i = 0; i < ds.size(); i++) {
            if (nhapten.equals(ds.get(i).name)) {
                System.out.println(ds.get(i));
            }

        }
    }

    void run() {
        while (true) {

            Scanner sc = new Scanner(System.in);
            menu();
            int nhap = sc.nextInt();
            if (nhap == 1) {
                System.out.println("1. Để thêm công nhân");
                System.out.println("2. Để thêm kỹ sư");
                System.out.println("3. Để thêm nhân viên");
                nhap = sc.nextInt();
                if (nhap == 1) {
                    insertCongNhan();

                } else if (nhap == 2) {
                    insertKySu();

                } else if (nhap == 3) {
                    insertNhanVien();
                } else {
                    System.out.println("Nhập lại");
                }
            } else if (nhap == 2) {
                searchNAME();
            } else if (nhap == 3) {
                for (int i = 0; i < ds.size(); i++) {
                }
                System.out.println(ds);

            } else if (nhap == 4) {
                System.out.println("Kết Thúc Chương Trình");
                break;

            } else {
                System.out.println("Nhập lại");
            }

        }
    }
}
