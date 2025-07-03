package test;
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // コンソール入力を受け取る

        System.out.print("西暦を入力してください: ");
        String input = scanner.nextLine();//文字列で受け取る

        try {
            int year = Integer.parseInt(input);//数的処理をしたい

            if (year < 0) {
                System.out.println("エラー: 年に負の数は指定できません");
            } else if (LeapYear(year)) {
                System.out.println(year + "年はうるう年です");
            } else {
                System.out.println(year + "年はうるう年ではありません");
            }

        } catch (NumberFormatException e) {
            System.out.println("エラー: 数字で年を入力してください");
        }


    }

    // うるう年判定メソッド
    public static boolean LeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
