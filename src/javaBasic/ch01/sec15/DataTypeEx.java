package javaBasic.ch01.sec15;

public class DataTypeEx {

	public static void main(String[] args) {
		int kor = 80;
		int math = 90;
		int eng = 100;
		
		int sum = kor + math + eng;
		System.out.println("ÇÕ°è : " + sum);
		
		double avg = sum / 3.0;
		System.out.println("Æò±Õ : " + avg);

		char ch1 = 'a';
		System.out.println((char)(ch1 + 3));
		
		System.out.printf("%c%c%c%c%c", 75, 111, 114, 101, 97);
	}

}
