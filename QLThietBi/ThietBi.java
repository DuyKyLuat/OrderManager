package QLThietBi;

import java.util.Scanner;

public class ThietBi {
    protected int MaThietBi;
    protected String TenThietBi;
    protected String LoaiThietBi;
    protected double DonGia;

    //khởi tạo không tham số
    public ThietBi() {
    }

    public ThietBi(int MaThietBi, String TenThietBi, String LoaiThietBi, double DonGia) {
        this.MaThietBi = MaThietBi;
        this.TenThietBi = TenThietBi;
        this.LoaiThietBi = LoaiThietBi;
        this.DonGia = DonGia;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thiết bị: ");
        MaThietBi = sc.nextInt();
        System.out.print("Nhập tên thiết bị: ");
        TenThietBi = sc.nextLine();
        TenThietBi = sc.nextLine();
        System.out.print("Nhập loại thiết bị: ");
        LoaiThietBi = sc.nextLine();
        System.out.print("Nhập đơn giá của thiết bị: ");
        DonGia = sc.nextDouble();
    }

    public void xuat() {
        System.out.print("Mã thiết bị: " + MaThietBi );
        System.out.print("Nhập tên thiết bị: " + TenThietBi );
        System.out.print("Nhập loại thiết bị: " + LoaiThietBi );
        System.out.print("Nhập đơn giá của thiết bị: " + DonGia );
    }
}

