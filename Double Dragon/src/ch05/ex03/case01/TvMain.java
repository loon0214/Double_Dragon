package ch05.ex03.case01;

public class TvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv myTv = null;
		myTv = new Tv();
		myTv.setChannel(7);
		myTv.setPower(true);
		myTv.setColor("red");
		
		myTv.channelUp();
		System.out.println("channel: " + myTv.getChannel());
		myTv.channelDown();
		System.out.println("channel: " + myTv.getChannel());

	}

}
