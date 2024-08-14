/*

 */
package mang1chieu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap17 {
    public static void main (String[] args){
        int [] a;
        int n;
        Scanner sc = new Scanner (System.in);
        //Đọc số phần tử từ bàn phím
        System.out.print("Cho biet so phan tu: ");
        n = sc.nextInt();
        
        //Cập nhật số phần tử cho mảng
        a = new int[n];
        
        //Nhập giá trị cho mảng từ bàn phím
        nhapMang(a, sc);
        
        //a) Xuất mảng ra màn hình
        System.out.println("---Mang a---");
        xuatMang(a);
        
        //b) Tính trung bình giá trị của mảng
        int sum = tinhTrungBinh(a);
        System.out.print("\n Trung binh gia tri mang: " + sum);
        
        //c) Tìm phần tử có giá trị nhỏ nhất
        int min = timMin(a);
        System.out.print("\n Phan tu nho nhat: " + min);
    } 
 
    
    
    
    
    //Định nghĩa phương thức nhập mảng
    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++){
            System.out.print("Cho biet gia tri a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }
    
    //Định nghĩa phương thức xuất mảng
    public static void xuatMang(int[] a) {
        for (int x : a){
            System.out.print(x + " ");
        }
    }
    
    public static int tinhTrungBinh(int[] a){
        int sum = 0;
        for (int x : a){
            sum = sum + x;
        }
        return sum / a.length;
    }
    
    public static int timMin(int[] a){
        int min = a[0];
        for (int x : a){
            if (x < min){
                min = x;
            }
        }
        return min;
    }
}
