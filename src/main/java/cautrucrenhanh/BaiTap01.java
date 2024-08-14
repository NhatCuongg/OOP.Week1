/*
Giải phương trình bậc nhất.
 */
package cautrucrenhanh;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap01 {
    public static void main(String[] args) {
        double a, b;
        String kq = "";
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap he so a: ");
        a = sc.nextDouble();
        System.out.print("Nhap he so b: ");
        b = sc.nextDouble();
        
        if ( a == 0)
        {
            if ( b == 0)
            {
                kq = "Phuong trinh vo so nghiem";
            }
            else
            {
                kq = "Phuong trinh vo nghiem";
            }
        }
        else
        {
            kq = "Phuong trinh co nghiem x = " + (-b / a);
        }
        System.out.println(kq);
    }
}
