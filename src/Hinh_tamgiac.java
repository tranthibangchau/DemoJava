import java.util.Scanner;

public class Hinh_tamgiac {
	public static void main (String [] args){
		int a, b, c;
		float p, s;
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap chieu dai canh thu nhat:");
		a = sc.nextInt();
		System.out.println("Nhap chieu dai canh thu hai:");
		b = sc.nextInt();
		System.out.println("Nhap chieu dai canh thu ba:");
		c = sc.nextInt();
		p = Chuvi (a, b, c);
		s = Dientich (a, b, c);
		System.out.println("Chu vi tam giac: "+p);
		System.out.println("Dien tich tam giac: "+s);

	}
	public static float Chuvi (int a, int b, int c){
		return (a+b+c);
	}
	public static float Dientich (int a, int b, int c){
		float ncv, s;
		ncv = (a+b+c)/2;
		s =(float)Math.sqrt(ncv*(ncv-a)*(ncv-b)*(ncv-c));
		return s;
	}
}
