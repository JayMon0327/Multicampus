package com.mega.mvc05;

import java.util.List;

public interface ReplyDAOInterface {

	int delete(ReplyVO vo);

	int create(ReplyVO vo);

	List<ReplyVO> list(int original);

}