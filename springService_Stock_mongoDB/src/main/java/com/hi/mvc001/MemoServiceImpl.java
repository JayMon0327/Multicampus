package com.hi.mvc001;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service    //서비스 어노테이션
public class MemoServiceImpl implements MemoService {
 
    @Autowired //스프링프레임워크 의존성 주입, dao를 호출하기위해 의존성을 주입
    MemoDAO memoDao;
 
    @Override
    public List<MemoDTO> getMemoList() {    //메모 목록 리턴    
        return memoDao.getMemoList();
    }
 
    @Override
    public void memoInsert(MemoDTO dto) {   
    	System.out.println("내가 진짜 불러졌네.");
        memoDao.memoInsert(dto);
    }
 
    @Override
    public MemoDTO memoDetail(String _id) {
        return memoDao.memoDetail(_id); 
    }
 
    @Override
    public void memoUpdate(MemoDTO dto) {
        memoDao.memoUpdate(dto); 
    }
 
    @Override
    public void memoDelete(String _id) {
        memoDao.memoDelete(_id); 
    }
 
}