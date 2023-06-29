package lesson25;

public class Hero {

	//コンストラクターの定義
	private String name;
	String message1 = "ステータス";
	String message2 = "さあ冒険に出かけよう！";
	int HP = 1000;
	int MP = 1000;
	int attack = 300;
	int speed = 300;
	int defense = 300;
	
public void setName(String n){
	name = n;
}

public String getName(){
	return name;
}

public void display(){
	
	System.out.println("こんにちは「"+name+"」さん");
	System.out.println(message1);
	System.out.println("HP："+this.HP);
	System.out.println("MP："+this.MP);	
	System.out.println("攻撃力："+this.attack);
	System.out.println("素早さ："+this.speed);
	System.out.println("防御力："+this.defense);
	System.out.println(message2);
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