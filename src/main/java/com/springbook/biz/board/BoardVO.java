package com.springbook.biz.board;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;
//레이어와 레이어 사이에서 관련된 데이터를 한꺼번에 주고받을 목적으로 사용하는 클래스. "데이터 전달"이 목적.
public class BoardVO {
	//Board DB테이블에 포함된 칼럼과 같은 이름의 멤버 변수를 private 접근제한자로 선언한다.
	/*
	 * 필드들을 private 접근 제한자로 막아두고, 각 필드의 getter, setter 사용하는 이유
	 * 객체의 무결성을 보장하기 위함. 외부에서 직접적으로 접근할 경우 이상한 값 줄 수 있음.
	 * 이를 방지하기 위해 private로 만들어 외부의 접근 제한한 후, 
	 * setter를 사용해 전달받은 값을 내부에서 가공해 필드에 넣어주고, 
	 * 필드 값을 가져올때도 getter를 사용해 본 필드 값을 숨긴 채 내부에서 가공된 값을 꺼낼 수 있다.
	 */
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private int cnt;
	private String searchCondition;
	private String searchKeyword;
	private MultipartFile uploadFile;
	
	//그리고 private 멤버변수에 접근하는 Getter/Setter 메소드를 선언하면 VO 클래스는 끝.
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}	

	public MultipartFile getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}

	@Override
	public String toString() {
		return "BoardVO [seq=" + seq + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
				+ regDate + ", cnt=" + cnt + "]";
	}

}
