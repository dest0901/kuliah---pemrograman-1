public class Belajar{
	private String nama;
	public static void main(String[] args){
		Belajar test;
		test = new Belajar();
		test.setNama("andi");
		byte b = 100;
		short s = 100;
		
		Belajar belajarVariabel = test;
		belajarVariabel.setNama("belajar variabel");
		
		
		System.out.println(b + s);
		System.out.println("nama : " + test.getNama() + " " + b);
	}
	public void setNama(String aNama){
		this.nama = aNama;
	}
	public String getNama(){
		return this.nama;
	}
}