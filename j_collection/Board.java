package j_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

// 게시판 만들기

public class Board {

	public static void main(String[] args) {
		new Board().start();
	}

	ArrayList<HashMap<String, Object>> boardTable = new ArrayList<HashMap<String, Object>>();
	
	SimpleDateFormat format = new SimpleDateFormat("MM-dd");

	void start() {
		while (true) {
			System.out.println("============================");
			System.out.println("번호\t제목\t작성자\t날짜");

			for (int i = boardTable.size() - 1; i >= 0; i--) { // ???
				System.out.println("────────────────────────────");

				HashMap<String, Object> board = boardTable.get(i);
				System.out.println(board.get("BOARD_NO") + "\t" 
								 + board.get("TITLE") + "\t" 
								 + board.get("USER_NAME") + "\t" 
								 + format.format(board.get("REG_DATE")));
			}
			System.out.println("────────────────────────────");

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
				System.out.println("종료합니다.");
				System.exit(0);
			}

		}
	}

	private void insert() {

		HashMap<String, Object> board = new HashMap<String, Object>();

		int max = 0;
		for (int i = 0; i < boardTable.size(); i++) {
			if (max < (int) boardTable.get(i).get("BOARD_NO")) { // 글번호의 최대값을 찾고 +1을 해줌
				max = (int) boardTable.get(i).get("BOARD_NO");
			}
		}

		board.put("BOARD_NO", max + 1);

		System.out.println("제목 : ");
		board.put("TITLE", ScanUtil.nextLine());

		System.out.println("작성자 : ");
		board.put("USER_NAME", ScanUtil.nextLine());

		System.out.println("내용 : ");
		board.put("CONTENT", ScanUtil.nextLine());

		board.put("REG_DATE", new Date());

		boardTable.add(board);

		System.out.println("게시글 등록 완료");

	}

	private void read() {

		System.out.println("조회할 게시물 번호를 입력해주세요");
		int boardNo = ScanUtil.nextInt();

		HashMap<String, Object> board = null;
		for (int i = 0; i < boardTable.size(); i++) {
			if (boardNo == (int) boardTable.get(i).get("BOARD_NO")) {
				board = boardTable.get(i);
				break;
			}
		}

		System.out.println("=======================");
		System.out.println("제목 : " + board.get("TITLE"));
		System.out.println("-----------------------");
		System.out.println("작성자 : " + board.get("USER_NAME"));
		System.out.println("-----------------------");
		System.out.println("내용 : " + board.get("CONTENT"));
		System.out.println("-----------------------");
		System.out.println("작성일 : " + board.get("REG_DATE"));

		System.out.println("1.수정 2.삭제 3.목록");
		int input = ScanUtil.nextInt();

		switch (input) {
		case 1:
			update(board);
			break;
		case 2:
			delete(board);
			break;
		case 3:
			break;
		}

	}

	private void update(HashMap<String, Object> board) {

		System.out.println("수정할 제목 -> ");
		board.put("TITLE", ScanUtil.nextLine());

		System.out.println("수정할 내용 -> ");
		board.put("CONTENT", ScanUtil.nextLine());

		System.out.println("게시물을 수정하였습니다.");

	}

	private void delete(HashMap<String, Object> board) {

		System.out.println("정말 삭제하시겠습니까?(Y/N)");
		String input = ScanUtil.nextLine();

		if (input.equals("Y")) {
			for (int i = 0; i < boardTable.size(); i++) {
				if (board.get("BOARD_NO") == boardTable.get(i).get("BOARD_NO")) {
					boardTable.remove(i);
					System.out.println("게시물이 삭제되었습니다");
					break;
				}

			}
		}

	}

}
