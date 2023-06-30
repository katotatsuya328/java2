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
	
	//nameのセッター、ゲッターの定義
public void setName(String n){
	name = n;
}

public String getName(){
	return name;
}

	//HPのセッター、ゲッターの定義
public void setHP(int H){
	HP = H;
}

public int getHP(){
	return HP;
}

	//MPのセッター、ゲッターの定義
public void setMP(int M){
	MP = M;
}

public int getMP(){
return MP;
}

	//attackのセッター、ゲッターの定義
public void setattack(int A){
	attack = A;
}

public int getattack(){
	return attack;
}

	//speedのセッター、ゲッターの定義
public void setspeed(int S){
	speed = S;
}

public int getspeed(){
	return speed;
}
	
	//defenseのセッター、ゲッターの定義
public void setdefense(int D){
	speed = D;
}

public int getdefense(){
	return defense;
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