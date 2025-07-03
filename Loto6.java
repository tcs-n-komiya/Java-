package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Loto6 {
	public static void main(String[] args) {
		// 1～43までの数字をリストに格納
		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= 43; i++) {
			numbers.add(i);
		}

		// リストをシャッフルしてランダム順に
		Collections.shuffle(numbers);

		// 最初の6個を取り出して表示
		System.out.println("抽選された6つの数字:");
		for (int i = 0; i < 6; i++) {
			System.out.print(numbers.get(i) + " ");
		}
	}
}
