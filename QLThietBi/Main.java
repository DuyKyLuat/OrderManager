package QLThietBi;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThietBi> danhSachThietBi = new ArrayList<>();

        System.out.print("Nhập số lượng thiết bị cần nhập: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập loại thiết bị (1: Máy Tính / 2: Máy In): ");
            int choise = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            ThietBi thietBi;

            switch (choise) {
                case 1:
                    thietBi = new ThietBiMayTinh();
                    break;
                case 2:
                    thietBi = new ThietBiMayIn();
                    break;
                default:
                    System.out.println("Nhập sai vui lòng nhập lại: Máy tính(1) và Máy in(2)");
                    i--; // Decrement i to repeat the current iteration
                    continue;
            }
            thietBi.Nhap();
            danhSachThietBi.add(thietBi);
        }

        // Xuất thông tin thiết bị
        System.out.println("Danh sách thiết bị: ");
        for (ThietBi TB : danhSachThietBi) {
            TB.xuat();
        }

        // Sắp xếp thiết bị tăng dần theo đơn giá
        Collections.sort(danhSachThietBi, Comparator.comparingDouble(tb -> tb.DonGia));
        System.out.println("Danh sách thiết bị sau khi sắp xếp tăng dần theo đơn giá:");
        for (ThietBi TB : danhSachThietBi) {
            TB.xuat();
        }

        double tongDonGia = 0;
        for (ThietBi TB : danhSachThietBi) {
            tongDonGia += TB.DonGia;
        }
        System.out.println("Tổng đơn giá của danh sách thiết bị: " + tongDonGia);
    }
}
