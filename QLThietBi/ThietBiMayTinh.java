package QLThietBi;

import java.util.Scanner;

public class ThietBiMayTinh extends ThietBi {
    private int SoLuong;

    public ThietBiMayTinh() {
    }
    public ThietBiMayTinh(int MaThietBi, String TenThietBi, String LoaiThietBi, double DonGia, int SoLuong){
        super(MaThietBi,TenThietBi , LoaiThietBi ,DonGia );
        this.SoLuong = SoLuong;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng ");
        SoLuong = sc.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Số lượng thiết bị " + SoLuong);
    }
    public double Thanhtien(){
        return SoLuong * DonGia;
    }
}
