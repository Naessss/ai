package javaBasic.ch01.sec12;

public class Calculator {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		int basicPay = 50000;
		String phoneNumber = "010-1234-5678";
		String accountNumber = "���� 123-12-12345";
		String dept = "�˹ٻ�";
		boolean sex = true;
		double tax = 0.03;
		
		System.out.println("---1�� �˹ٻ� ����---");
		System.out.println(name + " " + basicPay + " " + phoneNumber + " "
				+ accountNumber + " " + dept + " " + sex + " " + tax);
		
		String name2 = "�̰��";
		int basicPay2 = 15000;
		String phoneNumber2 = "010-987-7456";
		String accountNumber2 = "���� 123-555-7878";
		String dept2 = "����";
		boolean sex2 = false;
		double tax2 = 0.015;
		
		System.out.println("---2�� �˹ٻ� ����---");
		System.out.println(name2 + " " + basicPay2 + " " + phoneNumber2 + " "
				+ accountNumber2 + " " + dept2 + " " + sex2 + " " + tax2);
		
		String name3 = "�̼���";
		int basicPay3 = 20000;
		String phoneNumber3 = "010-234-4567";
		String accountNumber3 = "�츮 321-32-4321";
		String dept3 = "������";
		boolean sex3 = true;
		double tax3 = 0.02;
		
		System.out.println("---3�� �˹ٻ� ����---");
		System.out.println(name3 + " " + basicPay3 + " " + phoneNumber3 + " "
				+ accountNumber3 + " " + dept3 + " " + sex3 + " " + tax3);
		
		String name4 = "������";
		int basicPay4 = 10000;
		String phoneNumber4 = "010-8744-3334";
		String accountNumber4 = "���� 555-65-8989";
		String dept4 = "����";
		boolean sex4 = false;
		double tax4 = 0.025;
		
		System.out.println("---4�� �˹ٻ� ����---");
		System.out.println(name4 + " " + basicPay4 + " " + phoneNumber4 + " "
				+ accountNumber4 + " " + dept4 + " " + sex4 + " " + tax4);
		
		String name5 = "�ּ���";
		int basicPay5 = 9800;
		String phoneNumber5 = "010-333-7777";
		String accountNumber5 = "īī�� 777-454-1231";
		String dept5 = "��������";
		boolean sex5 = false;
		double tax5 = 0.05;
		
		System.out.println("---5�� �˹ٻ� ����---");
		System.out.println(name5 + " " + basicPay5 + " " + phoneNumber5 + " "
				+ accountNumber5 + " " + dept5 + " " + sex5 + " " + tax5);
		
		
		System.out.println("---�����޾�---");
		System.out.println("1�� : " + basicPay * 10 * (1 - tax));
		System.out.println("2�� : " + basicPay2 * 15 * (1 - tax2));
		System.out.println("3�� : " + basicPay3 * 20 * (1 - tax3));
		System.out.println("4�� : " + basicPay4 * 25 * (1 - tax4));
		System.out.println("5�� : " + basicPay5 * 30 * (1 - tax5));
	}

}
