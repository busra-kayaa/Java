package Paket;

import java.util.ArrayList;

public interface IUrun_2207 {
	public void UrunStokGuncelle(ArrayList<Beverages_2207> beveragesList, ArrayList<Condiments_2207> condimentsList,
			ArrayList<Confections_2207> confectionsList, ArrayList<DairyProducts_2207> dairyProductsList,
			ArrayList<Cereals_2207> cerealsList,int kategori,int adet, boolean GirisMi,String islemYapilacakUrun);
	
	public void UrunIsımGuncelle(ArrayList<Beverages_2207> Beverageslist, ArrayList<Condiments_2207> Condimentslist,
			ArrayList<Confections_2207> Confectionslist, ArrayList<DairyProducts_2207> DairyProductslist,
			ArrayList<Cereals_2207> GrainsCerealslist, int kategori,String isim, String yeniIsim, String yeniDetay);
	
    public  void UrunSil(ArrayList<Beverages_2207> Beverageslist, ArrayList<Condiments_2207> Condimentslist,
			ArrayList<Confections_2207> Confectionslist, ArrayList<DairyProducts_2207> DairyProductslist,
			ArrayList<Cereals_2207> GrainsCerealslist, int kategori,String isim);
    
	public void YeniUrunEkle(ArrayList<Beverages_2207> Beverageslist,ArrayList<Condiments_2207> Condimentslist,
			ArrayList<Confections_2207> Confectionslist, ArrayList<DairyProducts_2207> DairyProductslist,
    		ArrayList<Cereals_2207> GrainsCerealslist, int kategori,String Adi,
    		String BirimAgirligi,double BirimFiyatı,int StokMiktari,String Detay);
}
