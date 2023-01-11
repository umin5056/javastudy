public class GoodyTest {
	
	public static void ex01(int serial) {
		
		while(serial > 6)	{
			serial /= 10;
		}
		
		if(serial % 2 == 0) {
			System.out.println("여자입니다.");
		}else
		System.out.println("남자입니다.");
	}
	
	public static void ex02() {
		
		for(int a=2; a<6; a++) {
				for(int b=1; b<10; b++) {
					System.out.println(a + "*" + b + "=" + a*b);
					if( a==5 && b==5 ) break;
				}
				
			}
		}
	
	public static void ex03() {
		
		int oddSum = 0;
		int evenSum = 0;
		
		for(int a = 1; a<101; a++) {
			if(a % 2 == 0) {
				evenSum += a;
			} else {
				oddSum += a;
			}
		}
		
		System.out.println("짝수 합은" + evenSum + "입니다.");
		System.out.println("홀수 합은" + oddSum + "입니다.");
		
	}

	public static void main(String[] args) {
		
		ex01(5);
		System.out.println();
		ex02();
		System.out.println();
		ex03();
		
	}

}
