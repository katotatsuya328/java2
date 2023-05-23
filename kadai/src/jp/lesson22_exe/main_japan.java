package jp.lesson22_exe;

import jp.lesson22_process.japan;

public class main_japan {
	
	public static void main (String[] args) {
		
		//sushiクラスのsayHelloメソッドの呼び出し
		japan country = new japan();
		country.sayHello();
		
		//sushiクラスのsayDeliciousメソッドの呼び出し
		japan sushi = new japan();
		sushi.sayDelicious();

		//sushiクラスのJapanFoodメソッドの呼び出し
		japan jpfood = new japan();
		jpfood.JapanFood();
		
		//sushiクラスのnowTimeメソッドの呼び出し
		japan now = new japan();
		now.nowTime();
	}
}

/*

下記がコンソールに出力されるように作成してください

	こんにちは！ここは日本です！
	この寿司はうまい
	寿司は和食です
	今の現在日時は2023/03/09 10:23:39です

【条件】
	・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
	・適切なファイルにフィールドで変数を必要な数作ってください。
	・thisを使って作成してください。
	・日時は今日の日付を取得してください。
	
*/