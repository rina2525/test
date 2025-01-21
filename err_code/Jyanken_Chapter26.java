package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		
		String rock = "r";
		String scissors = "s";
		String paper = "p";
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		
		
		//scanerクラスオブジェクト
		Scanner scanner = new Scanner(System.in);

    //エラー発生個所！ここでwhile分に変更し正しい入力が得られるまでループしています
		String input = scanner.next();	
		
		
		if(input.equals(rock)) {
			return input;
			
		}else if(input.equals(scissors)) {
			return input;
			
		}else if(input.equals(paper)) {
			return input;
			
		}else {
			System.out.println("じゃんけんの手が正しくありません再度入力してください");
			
		}
		
		System.out.println(input);
		scanner.close();
	}
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] word = new String[]{"r,s,p"};
		
		for(int i = 0; i < 3; i++) {
		 int random =Math .floor(Math.random()*3);
			
			return word[i];
		}
		
	}
	//じゃんけんを行う
	public void playGame() {
		HashMap<String,String>output = new HashMap<>();
		output.put("r", "グー");
		output.put("s", "チョキ");
		output.put("p","パー");
		
		String MyChoice = getMyChoice();
		String Random = getRandom();
		
		System.out.println("自分の手は"+output.get(MyChoice)+"愛泉相手の手は"+output.get(Random));
		
		if(MyChoice.equals(Random)) {
			System.out.println("あいこです");
			
		}else if((MyChoice.equals("r")&& Random.equals("s"))||
		        (MyChoice.equals("s")&& Random.equals("p"))||
		        (MyChoice.equals("p")&& Random.equals("r"))){
			System.out.println("自分の勝ちです");
			
		}else {
			System.out.println("自分の負けです");
		}
		
			
	}
}
