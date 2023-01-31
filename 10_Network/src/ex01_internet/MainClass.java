package ex01_internet;

import java.net.MalformedURLException;
import java.net.URL;

public class MainClass {
	
	/*
	   URL (Uniform Rosource Locator)
	   1. 정형화된 자원의 경로
	   2. 실제로는 웹 주소를 의미한다.
	   3. 구성  
	      프로토콜://      호스트	   /   서버 경로  ? 파라미터 = 값 & 파라미터 = 값
	       https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EC%82%BC%EC%84%B1%EC%A0%84%EC%9E%90
	 	  1) 프로토콜 : 통신규약, https(secure + http : 보안 처리된 하이퍼텍스트 전송 프로토콜)
	 	  2) 호스트	: 서버의 대표 주소
	 	  3) 서버경로	: URL Mapping(URL Pattern)
	 	  4) 파라미터	: 서버로 보내는 데이터 (변수라고 생각하면 됨)
	 
	 */
	
	public static void ex01() {
		
		String apiURL = "https://search.naver.com/search.naver?query=%EC%82%BC%EC%84%B1%EC%A0%84%EC%9E%90";
		URL url = null;
		
		try {
			url = new URL(apiURL); // 예외 처리가 필요한 코드
			
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("호스트 : " + url.getHost()); 
			System.out.println("파라미터 :" + url.getQuery());
			// 서버 경로는 형식은 개발자가 정해서 호출하는 메소드가 없고, 직접 계산해서 잘라내야 함.
			
			
			
		}catch(MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		}
		
		
	}

	public static void main(String[] args) {

		ex01();
		
	}

}
