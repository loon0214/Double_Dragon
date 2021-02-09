package ch07.ex02.case20;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bumblebee autobot1 = new Bumblebee();
		Prime autobot2 = new Prime();
		List<Autobot> corps = new ArrayList<>();
		corps.add(autobot1);
		corps.add(autobot2);
		
		for(Autobot autobot:corps) {
			autobot.run();
			autobot.fight();
	//		autobot.guard();
			if(autobot instanceof Bumblebee) ((Bumblebee) autobot).guard();
			if(autobot instanceof Prime) ((Prime) autobot).command();
			System.out.println();
		}

	}

}
