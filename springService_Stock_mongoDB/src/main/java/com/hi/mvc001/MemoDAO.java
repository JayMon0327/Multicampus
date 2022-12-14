package com.hi.mvc001;

import java.util.List;

public interface MemoDAO {
    List<MemoDTO> getMemoList();    //목록보기
    void memoInsert(MemoDTO dto);    //글쓰기
    MemoDTO memoDetail(String _id);    //상세화면
    void memoUpdate(MemoDTO dto);    //글수정
    void memoDelete(String _id);    //글삭제
}