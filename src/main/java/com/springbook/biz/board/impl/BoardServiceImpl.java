package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
//BoardService 인터페이스를 구현.
//@Service로 객체생성하고, 클라이언트 프로그램에서 boardService라는 이름으로 객체를 요청할 수 있도록 아이디도 설정.
@Service("boardService")
public class BoardServiceImpl implements BoardService{
	//BoardDAO 타입의 객체를 의존성 주입하기 위해서 @Autowired 설정.
	@Autowired
	private BoardDAOSpring boardDAO;

	// 글 등록
	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
	}

	// 글 수정
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	// 글 삭제
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	// 글 상세 조회
	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	// 글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDAO.getBoardList(vo);
	}

}