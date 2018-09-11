import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        int canh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài cạnh hình vuông: ");
        canh = sc.nextInt();
         
        hinhVuong hinhVuong = new hinhVuong(canh);  
        System.out.println("Chu vi hình vuông = " + hinhVuong.tinhChuVi());
        System.out.println("Diện tích hình vuông = " + hinhVuong.tinhDienTich());
    }
 
}