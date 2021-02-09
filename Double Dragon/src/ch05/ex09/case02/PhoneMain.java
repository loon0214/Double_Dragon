package ch05.ex09.case02;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone(1000);
		Phone phone4 = new Phone();
		
		System.out.printf("telephone1: %d\n", phone1.getSerialNo());
		System.out.printf("telephone2: %d\n", phone2.getSerialNo());
		System.out.printf("telephone3: %d\n", phone3.getSerialNo());
		System.out.printf("telephone4: %d\n", phone4.getSerialNo());
	}
}
