/*
問題.for文を使用し、以下のプログラムを作成してください。
	①変数iに1を代入
	②変数iに2ずつ足す処理を10回繰り返す。
		出力結果：  3
					5
					7
					9
					・
					・
					・
					21
					*/
package lesson10;

public class practice {

	public static void main(String[] args) {
		int i =1;
		for(i=1; i<=21; i+=2) {
		//値が21(条件式)に当てはまるまで実行される処理
			System.out.println(i);
		}
	}
}