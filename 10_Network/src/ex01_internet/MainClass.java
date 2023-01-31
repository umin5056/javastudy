package ex01_internet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
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
	
	public static void ex02() {
		
		// 웹 접속을 담당하는 HttpURLConnection
		
		String apiURL = "https://www.naver.com";
		URL url = null;
		HttpURLConnection con = null;
		
		try {
			
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection(); // IOException 처리가 필요하다.
			
			/*
			   HTTP 응답 코드 공부하기
			   1. 200 : 정상
			   2. 40x : 잘못된 요청 (사용자가 잘못하였음)
			   3. 50x : 서버 오류 (서버가 잘못하였음)
			 */
			
			System.out.println("정상 응답 : " + HttpURLConnection.HTTP_OK);
			System.out.println("Not Found : " + HttpURLConnection.HTTP_NOT_FOUND);
			System.out.println("Internal Error : " + HttpURLConnection.HTTP_INTERNAL_ERROR);
			
			// apiURL 접속 확인
			int responseCode = con.getResponseCode();
			if(responseCode == 200) {
				System.out.println(apiURL + " 접속 완료");
			}
			
			// 요청 방식 (요청 메소드)
			String requestMethod = con.getRequestMethod();
			System.out.println("요청 방식 : " + requestMethod);
			
			// 컨텐트 타입
			String contentType = con.getContentType();
			System.out.println("컨텐트 타입 : " + contentType);
			
			// 요청 헤더 
			String userAgent = con.getRequestProperty("User-Agent");
			System.out.println("User-Agent : " + userAgent);
			
			String referer = con.getRequestProperty("Referer");
			System.out.println("Referer : " + referer);
			
			// 접속 종료
			con.disconnect();
			
			
		}catch (MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		}catch (IOException e) {
			System.out.println("apiURL 접속 오류");
		}
		
	}

	// 다음 이미지 복사하는 메소드
	public static void ex03() {
		
		String apiURL = "https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png";
		URL url = null;
		HttpURLConnection con = null;
		InputStream in = null;		// 다음 로고를 읽어 들이는 입력 스트림
		FileOutputStream out = null;// storage로 내보내는 출력 스트림
		
		
		
		try {
			url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();
			
			int responseCode = con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK); {
				
				in = con.getInputStream();
				out = new FileOutputStream("/Users/woomin/Documents/storage" + File.separator +"daum.png");
				
				byte[] b = new byte[10];
				int readByte = 0;
				
				while((readByte = in.read(b)) != -1) {
					out.write(b, 0, readByte);
				}
				
				System.out.println("다운로드 완료");
    				
				out.close();
				in.close();
				con.disconnect();
				
				
			}
		}catch(MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		}catch(IOException e) {
			// 접속 실패 or 스트림 관련 오류 발생
			e.printStackTrace();
		}
		
	}
	
	public static void ex003() {
		
		String apiURL = "https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png";
		URL url = null;
		HttpURLConnection con = null;
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		
		try {
			url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();
			in = new BufferedInputStream(con.getInputStream());
			out = new BufferedOutputStream(new FileOutputStream("/Users/woomin/Documents/storage/daum2.png"));
			
			byte[] b = new byte[10];
			int readByte = 0;
			
			while((readByte = in.read(b)) != -1) {
				out.write(b, 0, readByte);
			}
			
			System.out.println("다운로드 연습 완");
			
			in.close();
			out.close();
			con.disconnect();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] args) {

		ex01();
		
	}

}
