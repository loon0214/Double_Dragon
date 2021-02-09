package ch06.ex05.case11;

public class Tesla implements SmartCar {
	private SmartCar software;
	
	public Tesla(SmartCar software) {
		this.software = software;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		software.start();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		software.stop();

	}

	@Override
	public void klaxon() {
		// TODO Auto-generated method stub
		software.klaxon();

	}

}
