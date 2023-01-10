package ex02_two_dim;

public class Ex01_array {

	public static void ex01() {
		
		// 2차원 배열 선언
		int[][] arr;
		
		// 2차원 배열 생성
		arr = new int[3][2]; // 3행2열 (길이가 2인 배열 3개)
		
		// 2차원 배열 순회 : 행 우선 방식으로 순회한다 (글 읽듯이 가로로 읽고 다 읽으면 다음 행 읽음)
		for(int i=0; i<arr.length; i++) { // i : 행 번호
			for(int j=0; j<arr[i].length; j++) { // j : 열 번호
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

	public static void ex02() {
		
		// 2차원 배열의 선언 + 생성 
		int[][] arr = new int[3][2];
		
		// 길이 확인
		System.out.println(arr.length); // 1차원 배열의 갯수 (행의 갯수)
		System.out.println(arr[0].length); // 1행 배열
		System.out.println(arr[1].length); // 2행 배열
		System.out.println(arr[2].length); // 3행 배열
		
		for(int i=0; i<arr.length; i++) { 
			for(int j=0; j<arr[i].length; j++) { 
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

	public static void ex03() {
		
		// 2차원 배열 선언
		int[][] arr;
		
		// 2차원 배열 생성(행만)
		arr = new int[3][];
		
		// 각 행의 열을 생성
		arr[0] = new int[5];
		arr[1] = new int[3];
		arr[2] = new int[2];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		
	}
	
	public static void ex04() {
		
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		for(int i=0; i<arr.length; i++) { // i : 행 번호
			for(int j=0; j<arr[i].length; j++) { // j : 열 번호
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ex04();
		
	}

}
