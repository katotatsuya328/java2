package lesson25;

public class Main {
	
	public static void main(String[] args ) {
		
		System.out.println("あなたの名前を入力して下さい");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String name = scanner.nextLine();
        
		//オーバーライド後
		Hero2 stutas  = new Hero2();
		stutas.setName(name);
		stutas.display();
		scanner.close();
}

}

/*

名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください  							
	 	 サブクラスを使用してください										
	 	 メソッドのオーバーライドを使用してください							
		 superクラスを使用してください										
		 getterとsetterを使用してください									
		 packageを2つ作ってメインと処理を分けてください					
		 命名する場合は規則にのっとってください								
		 コンストラクタを使用してください									

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

*/