package chap13_collectionFramework.sec01_listCollection.exam02_vector;

import java.util.List;
import java.util.Vector;

/* Vector
 - ArrayList와 동일한 내부 구조를 가지고 있음
 - 다만 차이점으로 동기화된(Synchronized) 메서드로 구성되어 있어 멀티 스레드가 동시에 Vector의 메서드를
  실행할 수 없고 하나의 스레드가 메서드 실행을 완료해야만 다른 스레드가 메서드를 실행할 수 있음
 > 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제가 가능
 - 스레드에 안전(Thread Safe)하다고 표현 */
public class VectorExample {

	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		list.remove(2); // 2번 인덱스 객체 : 제목3~ 삭제 (뒤의 인덱스 객체 당겨짐)
		list.remove(3); // 3번 인덱스 객체 : 제목5~ 삭제
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}