package db_coonect;

import java.util.ArrayList;

public class BbsListUI {

	public static void main(String[] args) {
		BbsDAO dao = new BbsDAO();
		ArrayList<BbsVO> list = dao.list();
		System.out.println("검색한 게시물수>>  " + list.size());
		for (int i = 0; i < list.size(); i++) {
			BbsVO bag = list.get(i);
			System.out.println(bag.getNo());
			System.out.println(bag.getTitle());
			System.out.println(bag.getContent());
			System.out.println(bag.getWriter());
			System.out.println("-------------------");
		}
//		for (BbsVO bag : list) { //for-each
//			System.out.println(bag.getId());
//			System.out.println(bag.getPw());
//			System.out.println(bag.getName());
//			System.out.println(bag.getTel());
//			System.out.println("-------------------");
//		}
	}
}
