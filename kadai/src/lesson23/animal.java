package lesson23;

public class animal {
	
	//フィールドの宣言
	private String name;
	private double length;
	private int speed;	
	
	//nameのセッターの宣言
	public void setName(String name) {
		this.name = name;
	}
	
	//nameのゲッターの宣言
	public String getName(){
		System.out.println("動物名:"+this.name);
		return this.name;
	}
	
	//lengthのセッターの宣言
	public void setLength(double length) {
		this.length = length;
	}	
	
	//lengthのゲッターの宣言
	public double getLength(double length) {
		this.length = length;
		System.out.println("体長:"+this.length);
		return this.length;
	}
	
	//speedのセッターの宣言
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//speedのゲッターの宣言
	public int getSpeed(int speed) {
		System.out.println("速度:"+this.speed+"km/m");
		return this.speed;
	}
	
	
}
