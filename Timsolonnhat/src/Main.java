import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử vào mảng: ");
        int n = sc.nextInt();
        int []mang = new int[n];

        // Lặp qua các phần tử của mảng và gán giá trị cho mảng
        System.out.print("Nhập các số cần tìm vào mảng: ");
        for (int i = 0; i < n; i++){
            mang[i] = sc.nextInt();
        }

        /* Gán solonnhat là giá trị đầu tiên của mảng nên không cần so sánh với giá trị đầu tiên
        khi kết thúc vòng lặp thì i không còn nhỏ hơn n
        if để kiểm tra các phần tử của mảng có lớn hơn solonnhat hay không lặp đến khi nào thoả
        mãn điều kiện thì gán solonnhat = mang[i] để lưu giá trị này là lớn nhất */
        int solonnhat = mang[0];
        for (int i = 1; i < n; i++){
            if(mang[i] > solonnhat){
                solonnhat = mang[i];
            }
        }
        // in ra màn hình giá trị lớn nhất của mảng
        System.out.println("Số lớn nhất trong mảng là: " + solonnhat);
    }
}