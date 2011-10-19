public class LatihanDaoImpl implements LatihanDao{
	public void save (Latihan l){
		System.out.println("menyimpan latihan");
	}
	public void delet(Latihan l){
		System.out.println("menghapus latihan");
	}
	public Latihan getById(Long id){
		Latihan l = new Latihan ();
		l.setId(id);
		l.setNama("abc");
		return l;
	}
}