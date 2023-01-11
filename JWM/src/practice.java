import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class practice {
	public static void main(String[] args) {
		  // 로또번호 1~45 중복되지 않는 정수 6개를 출력하자.
	      // 1.배열로 구현
	      // 2.List자료구조 구현
	      // 3.Set자료구조 구현 new TreeSet<Integer>(); => add()
	      // System.out.println(set);

	      int rotto[] = new int[6]; // 배열만들기

	      System.out.println("배열");
	      for (int i = 0; i < rotto.length; i++) { // 배열의 길이만큼
	         rotto[i] = (int) (Math.random() * 45) + 1; // rotto[i]에 난수 생성
	         for (int j = 0; j < i; j++) { // 들오오는값이 있던값이랑 같다면 들어오늘값을 빼준다
	            if (rotto[i] == rotto[j]) {
	               i--; 
	            }
	         }
	      }
	      for (int i = 0; i < rotto.length; i++) {
	         System.out.print(rotto[i] + ",");
	      }
	      System.out.println();
	      System.out.println("List자료구조");

//	      ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	      List<Integer> list = new LinkedList<Integer>();

	      for (int i = 0; i < 6; i++) { 
	         list.add((int) (Math.random() * 45) + 1);
	         for (int j = 0; j < i; j++) {
	            if (list.get(i) == list.get(j)) {
	               i--;
	               list.remove(j);
	            }
	         }
	      }
	      for (int i = 0; i < list.size(); i++) {
	         System.out.print(list.get(i) + ",");
	      }

//	      ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	      System.out.println();
	      System.out.println("Set자료구조");

	      Set<Integer> set = new TreeSet<Integer>();
	      while (true) {
	         int ran = (int) (Math.random() * 45) + 1;
	         set.add(ran);
	         if (set.size() == 6) {
	            break;
	         }
	      }
	      System.out.println(set);
	      
	      System.out.println("Set");
	
	      Set<Integer> set1 = new TreeSet<Integer>();
	      while (set1.size() < 6) {
	         int ran = (int) (Math.random() * 45) + 1;
	         set1.add(ran);
	      }
	      System.out.print(set1);
	   }
	}