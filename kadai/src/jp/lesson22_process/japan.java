package jp.lesson22_process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class japan{
	
	//フィールドの初期値の宣言
	String sushi = "寿司";
	String country = "日本";
	String jpfood ="和食";
	
	public void sayHello() {
		System.out.println("こんにちは！ここは"+this.country+"です！");
	}
	
	public void sayDelicious() {
		System.out.println("この"+this.sushi+"はうまい");		
	}
	
	public void JapanFood() {
		System.out.println(this.sushi+"は"+this.jpfood+"です");
	}
	
	public void nowTime() {
		LocalDateTime current = LocalDateTime.now();
		System.out.println("今の現在日時は"+
				DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss", Locale.JAPANESE)
				.format(current)+"です");
		}
}


