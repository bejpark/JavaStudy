package kr.or.kosa.dao;

import java.util.HashMap;
import java.util.List;

import kr.or.kosa.domain.BoardVO;

public interface BoardDAO {
	public void insertBoard(BoardVO vo); //추가
	public void updateBoard(BoardVO vo); //수정
	public void deleteBoard(BoardVO vo); //삭제
	
	public List<BoardVO> selectAll(HashMap map); //전체 보기
	
	public BoardVO selectBoard(BoardVO vo); //특정한것만 검색
}
