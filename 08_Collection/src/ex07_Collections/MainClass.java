package ex07_Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainClass {

	public static void printList(List list) {
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			Object num = itr.next();
			System.out.print(num);
			if(num != list.get(list.size()-1)) {
				
				System.out.print("->");
			}
		}
		
//		System.out.println();
		// 강사님 방
//		for(int i=0; i<list.size() - 1; i++) {
//			System.out.print(list.get(i) + "->");
//		}
//		System.out.print(list.get(list.size()-1));
		
	}
	
	public static void main(String[] args) {

		
		
		List<Integer> list = Arrays.asList(5,2,3,1,4);
		
		printList(list); // 결과 : 5->2->3->1->4
		
		Collections.sort(list); // 오름차순 정렬
		
		System.out.println();
		printList(list);
		
		System.out.println();
		int idx = Collections.binarySearch(list, 4);
		System.out.println(idx);
		
		if(idx >= 0) {
			System.out.println("찾았다.");
		}else {
			System.out.println("못찾았다.");
		}
		
		
	}

}
