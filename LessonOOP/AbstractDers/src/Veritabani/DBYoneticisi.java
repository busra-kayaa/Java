package Veritabani;

public class DBYoneticisi {

	DB db;

	public DBYoneticisi(DB db) {
		super();
		this.db = db;
	}
	
	public void Connect() {
		db.Baglan();
	}
	public void Delete() {
		db.VeriSil();
	}
}
