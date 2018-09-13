
public class Main {	
	public static void main(String[] args) {

	
		System.out.println("\n\n________________Hinh Chu Nhat__________________");
		HinhChuNhat hcn = new HinhChuNhat(4,5);
		hcn.htThongTin("Chu Nhat");
		
		System.out.println("\n\n________________Hinh Chu Vuong__________________");
		HinhVuong hv = new HinhVuong(3, 3);
		hv.htThongTin("Vuong");
		
		
		System.out.println("\n\n________________Hinh Tam Giac__________________");
		HinhTamGiac htg = new HinhTamGiac();
		
		
		System.out.println("Chu vi tam giac: "+htg.Chuvi(1, 2, 3));
		System.out.println("Dien tich tam giac: "+htg.Dientich(1, 2, 3));

		
		
	}
 
}