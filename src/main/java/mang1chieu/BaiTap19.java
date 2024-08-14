/*

 */
package mang1chieu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap19 {
    public static void main(String[] args) {
        int[] a;
        int n;
        int x;
        Scanner sc = new Scanner (System.in);
        n = docSoPhanTu(sc);
        //Cập nhật số phần tử cho mảng
        a = new int[n];
        phatSinhMang(a);
        
        //a) Xuất mảng ra màn hình
        System.out.print("\n Mang duoc phat sinh: ");
        xuatMang(a);
        
        sapXepTang(a);
        System.out.print("\n Mang sau khi sap xep tang: ");
        xuatMang(a);
        
    }
    
    public static void sapXepTang(int[] a){
        Arrays.sort(a);
    }
    
    public static void xuatMang(int[] a){
        System.out.print(Arrays.toString(a));
    }
    
    public static void phatSinhMang(int[] a){
        Random rd = new Random();
        for (int i = 0; i < a.length; i++){
            a[i] = rd.nextInt(100);
        }
    }
    
    public static int docSoPhanTu(Scanner sc){
        int n = 0;
        do{
            System.out.print("Cho biet so phan tu mang (1 <= n <= 20): ");
            n = sc.nextInt();
        }while (n <= 0 || n > 20);
        return n;
    } 
}
