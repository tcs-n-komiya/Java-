package test;

public class primenumber {

	public static void main(String[] args) {
		// 1から100までの素数
		for (int i = 2; i <= 100; i++) {
			boolean prim = true;

		// 2からiの平方根までの数で割り切れるか確認
			for(int j = 2;j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					prim = false;
					break; //割り切れる場合は素数でないためループ終わり
				}

			}
			//素数の場合表示
			if(prim) {
				System.out.println(i);
			}
		}

	}

}
