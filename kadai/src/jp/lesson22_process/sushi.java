package jp.lesson22_process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class sushi{
	
	//フィールドの初期値の宣言
	String food = "寿司";
	
	public static void sayHello() {
		System.out.println("こんにちは！ここは日本です！");
	}
	
	public static void sayDelicious() {
		System.out.println("この寿司はうまい");		
	}
	
	public void JapanFood() {
		System.out.println(this.food+"は和食です");
	}
	
	public void nowTime() {
		LocalDateTime current = LocalDateTime.now();
		System.out.println("今の現在日時は"+
				DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss", Locale.JAPANESE)
				.format(current)+"です");
		}
}


