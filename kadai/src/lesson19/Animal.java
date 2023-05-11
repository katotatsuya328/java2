package lesson19;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Animal {
	
	public static void main(String[] args) {
		
//	Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		
		Dog dog = new Dog();		
		System.out.println(dog.name);
		
//	Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		
		Dog d =new Dog();
		System.out.println(d.num);
		
// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		
		//nowメソッドを呼び出して、LocalDateTimeのオブジェクトを取得
		LocalDateTime current = LocalDateTime.now();
		
		System.out.println(
		//DateTimeFormatterクラスのofPatternメソッドを呼び出し、Localeで国別の単位を設定
				DateTimeFormatter.ofPattern(
						"yyyy-MM-dd H:m:s", Locale.JAPANESE)
				.format(current));
	}
}
