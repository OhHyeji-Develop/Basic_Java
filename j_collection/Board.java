package j_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import e_oop.ScanUtil;

public class Board {

	public static void main(String[] args) {
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고
		 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
		 * 
		 * 글번호, 제목, 내용, 작성자, 날짜... -> 테이블컬럼
		 * 조회, 등록, 수정, 삭제하는 기능을 만들어야함
		 * 
		 * 가장 먼저 목록(내용X)을 띄우게 -> 조회(상세 내용을 볼수있도록) , 새로운 글을 등록
		 * 조회를 한 후 지금 보고있는 글을 수정하거나 삭제할수 있도록
		 * 
		 */
		
		ArrayList<HashMap<String, Object>> boardTable = new ArrayList<HashMap<String, Object>>();
		
		HashMap<String, Object> board = new HashMap<String, Object>();

		System.out.println("[글목록] [작성자]  [제목]           [작성날짜]");
		System.out.println("ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ");
		
		board = new HashMap<String, Object>();
		board.put("BOARD_NUM",1);
		board.put("BOARD_NAME","라이언");
		board.put("BOARD_TITLE","오늘의 날씨는 맑음");
		board.put("BOARD_DATE","2022-01-28");
		
		boardTable.add(board);
		
		board = new HashMap<String, Object>();
		board.put("BOARD_NUM",2);
		board.put("BOARD_NAME","어피치");
		board.put("BOARD_TITLE","저녁에 뭐먹지");
		board.put("BOARD_DATE","2022-01-20");
		
		boardTable.add(board);
		
		board = new HashMap<String, Object>();
		board.put("BOARD_NUM",3);
		board.put("BOARD_NAME","무지");
		board.put("BOARD_TITLE","어제 일기");
		board.put("BOARD_DATE","        2022-01-15");
		
		boardTable.add(board);
		
		board = new HashMap<String, Object>();
		board.put("BOARD_NUM",4);
		board.put("BOARD_NAME","죠르디");
		board.put("BOARD_TITLE","딸기는 정말 맛있어");
		board.put("BOARD_DATE","2022-01-10");
		
		boardTable.add(board);
		

		
		for(int i = 0; i < boardTable.size(); i++) {
			board = boardTable.get(i);
			for(String key : board.keySet()) {
				System.out.print(board.get(key) + "\t");
			}
			System.out.println();
		}
		System.out.println("ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ");
		int input;
		System.out.println("( 1.조회  2.등록  3.수정  4.삭제 )");
		input = ScanUtil.nextInt();
		switch(input) {
		case 1: break;
			
		case 2:
			
		
		}
		
		
		
		
		
		

	}

}
