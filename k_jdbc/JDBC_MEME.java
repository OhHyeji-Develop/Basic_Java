package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_MEME {

	public static void main(String[] args) {
		
		String url = "";
		String user = "";
		String password = "";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from goods";
			
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String pid = rs.getString(1);
				String pname = rs.getString(2);
				String plgu = rs.getString(3);
				String pprice = rs.getString(4);
				
				System.out.println("상품코드:" + pid + "/상품명:" + pname + "/분류코드:" + plgu + "/상품가격" + pprice);
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally {
			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}

	}

}
