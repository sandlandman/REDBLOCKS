
public class Game {

	private String title;
	private String genre;
	private String platForm;
	private int inventory;
	private int productID;

	Game(String title, String genre, String playForm, int inventory, int productID ) {

	this.title = title;
	this.genre = genre;
	this.platForm = platForm;
	this.inventory = inventory;
	this.productID = productID;

	}

	public String getTitle() {

		return title;
	}

	public String getGenre() {

		return genre;
	}

	public String getPlatForm() {

		return platForm;
	}

	public int getInventory() {

		return inventory;
	}

	public int getProductID() {

		return productID;
	}

}
