package com.hi.mvc001;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller //컨트롤러 빈 선언
public class MemoController {
 
    @Autowired // @Inject, 서비스를 호출하기위해 의존성을 주입
    MemoService memoService;
    
    @RequestMapping("/memo.do")
    public String memo() {
        return "memo"; //memo디렉토리에 memo jsp파일로 가서 목록을 다시 얻어온다.
    }
    
    
    @RequestMapping("/memo_list.do") //게시물 리스트
    public ModelAndView memo_list() {
        Map<String,Object> map=new HashMap<>();
        List<MemoDTO> list=memoService.getMemoList(); //서비스에서 메모목록을 가져온다.
        System.out.println(list);
        map.put("items", list); //값이 여러개기때문에 hashmap로 담아서 ModelAndView로 넘기고, 거기에서 memo_list jsp페이지에 "memo"라는 변수명으로 보내 출력시킨다.
        return new ModelAndView("memo_list", "map", map);
    }
    
    @RequestMapping("/memo_insert.do") //게시물 삽입
    public String memo_insert(@ModelAttribute MemoDTO dto) {
    	System.out.println("내가 불러졌구나..");
        memoService.memoInsert(dto);
        return "redirect:/memo.do";
    }
    
    @RequestMapping("/memo_view.do") 
    public ModelAndView memo_view(String _id) {
        MemoDTO dto=memoService.memoDetail(_id);
        return new ModelAndView("memo_view", "dto", dto);
    }
    
    @RequestMapping("/memo_update.do")
    public String memo_update(@ModelAttribute MemoDTO dto) {
        memoService.memoUpdate(dto);
        return "redirect:/memo.do";
    }
    
    @RequestMapping("/memo_delete.do")
    public String memo_delete(String _id) {
        memoService.memoDelete(_id);
        return "redirect:/memo.do";
    }
}
