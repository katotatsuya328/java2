package lesson23;

public class Main {
	public static void main(String[] args) {
		animal Lion = new animal();
		Lion.setName("ライオン");
		Lion.setLength(2.1);
		Lion.setSpeed(80);
		
		Lion.getName();
		Lion.getLength(2.1);
		Lion.getSpeed(1);
		
	}
}

/*
	
	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
	動物名：ライオン
体長：2.1m
速度：80km/h
	
*/