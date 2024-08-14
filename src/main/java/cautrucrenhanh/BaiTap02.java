/*
 Nhập vào điểm 3 môn toán, văn, anh của 1 học sinh, viết chương trình đưa  ra xếp loại của học sinh đó theo điểm trung bình như sau: 
– [0, 4.0): Yếu 
– [4.0, 6.5): Trung bình 
– [6.5, 8.0): Khá 
– [8.0, 10]: Giỏi 

 */
package cautrucrenhanh;

import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class BaiTap02 {
    public static void main(String[] args) {
            double toan, van, anh, diemtb;
            String kq = "";
            Scanner sc = new Scanner (System.in);
            System.out.print("Nhap diem mon toan: ");
            toan = sc.nextDouble();
            System.out.print("Nhap diem mon van: ");
            van = sc.nextDouble();
            System.out.print("Nhap diem mon anh: ");
            anh = sc.nextDouble();
            
            diemtb = (toan + van + anh) / 3;
            
            if (diemtb < 4)
            {
                kq = "Yeu";
            }
            else if (diemtb < 6.5)
            {
                kq = "Trung binh";
            }
            else if (diemtb < 8)
            {
                kq = "Kha";
            }
            else
            {
                kq = "Gioi";
            }
            
            System.out.println("Diem trung binh: " + diemtb);
            System.out.print(kq);
    }
}
