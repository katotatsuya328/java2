
//	string型の配列を作成し、アルファベットa～jまでを格納してください。
//	brake文を使用し、a～dまで表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	          
//	continue文を使用し、i以外を表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	           e
//	           f
//	           g
//	           h
//	           j

package lesson14;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String [] al= {"a","b","c","d","e","f","g","h","i","j"};
		
		for(int i =0; i < al.length; i++) {
		//もしiの値が4になったら、ループ強制終了する
			if(i==4) {
			break;	
		}
		System.out.println(al[i]);
	}
		
		//わかりやすくするための空白の行
		System.out.println("");
		
		for( int i =0; i < al.length; i++) {
			//もしiの値が8になったら、処理をスキップする
				if(i==8) {
				continue;	
			}
			System.out.println(al[i]);
	}
}
}

	

