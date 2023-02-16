package ex06_select;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class MainClass {

	// select 결과행이 1개인 경우
	public static void ex01() {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			Class.forName("oracle.jdbc.OracleDriver");

			Properties p = new Properties();

			p.load(new BufferedReader(new FileReader("db.properties")));

			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			con = DriverManager.getConnection(url, p);

			String sql = "select member_no, id, name, address, join_date";
			sql += " from member_tbl";
			sql += " where member_no = ?";

			ps = con.prepareStatement(sql);

			int memberNo = 1;
			ps.setInt(1, memberNo);

			rs = ps.executeQuery(); // select문 실행 메소드

//			System.out.println(rs.next()); // 첫번째 결과행이 있으면 true 없으면 false
//			System.out.println(rs.next()); // 두번째 결과행이 있으면 true 없으면 false

//			Member 객체 선언
			Member member = null;

//			결과 행이 최대 1개 있으므로 if문으로 분기 처리

			if (rs.next()) {
//				결과 행의 각 칼럼 정보 읽어서 Member 객체 만들기
				member = new Member();
				member.setMember_no(rs.getInt("member_no"));
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setAddress(rs.getString("address"));
				member.setJoin_date(rs.getDate("join_date"));

			}

//			if문이 종료된 뒤, member가 null이면 조회된 결과가 없었다는 의미
			System.out.println(member);

			/*
			 * | member_no | id | name | address | join_date | 최초 rs가 가리키는 위치 | 1 | admin |
			 * 관리자 | 서울 | 23/02/15 | 첫번째 rs.next()를 호출한 경우 | 2 | master | 운영자 | 경기 |
			 * 23/02/16 | 두번째 rs.next()를 호출한 경우 세번째 rs.next()를 호출한 경우 결과가 없으므로 false가 반환
			 * 
			 * 1. ResultSet rs 객체는 하나의 행을 가리키는 포인터 역할이다. 2. next 메소드를 통해서 각 행을 가리킬 수 있다. 1)
			 * next 메소드를 한 번 호출하면 select 전체 결과 중 1행을 가리킨다. 2) next 메소드를 두 번 호출하면 select 전체
			 * 결과 중 2행을 가리킨다. 3. next 메소드의 호출 결과는 boolean이다. 1) 조회된 결과 행이 있으면 true가 반환된다. 2)
			 * 조회된 결과 행이 없으면 false가 반환된다.
			 * 
			 * 4. 결과 행의 칼럼 정보 가져오는 방법 1) 칼럼명을 그대로 사용 rs.getInt("member_no");
			 * rs.getString("id"); rs.getString("name"); rs.getString("address");
			 * rs.getDate("join_date"); 2) 결과 행의 칼럼 순서대로 번호를 붙여서 사용한다. rs.getInt(1);
			 * rs.getString(2); rs.getString(3); rs.getString(4); rs.getDate(5);
			 */

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	// select 결과행이 2개 이상인 경우
	public static void ex02() {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = null;

		try {

			Class.forName("oracle.jdbc.OracleDriver");

			Properties p = new Properties();

			p.load(new BufferedReader(new FileReader("db.properties")));

			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			con = DriverManager.getConnection(url, p);

			sql  = "select member_no, id, name, address, join_date";
			sql += " from member_tbl";

			ps = con.prepareStatement(sql);


			rs = ps.executeQuery(); // select문 실행 메소드
			
//			결과 행이 여러개 있으므로 ArrayList를 준비한다.
			List<Member> memberList = new ArrayList<>();
			

//			결과 행이 여러개 있으므로 while문으로 반복 처리
			
			while(rs.next()) {
//				결과 행의 각 칼럼 정보 읽어서 Member 객체 만들기
				Member member = new Member();
				member.setMember_no(rs.getInt("member_no"));
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setAddress(rs.getString("address"));
				member.setJoin_date(rs.getDate("join_date"));

//				Member 객체 ArrayList에 저장하기
				memberList.add(member);
			}

//			while문이 종료된 뒤, ArrayList의 크기가 0이면 조회된 결과가 없었다는 의미
			for(int i=0; i<memberList.size(); i++) {
				System.out.println(memberList.get(i));
			}

			/*
			 * | member_no | id | name | address | join_date | 최초 rs가 가리키는 위치 | 1 | admin |
			 * 관리자 | 서울 | 23/02/15 | 첫번째 rs.next()를 호출한 경우 | 2 | master | 운영자 | 경기 |
			 * 23/02/16 | 두번째 rs.next()를 호출한 경우 세번째 rs.next()를 호출한 경우 결과가 없으므로 false가 반환
			 * 
			 * 1. ResultSet rs 객체는 하나의 행을 가리키는 포인터 역할이다. 2. next 메소드를 통해서 각 행을 가리킬 수 있다. 1)
			 * next 메소드를 한 번 호출하면 select 전체 결과 중 1행을 가리킨다. 2) next 메소드를 두 번 호출하면 select 전체
			 * 결과 중 2행을 가리킨다. 3. next 메소드의 호출 결과는 boolean이다. 1) 조회된 결과 행이 있으면 true가 반환된다. 2)
			 * 조회된 결과 행이 없으면 false가 반환된다.
			 * 
			 * 4. 결과 행의 칼럼 정보 가져오는 방법 1) 칼럼명을 그대로 사용 rs.getInt("member_no");
			 * rs.getString("id"); rs.getString("name"); rs.getString("address");
			 * rs.getDate("join_date"); 2) 결과 행의 칼럼 순서대로 번호를 붙여서 사용한다. rs.getInt(1);
			 * rs.getString(2); rs.getString(3); rs.getString(4); rs.getDate(5);
			 */

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		ex02();

	}

}
