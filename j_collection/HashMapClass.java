package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	private static final String String = null;

	public static void main(String[] args) {
		/*
		 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다. Object remove(Object
		 * key) : 저장된 키로 저장된 값을 제거한다. Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
		 * Set keySet() : 저장된 모든 키를 Set으로 반환한다.
		 */

		// 테이블구조를 표현하는 방법 두가지
		// 1.HashMap사용
		// 한줄표현 -> 컬럼명과 컬럼값을 알아야함.
		// 해시맵에 컬럼명과 컬럼값을 키와 값으로 저장
		// 2.Class사용
		// 클래스를 생성 -> 클래스에 변수를 컬럼명에 맞게 저장

		HashMap<String, Object> map = new HashMap<String, Object>(); // 키(주로 string 사용)와 값을 둘다 지정해줘야함

		map.put("age", 10);
		map.put("name", "홍길동");
		map.put("date", new Date());

		System.out.println(map); // 순서의 개념이 X

		map.put("name", "이순신");

		System.out.println(map);

		map.remove("date"); // 키를 넘겨주면 삭제 가능

		System.out.println(map);

		Object value = map.get("name"); // 저장된 값 얻을 수 있음(리턴받는 타입은 제네릭으로 지정한 타입(여기서는 Object))

		System.out.println(((String) value).substring(0, 2)); // 형변환하고 괄호로 묶어줘야 사용가능

		String value2 = (String) map.get("name"); // 형변환이 귀찮으면 처음 가져올때부터 형변환을 해서 변수에 저장

		Set<String> keys = map.keySet(); // 타입은 set이고 제네릭은 string
		// set은 값을 하나씩 꺼낼수있는 메서드가 존재하지 않음

		for (String key : keys) { // -> 향상된 for문
			// :을 기준으로 왼쪽은 변수, 오른쪽은 배열 or ArraysList or Set 여러개의 데이터가 담겨진것
			// 오른쪽에서 하나꺼내서 변수에 저장하고 for문 실행,
			// 데이터를 차례대로 꺼내서 변수에 저장하고 for문 실행
			System.out.println(key + " : " + map.get(key));

		}

		ArrayList<HashMap<String, Object>> lprodTable = new ArrayList<HashMap<String, Object>>();

		HashMap<String, Object> lprod = new HashMap<String, Object>(); // 한줄을 표현하기위한 해시맵생성
		lprod.put("LPROD_ID", 1); // 테이블에 저장함
		lprod.put("LPROD_GU", "P101");
		lprod.put("LPROD_NM", "컴퓨터제품");

		lprodTable.add(lprod); // lprod테이블이 됨

		lprod = new HashMap<String, Object>();
		lprod.put("LPROD_ID", 2);
		lprod.put("LPROD_GU", "P102");
		lprod.put("LPROD_NM", "전자제품");

		lprodTable.add(lprod);

		lprod = new HashMap<String, Object>();
		lprod.put("LPROD_ID", 3);
		lprod.put("LPROD_GU", "P103");
		lprod.put("LPROD_NM", "여성캐주얼");

		lprodTable.add(lprod);

		for (int i = 0; i < lprodTable.size(); i++) {
			lprod = lprodTable.get(i);
			for (String key : lprod.keySet()) {
				System.out.print(lprod.get(key) + "\t");
			}
			System.out.println();
		}

	}

}
