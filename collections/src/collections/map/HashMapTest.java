package collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// Map의 객체 생성 - 학생의 이름과 성적을 관리(crud)
		Map<String, Integer> map = new HashMap<>();
		
		//객체 생성(저장) - put()
		map.put("이순신", 90);
		map.put("홍길동", 80);
		map.put("강감찬", 75);
		map.put("홍길동", 60);	// key는 중복 불허, 값은 변경 가능
		
		
		System.out.println("총 객체 수: " + map.size());
		
		// 객체 1개 조회 - get()
		System.out.println(map.get("강감찬"));		// 75점 출력
		
		
		// 객체 삭제 - key로 삭제
		if(map.containsKey("이순신")) {		// 키가 존재하는지 확인(true/false)
			map.remove("이순신");
		}
		
		// "강감찬"의 점수를 100점으로 변경 - map은 셋이 없어요.
		map.put("강감찬", 100);
		
		
		
		// 전체 목록 조회 - set, Iterator 자료형 사용
		//Set<String> keySet = map.keySet();		// 중복이 안되도록 자료 저장(Set을 사용)
		//Iterator<String> ir = keySet.iterator();	// 1개씩 순회함(반복)
		
		Iterator<String> ir = map.keySet().iterator();	// 한 줄로 줄여쓰기도 함.
		while(ir.hasNext()) {
			String key = ir.next(); 				// 다음 자료에서 키 저장
			Integer value = map.get(key);			// 키를 매개로 값을 가져옴
			System.out.println(key + ", " + value);
		}
		
		
		
	}

}
