package lesson17_18;

import java.util.Random;

public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	
		//Helloにメソッド引数を入れて画面出力
	public static void hello(String Hello ,int x) {
		System.out.println(Hello+" "+x);
		System.out.println("");
		}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void add(int x,int y){
		//addメソッドに引数を入れて計算して画面出力
		System.out.println(x * y);
		System.out.println("");
	}
	
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください。
	public static void printArray(int num){
		//変数arrayの中に配列を入れ、配列の数を画面出力
		
		int [] array = {100,200,300};
		
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]++);
		}
		System.out.println("");
	}
	
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	
	public static void add(double x,double y){
		
		//int型からdouble型に変換して小数を受け取って画面表示
		double result = x+y;
		System.out.println(result);
		System.out.println("");
	}
		
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	
	public static int[] random(int number) {
		
		Random math = new Random();
		//配列の変数名をRandomMix[]にする。
		int RandomMix[] = new int[number];
		
		//引数の回数文作られたランダムな数字を順番にコンソールで出力
		for(int con=0; con < RandomMix.length; con++) {
			System.out.println(RandomMix[con] = math.nextInt(100)+1);
		//xの値に+1で表示を1～100にする。
		}
		System.out.println("");
		//格納した値を返す
		return RandomMix;
		// ※0は出力＆格納しないようにしてください。

	}
	
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	//	 ※小数点以下も表示されるようにしてください。
	
	public static double average(int[] RandomMix) {
		
		//平均値を求めるためにRandomMixの中に足し算する
		double Total = 0;
		for(int number : RandomMix) {
			Total += number;
		}
		
		//戻り値（足し算）の合計をlengthを使って配列の数を割る
		double num = Total/RandomMix.length;
//		double numInteger = Double.valueOf(num);
		
		//平均値のコンソールを出力する
		System.out.println(num);
		System.out.println("");
		//平均値を返す
		return num;
	}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	public static boolean bool(double num) {
		if(num > 50) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください	

	hello("Hello JavaSE",11);// Q1

	add(2,1000);// Q2
	
	printArray(1);// Q3
	
	add(1.5,2.3);// Q4

	int[] ave = new int[5];
	ave=random(5);// Q5
	
	double averageResult = average(ave);// Q6
	
	System.out.println(bool(averageResult));	//Q7
	
	}
}