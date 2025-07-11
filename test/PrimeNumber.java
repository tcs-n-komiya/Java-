//package test;
//
//public class primenumber {
//
//	public static void main(String[] args) {
//		// 1から100までの素数
//		for (int i = 2; i <= 100; i++) {
//			boolean prim = true;
//
//		// 2からiの平方根までの数で割り切れるか確認
//			for(int j = 2;j <= Math.sqrt(i); j++) {
//				if(i % j == 0) {
//					prim = false;
//					break; //割り切れる場合は素数でないためループ終わり
//				}
//
//			}
//			//素数の場合表示
//			if(prim) {
//				System.out.println(i);
//			}
//		}
//
//	}
//
//}
package test;

public class PrimeNumber {

	public static void main(String[] args) {
		int StartNumber = 1;//初めの数
		int EndNumber = 100;//終わりの数
		showPrimeNumber(StartNumber, EndNumber);//素数を表示する
	}

	//指定範囲の素数を表示するメソッド
	public static void showPrimeNumber(int start, int end) {

		for (int number = start; number <= end; number++) {
			if (isPrimeNumber(number)) {
				System.out.println(number);//素数なら表示する
			}

		}
	}

	//数字が素数かどうか調べるメソッド
	public static boolean isPrimeNumber(int number) {
		if (number <= 1) {
			return false;//1以下は素数じゃない

		}
		//調べる範囲はその数の平方根まで
		int limit = (int) Math.sqrt(number);

		for (int i = 2; i <= limit; i++) {
			if (number % i == 0) {
				return false;//割り切れたら素数じゃない

			}
		}
		return true;
	}

}