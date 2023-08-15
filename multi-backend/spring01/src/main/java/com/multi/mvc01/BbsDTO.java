package com.multi.mvc01;

public class BbsDTO {
		//db테이블의 컬럼과 동일한 일믕로 만들어주자.
		//실무에서는 변수명과 컬럼명을 동일하게 만들어주면
		//나중에 알아서 가방에 값을 넣었다가 꺼냈다가를 자동으로 해준다.
		//getters/setters자동완성
		private int id;
		private String title;
		private String content;
		private String writer;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getWriter() {
			return writer;
		}
		public void setWriter(String writer) {
			this.writer = writer;
		}
		
		//toString() 자동완성
		@Override
		public String toString() {
			return "BbsVO [id=" + id + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
		}
		
		
		
		
		
		
		

}
