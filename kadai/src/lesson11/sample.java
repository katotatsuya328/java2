package lesson11;
/*
問題．switch文を使用し、以下のプログラムを作成してください。
		変数に数値を代入
		
	①2の場合は、「（変数）月は28日です。」
		出力結果：2月は28日です。
		
	②4，6，9，11の場合は、「（変数）月は30日です。」
		出力例：4月は30日です。
		
	③その他の場合は、「（変数）月は31日です。」
		出力例：1月は31日です。
*/
public class sample {

public static void main(String[] args) {
	
	int num =4;
	
	switch(num) {
	
	case 2:
		//条件式のnumの値が2だった場合、実行。
		System.out.println(num+"月は28日です。");
		break;
		
	case 4,6,9,11:
		//条件式のnumの値が4,6,9,11だった場合、実行。
		System.out.println(num+"月は30日です。");
		break;
		
	default:
		//条件式のnumの値がいずれもあてははまらない場合、実行。
		System.out.println(num+"月は31日です。");
		break;
		
//	}
	}    
}
}