/*
 Tính tiền đi taxi từ số km nhập vào. Biết: 
a. 1 km đầu giá 15000đ 
b. Từ km thứ 2 đến km thứ 5 giá 13500đ 
c. Từ km thứ 6 trở đi giá 11000đ 
d. Nếu trên 120km được giảm 10% tổng tiền. 

 */
package cautrucrenhanh;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap05 {
    public static void main(String[] args) {
        double km, tientra = 0;
        Scanner sc = new Scanner (System.in);
        System.out.print ("Nhap so km: ");
        km = sc.nextDouble();
        if (km <= 1)
        {
            tientra = 15000;
        }
        else if (km <= 5)
        {
            tientra = 15000 + (km - 1) * 13500;
        }
        else if (km >= 6)
        {
            tientra = 15000 + 4 * 13500 + (km - 5) * 11000;
        }
        
        if (km >= 120)
        {
            tientra = tientra * 0.9;
        }
        System.out.print(tientra);
    }
}
