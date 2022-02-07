package k_jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JDBCTest {

	public static void main(String[] args) {
		String sql = "select *"
				+ " from cart"
				+ " where cart_member = ?"
				+ " and cart_qty > ?";
		
		ArrayList<Object> param = new ArrayList<Object>();
		param.add("a001");
		param.add(5);
		
		List<Map<String, Object>> list = JDBCUtil.selectList(sql, param);
		
		System.out.println(list);
		
		//-------------------------------------------
		sql = "select *"
			+ " from member"
			+ " where mem_id = ?"; // 한줄만 조회
		param = new ArrayList<Object>();
		param.add("a001");
		
		Map<String, Object> map = JDBCUtil.selectOne(sql,param);
		
		System.out.println(map);
		
		//-------------------------------------------
		sql = "insert into cart values (?, ?, ?, ?)";
		param = new ArrayList<Object>();
		param.add("a001");
		param.add("2005040100001");
		param.add("P201000019");
		param.add(3);
		
		int result = JDBCUtil.update(sql, param);
		System.out.println("영향받은 행 : " + result); // 맨밑에 1줄이 insert가 됨
		
		//-------------------------------------------
		
	}
	
	

}
