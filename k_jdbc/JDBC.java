package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public class JDBC {

	public static void main(String[] args) {
		
		/*
		 * JDBC(Java Database Connectivity)
		 *  - 자바와 데이터베이스를 연결해주는 라이브러리
		 *  - ojdbc : 오라클 JDBC
		 *  
		 * JDBC 작성 단계
		 * 1. Connection 객체생성(DB연결)
		 * 2. Statement 객체생성(쿼리 작성)
		 * 3. Query 실행 (두 가지로 나뉘어짐)
		 * 4. ResultSet에서 결과 추출(select인 경우)
		 * 5. ResultSet, Statement, Connection 닫기
		 */
		
		// 데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // jdbc:oracle:thin -> jdbc버전  // localhost:1521:xe -> 해당오라클의 호스트이름, 포트, SID
		String user = "OHJ96";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		// DriverManager : 데이터베이스에 접속하기 위한 드라이버를 관리해주는 클래스
		try {
			con = DriverManager.getConnection(url, user, password);// connection객체를 변수con에 저장

			
			String sql = "select * from member"; // 쿼리생성
			ps = con.prepareStatement(sql); // 쿼리 준비완료
			
			//select인 경우
			rs = ps.executeQuery();// 쿼리실행
			
			// insert, update, delete일때는
			//int result = ps.executeUpdate();
			// result : 영향을 받은 행의 수
			
			while(rs.next()) { // 결과를 하나씩 꺼냄 , next() -> 다음줄에 접근을 해라(다음행이 없을때까지 반복)
				String memId = rs.getString(1); // 인덱스
				String memPass = rs.getString("MEM_PASS"); // 컬럼명
				
				System.out.println("MEM_ID : " + memId + " / MEMPASS : " + memPass); // rs에있는 결과값 하나씩 출력
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally {
			if(rs != null) try {rs.close();} catch(Exception e) {} // null이 아닐때 close, 닫는도중에도 try-catch반복
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
	}

}
