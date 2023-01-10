package ex01_one_dim;

public class Ex03_advanced_for {

	public static void ex01() {
		
		int[] scores = {50,90,60,100,80};
		
		int total = 0;
		int max = 0;
		int min = 100;
		
		for(int i : scores) {
			
			total += i;
			
			if(max < i) {
				max = i;
			}
			
			if(min > i) {
				min = i;
			}
			
		}
		
		System.out.println(total);
		System.out.println(max);
		System.out.println(min);
		
	}

	public static void ex02() {
		
		String[] files = {"hello.txt", "hi.txt", "안녕.txt"};
		
		for(String str : files) {
			System.out.println(str);
		}
		
	}
	
	public static void main(String[] args) {

		ex01();
		
	}

}
