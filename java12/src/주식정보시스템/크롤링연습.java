package 주식정보시스템;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 크롤링연습 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=035720");
		Document doc = null;
		try {
			doc = con.get();
			Elements list = doc.select(".no_info");
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				System.out.println(i + ": " + list.get(i));
			}
			String data = list.text();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
