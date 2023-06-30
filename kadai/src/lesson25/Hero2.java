package lesson25;
import java.util.Random;

public class Hero2 extends Hero {
	
	//数値を毎回変える為の定義
	//HPとMPは500～999の間で表示させるように定義
	
	Random rand = new Random();
	int HP =rand.nextInt(500)+500;
	int MP =rand.nextInt(500)+500;
	int attack =rand.nextInt(300);
	int speed = rand.nextInt(300);
	int defense = rand.nextInt(300);
	
	//オーバーライド（上書き内容）
	public void display(){
		System.out.println("こんにちは「"+getName()+"」さん");
		System.out.println(super.message1);
		System.out.println("HP："+this.HP);
		System.out.println("MP："+this.MP);
		System.out.println("攻撃力："+this.attack);
		System.out.println("素早さ："+this.speed);
		System.out.println("防御力："+this.defense);
		System.out.println("");
		System.out.println(super.message2);
	}
}
