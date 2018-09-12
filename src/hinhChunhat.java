
public class hinhChunhat {
	protected int chieuDai, chieuRong;
	public hinhChunhat(){
		
	}
    public hinhChunhat(int chieuDai, int chieuRong) {
        super();
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
 
    public int tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }
     
    public int tinhDienTich() {
        return chieuDai * chieuRong;
    }
}
