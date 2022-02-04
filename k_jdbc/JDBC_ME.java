package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC_ME {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "OHJ96";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from customer";
			
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String memid = rs.getString(1);
				String memname = rs.getString(2);
				String memmile = rs.getString("MEM_MILEAGE");
				
				System.out.println("회원코드 : " + memid + " / 회원명 : " + memname + " / 마일리지 : " + memmile);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally {
			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
		
		System.out.println("-------------------------------------------");
		System.out.println("UPDATE");
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "update customer"
					+ " set mem_mileage = ?"
					+ " where mem_id = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, 8800);
			ps.setString(2, "x001");
			
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally {
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
		
		System.out.println("INSERT");
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "insert "
					+ " into customer (mem_id, mem_name, mem_mileage) values ( ?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, "hj01");
			ps.setString(2, "오혜지");
			ps.setInt(3, 5555);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally {
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
		
		System.out.println("DELETE");
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "delete from customer"
					+ " where mem_name = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, "오혜지");
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally {
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}

	}

}
