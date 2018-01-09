package ch06Exercise;

//ΩÃ±€≈Ê øπ¡¶
public class ShopService {
	private static ShopService shopservice = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance(){
		return shopservice;
	}

}
