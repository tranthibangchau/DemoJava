
public class Hinh {
	public float canh1;
	public float canh2;
	
	public Hinh(float canh1, float canh2) {
		this.canh1 = canh1;
		this.canh2 = canh2;
	}

	public float getCanh1() {
		return canh1;
	}

	public void setCanh1(float canh1) {
		this.canh1 = canh1;
	}

	public float getCanh2() {
		return canh2;
	}

	public void setCanh2(float canh2) {
		this.canh2 = canh2;
	}

	public float tinhChuVi() {
		return (this.canh1 + this.canh2) * 2;
	}

	public float tinhDienTich() {
		return this.canh1 * this.canh2;
	}


	public void htThongTin(String hinh) {
		System.out.println("Toi la hinh: " + hinh);
		System.out.println("Hinh co canh thu nhat: " + this.canh1 + " va canh thu hai: " + this.canh2);
		System.out.println("- Chu vi cua hinh: " + tinhChuVi());
		System.out.println("- Dien tich cua hinh: " + tinhDienTich());
	}

}
