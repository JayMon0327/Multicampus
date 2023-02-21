package 주식정보시스템;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {
//크롤링은 인터넷 문서(html)를 다 받아와서,
//html문서를 분석(parser, 파싱!)을 해서 내가 원하는 정보를 추출하는 것.
	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		System.out.println(" 1. 네트워크 연결 성공.");
		Document doc = null; //로컬변수 초기화! 수동으로 ! 
		try {
			doc = con.get();
			Elements codelist = doc.select(".code"); //값이 하나라도 무조건 ArrayList로 가져옴
			System.out.println(codelist.size());
			for (int i = 0; i < codelist.size(); i++) {
				Element tag = codelist.get(i);
				String code = tag.text();
				System.out.println("코드는 >> " + code);
			}
			Elements textlist = doc.select(".sptxt.sp_txt9"); //값이 하나라도 무조건 ArrayList로 가져옴
			System.out.println(textlist.size());
			Element tag2 = textlist.get(0);
			String code2 = tag2.text();
			System.out.println("거래량은 >> " + code2);
			
			Elements textlist2 = doc.select(".sptxt.sp_txt10"); //값이 하나라도 무조건 ArrayList로 가져옴
			System.out.println(textlist.size());
			
		} catch (Exception e) {
			e.printStackTrace();
		} //html코드를 다 가지고 와서 doc변수에 넣어놨음.
		//System.out.println(doc);
	}

}
