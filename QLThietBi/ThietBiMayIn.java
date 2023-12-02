package QLThietBi;

import java.util.Scanner;

public class ThietBiMayIn extends ThietBi {
    private int SoLuong;
    private String TenNhaCungCap;
    public ThietBiMayIn(){
    }
    public ThietBiMayIn(int MaThietBi, String TenThietBi, String LoaiThietBi, double DonGia, int SoLuong, String TenNhaCungCap){
        super(MaThietBi,TenThietBi,LoaiThietBi,DonGia);
        this.SoLuong = SoLuong;
        this.TenNhaCungCap = TenNhaCungCap;
    }

    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.print("Nhập số lượng cho máy in: ");
        SoLuong = sc.nextInt();
        System.out.print("Nhập tên nhà cung cấp cho máy in: ");
        TenNhaCungCap = sc.nextLine();
        TenNhaCungCap = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print("Số lượng cho máy in: " + SoLuong);
        System.out.println("Tên nhà cung cấp cho máy in: " + TenNhaCungCap);
    }
    public double TinhTongThanhTien(){
        double TongThanhTien = SoLuong * DonGia;
        double thue = TongThanhTien * 0.5;
        return TongThanhTien + thue;
    }
}
