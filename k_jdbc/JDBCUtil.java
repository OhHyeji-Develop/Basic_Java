package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {

	private static String url = "jdbc:oracle:thin:@localhost:1521:xe"; // jdbc:oracle:thin -> jdbc버전  // localhost:1521:xe -> 해당오라클의 호스트이름, 포트, SID
	private static String user = "OHJ96";
	private static String password = "java";
	
	private static Connection con = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	
	/*
	 * Map<String, Object> selectOne(String sql) // selectOne : 조회결과가 한줄만 나오는 경우 사용하는 메서드
	 * 												(String sql) -> 쿼리
	 * Map<String, Object> selectOne(String sql, List<Object> param) // List<Object> param-> 물음표가 들어갈 값(물음표가 있을때 사용)
	 *  // List<Object> param)에 들어갈 값을 arraylist에 담아서 파라미터로 넘기는것
	 *  
	 * List<Map<String, Object>> selectList(String sql) // selectList : 조회결과가 여러줄이 나올경우 사용하는 메서드
	 * List<Map<String, Object>> selectList(String sql, List<Object> param)
	 * int update(String sql) // update : select를 제외한 나머지를 사용할 때 메서드
	 * int update(String sql, List<Object> param)
	 */
	
	//------------------------------------
	public static Map<String, Object> selectOne(String sql){
		Map<String, Object> map = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			
			if(rs.next()) {
				map = new HashMap<String, Object>();
				for(int i = 1; i <= columnCount; i++) {
					map.put(metaData.getColumnName(i), rs.getObject(i));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try {rs.close();} catch(Exception e) {} // null이 아닐때 close, 닫는도중에도 try-catch반복
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
		return map;
		
	}
	
	//------------------------------------
	public static Map<String, Object> selectOne(String sql, List<Object>param){
		Map<String, Object> map = null;
		// 아무것도 조회되지 않았을 경우에 어떤걸 리턴할 것인가를 생각해봐야함 -> 빈 HashMap보다는 NULL이 넘어와야함
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql); // prepareStatement객체가 리턴됨
			
			for(int i = 0; i < param.size(); i++) { // ?에 들어갈 값 세팅
				ps.setObject(i + 1, param.get(i));
			}
			
			rs = ps.executeQuery(); // 쿼리실행
			
			ResultSetMetaData metaData = rs.getMetaData(); // 질문
			int columnCount = metaData.getColumnCount(); // 컬럼의 수
			
			if(rs.next()) { // next를 한번 호출해야 첫번째 행을 바라봄
				//selectlist에는 여러줄일수 있으니까 while문을 사용
				//selectone은 한줄밖에 없으니까 if문 사용(행이 존재할때만 실행가능)
				map = new HashMap<String, Object>();
				for(int i = 1; i <= columnCount; i++) {
					map.put(metaData.getColumnName(i), rs.getObject(i));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally {
			if(rs != null) try {rs.close();} catch(Exception e) {} // null이 아닐때 close, 닫는도중에도 try-catch반복
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}	
		return map;
	}
	
	
	//------------------------------------
	public static List<Map<String, Object>> selectList(String sql){
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
			try {
				con = DriverManager.getConnection(url, user, password);
				
				ps = con.prepareStatement(sql);
				
				rs = ps.executeQuery();
				
				ResultSetMetaData metaData = rs.getMetaData();
				
				int columnCount = metaData.getColumnCount();
				
				while(rs.next()) {
					Map<String, Object> map = new HashMap<String, Object>();
					for(int i = 1; i <= columnCount; i++) { // 컬럼에 하나씩 접근해서 arraylist에 담아야한다.
						map.put(metaData.getColumnName(i), rs.getObject(i)); // 컬럼명과 컬럼값이 한줄의데이터에 들어감
					}
					list.add(map); // list에 저장
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if(rs != null) try {rs.close();} catch(Exception e) {} // null이 아닐때 close, 닫는도중에도 try-catch반복
				if(ps != null) try {ps.close();} catch(Exception e) {}
				if(con != null) try {con.close();} catch(Exception e) {}
			}
		
		return list ;
		
	}
	
	//------------------------------------
	public static List<Map<String, Object>> selectList(String sql, List<Object> param){ // 메서드앞에는 public을 붙힌다, ?에 들어갈 값을 List<Object> param파라미터로 넘겨준다
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
			for(int i = 0; i < param.size(); i++) {
				ps.setObject(i + 1, param.get(i)); // ?인덱스는 1부터 시작 -> i + 1
			} // 쿼리 준비완료
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount(); // 컬럼수
			
			// 결과추출
			while(rs.next()) {
				Map<String, Object> map = new HashMap<String, Object>();
				for(int i = 1; i <= columnCount; i++) { // 컬럼에 하나씩 접근해서 arraylist에 담아야한다.
					map.put(metaData.getColumnName(i), rs.getObject(i)); // 컬럼명과 컬럼값이 한줄의데이터에 들어감
				}
				list.add(map); // list에 저장
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally {
			if(rs != null) try {rs.close();} catch(Exception e) {} // null이 아닐때 close, 닫는도중에도 try-catch반복
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
		
		
		
		return list; // 메서드 컴파일 에러가 사라짐
	}
	
	//------------------------------------
	public static int update(String sql) { // select를 제외한 나머지를 사용할때 사용하는 메서드
		int result = 0; // int타입 변수생성
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
		
			result = ps.executeUpdate(); // 결과를 추출하는 과정 필요없음
			
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally {
			if(rs != null) try {rs.close();} catch(Exception e) {} // null이 아닐때 close, 닫는도중에도 try-catch반복
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
		
		return result;
		
	}
	
	//------------------------------------
	public static int update(String sql, List<Object> param) { // 질문
		int result = 0;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
			for(int i = 0; i < param.size(); i++) {
				ps.setObject(i + 1, param.get(i));
			}
			
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally {
			if(rs != null) try {rs.close();} catch(Exception e) {} // null이 아닐때 close, 닫는도중에도 try-catch반복
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
		return result;
		
	}

}