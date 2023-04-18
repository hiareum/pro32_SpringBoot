package com.myboot01;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.myboot01.domain.BoardVO;



//@RestController는 jsp같은 뷰(view)를 별도로 만들지 않는 대신 컨트롤러 메서드가 리턴한 데이터 자체를 클라이언트로 전달한다
//클라이언트에 전달되는 데이터를 대부분 문자열이거나 VO이거나 컬렉션 형태의 자바 객체인,
//자바 객체가 전달되는 경우에는 자동적으로 json으로 변환하여 처리하게 된다
@RestController //REST컨트롤러로 등록하면 리턴되는 문자열이 브라우저에 그대로 출력되기 때문에 별도로 View화면을 만들 필요가 없다
public class BoardController {
	public BoardController() {
		System.out.println("===> BoardController 생성");
	}
 
	@GetMapping("/hi") //기존의 @RequestMapping(value="/hi", method="RequestMethod.GET)과 동일한 설정
	public String hello(String id) {
		return "Hi : " + id;
		
	}
	
	@GetMapping("/getBoard")
	public BoardVO getBoard() {
		BoardVO board=new BoardVO();
		
		board.setSeq(1);
		board.setTitle("테스트 제목");
		board.setWriter("테스터");
		board.setContent("테스트내용입니다");
		board.setCreateDate(new Date());
		board.setCnt(0);
		return board;
		
	}
	
	@GetMapping("/getBoardList")
	public List getBoardList() {
		List<BoardVO> list = new ArrayList<BoardVO>(); 
		
		for(int i=1; i<=10;i++) {
			
		BoardVO board=new BoardVO();
		board.setSeq(i);
		board.setTitle("테스트 제목" +i);
		board.setWriter("테스터");
		board.setContent("테스트내용입니다" + i);
		board.setCreateDate(new Date());
		board.setCnt(0);
		list.add(board);
		
		}
		return list;
	}
	
}
