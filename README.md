
public class VendingMachine {

	// 売上金額（累積）
	int totalSales;

	// 商品の在庫数（例として1種類のみ）
	int stock;

	// 商品の値段
	int price;

	// 現在のつり銭額
	int change;

	// ユーザーが投入した金額
	int insertedAmount;

	// コンストラクタ
	public VendingMachine(int totalSales, int stock, int price, int change, int insertedAmount) {
		this.totalSales = 0;
		this.stock = stock;
		this.price = price;
		this.change = 0;
		this.insertedAmount = 0;
	}

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();

	}

}
