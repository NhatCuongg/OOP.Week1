/*

 */
package mang1chieu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap16 {
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
        
        //b) Tính tổng mảng
        int sum = tinhTongMang(a);
        System.out.print("\n Tong gia tri mang: " + sum);
        
        //c) Đếm dương lẻ trong mảng
        int dem_duong_le = demDuongLe(a);
        System.out.print("\n So duong le co trong mang: " + dem_duong_le);
        
        //d) Tìm phần tử lớn nhất trong mảng
        int max = timMax(a);
        System.out.print("\n Phan tu lon nhat: " + max);
    }

    //Định nghĩa phương thức xuất mảng
    public static void xuatMang(int[] a) {
        for (int x : a){
            System.out.print(x + " ");
        }
    }

    //Định nghĩa phương thức nhập mảng
    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++){
            System.out.print("Cho biet gia tri a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }
    
    //Định nghĩa phương thức tính tổng
    public static int tinhTongMang(int[] a){
        int sum = 0;
        for (int x : a){
            sum = sum + x;
        }
        return sum;
    }
    
    //Định nghĩa phương thức đếm số dương lẻ
    public static int demDuongLe(int[] a){
        int dem_duong_le = 0;
        for (int x : a){
            if (x > 0 && x % 2 != 0){
            dem_duong_le ++;    
            }
        }
        return dem_duong_le;
    }
    
    //Định nghĩa phương thức tìm số lớn nhất
    public static int timMax(int[] a){
        int max = a[0];
        for (int x : a){
            if (x > max){
                max = x;
            }
        }
        return max;
    }
}
