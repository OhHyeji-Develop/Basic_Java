package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {
		
		// 데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // jdbc:oracle:thin -> jdbc버전  // localhost:1521:xe -> 해당오라클의 호스트이름, 포트, SID
		String user = "OHJ96";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		// connection 연결
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * "
					+ " from cart" // 앞에 " "공백이 있어야함
					+ " where cart_member = ?" // 값을 ?로 대신하고 메서드를 이용해서 나중에 값을 채워넣음
					+ " and cart_qty > ?"; // ?값보다 큰 수량을 구함
			ps = con.prepareStatement(sql);
			ps.setString(1, "a001"); // 첫번째 물음표에 a001이라는 값을 넣겠다// 첫번째 파라미터는 물음표의 순서, 두번째 파라미터는 넣고싶은 값
			ps.setInt(2, 5); // 두번째 물음표에는 5라는 값을 넣겠다 ,물음표에는 값만 들어갈수있음(컬럼명X, 키워드X)
//			ps.setObject(0, sql); // 타입상관없이 값을 넣어줌
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			//메타데이터 : 데이터에 대한 데이터
			
			int columnCount = metaData.getColumnCount(); // 조회된 컬럼의 갯수를 알수있음
			
			while(rs.next()) {
				for(int i = 1; i <= columnCount; i++) { // 컬럼인덱스가 1부터 시작, ?의 인덱스도 1부터 시작
					System.out.print(rs.getObject(i) + "\t");
				}
				System.out.println();
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
