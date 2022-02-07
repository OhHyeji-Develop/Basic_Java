package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import e_oop.ScanUtil;

public class JDBC_BOARD {

	public static void main(String[] args) {

		new JDBC_BOARD().start();

	}

	List<Map<String, Object>> boardTable = new ArrayList<Map<String, Object>>();
	SimpleDateFormat format = new SimpleDateFormat("MM-dd");

	void start() {
		while (true) {

			System.out.println("─────────────────────────────");
			System.out.println("번호\t제목\t작성자\t날짜");

			String sql = "select * from TB_JDBC_BOARD";

			ArrayList<Object> param = new ArrayList<Object>();
			boardTable = JDBCUtil.selectList(sql);

			for (int i = boardTable.size() - 1; i >= 0; i--) {
				System.out.println("-----------------------------");

				Map<String, Object> board = boardTable.get(i);
				System.out.println(board.get("BOARD_NO") + "\t" + board.get("TITLE") + "\t" + board.get("MEM_ID")
						+ "\t" + format.format(board.get("REG_DATE")));
			}
			System.out.println("─────────────────────────────");
			System.out.println("1.등록 2.조회 3.종료");

			int input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				insert();
				break;
			case 2:
				read();
				break;
			case 3:
				System.out.println("종료되었습니다.");
				System.exit(0);

			}
		}
	}

	private void read() {
		
		System.out.println("조회할 게시글 번호를 입력해주세요.");
		int readNo = ScanUtil.nextInt();
		
		String sql = "SELECT * FROM TB_JDBC_BOARD WHERE BOARD_NO = ?";
		ArrayList<Object> param = new ArrayList<Object>();
		
		param.add(readNo);
		
		boardTable = JDBCUtil.selectList(sql, param);
		
		HashMap<String, Object> board = null;
		for (int i = 0; i < boardTable.size(); i++) {
				board = (HashMap<String, Object>) boardTable.get(i);
				break;
		}
		
		System.out.println("================================");
		System.out.println("번호\t: " + board.get("BOARD_NO"));
		System.out.println("--------------------------------");
		System.out.println("작성자\t: " + board.get("TITLE"));
		System.out.println("--------------------------------");
		System.out.println("작성일\t: " + board.get("MEM_ID"));
		System.out.println("--------------------------------");
		System.out.println("제목\t: " + board.get("CONTENT"));
		System.out.println("--------------------------------");
		System.out.println("내용\t: " + board.get("REG_DATE"));
		System.out.println("--------------------------------");
		
		System.out.println("1.수정 2.삭제 3.목록");

		int input = ScanUtil.nextInt();

		switch (input) {
		case 1:
			update(readNo);
			break;
		case 2:
			delete(readNo);
			break;
		case 0:
			break;

		}
	}

	private void update(int readNo) {
		
		String sql = "UPDATE TB_JDBC_BOARD SET ?, ? WHERE BOARD_NO = ?";
		ArrayList<Object> param = new ArrayList<Object>();
		param.add(readNo);
		
		System.out.println("변경할 제목 : ");
		
		System.out.println("변경할 내용 : ");
		
	}

	private void delete(int readNo) {
		System.out.println("정말 삭제하시겠습니까? (Y/N)");
		String input = ScanUtil.nextLine();
		
		
		if(input.equals("Y")) {
			String sql = "DELETE FROM TB_JDBC_BOARD WHERE BOARD_NO = ?";
			ArrayList<Object> param = new ArrayList<Object>();
			param.add(readNo);
			JDBCUtil.update(sql, param);
			System.out.println("게시글이 삭제되었습니다.");
		}
		
	}

	private void insert() {

		String sql = "INSERT INTO TB_JDBC_BOARD VALUES ((SELECT NVL(MAX(BOARD_NO), 0) + 1 FROM TB_JDBC_BOARD), ?, ?, ?, SYSDATE)";

		ArrayList<Object> param = new ArrayList<Object>();

		System.out.println("제목 : ");
		String title = ScanUtil.nextLine();

		System.out.println("내용 : ");
		String content = ScanUtil.nextLine();

		System.out.println("작성자 : ");
		String mem_id = ScanUtil.nextLine();

		param.add(title);
		param.add(content);
		param.add(mem_id);

		JDBCUtil.update(sql, param);

	}

}
