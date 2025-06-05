package kadai_028;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	private HashMap<String, String> rps;
	
	
	public Jyanken_Chapter28() {
		rps = new HashMap<>();
		rps.put("r", "グー");
		rps.put("p", "パー");
		rps.put("s", "チョキ");
	}

	public String getMyChoice() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String input = scanner.next();
		scanner.close();
		
		return input;
	}
	
	public String getRandom() {
		String[] hands = {"r", "p", "s"};
		Random rand = new Random();
        int index = rand.nextInt(hands.length);
        return hands[index];
	}
	
	public void playGame() {
		String myHand = getMyChoice();
		String randHand = getRandom();
		
		System.out.println("あなたの手は" + rps.get(myHand) + "、対戦相手の手は" + rps.get(randHand));
		
		if(myHand.equals(randHand)) {
			System.out.println("あいこです");
		} else if((myHand.equals("r") && randHand.equals("s") ||
				 myHand.equals("p") && randHand.equals("r") ||
				 myHand.equals("s") && randHand.equals("p"))){
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
			
	}
}
