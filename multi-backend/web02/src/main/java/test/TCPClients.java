package test;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClients {

	public static void main(String[] args) throws Exception {
		//여러개의 클라이언트가 서버에 접속하도록 함.
		//for문 이용
		//서버와 통신하려면 Socket(전화기 역할)
		for (int i = 0; i < 100; i++) {
			Socket client = new Socket("localhost", 9200);
			System.out.println("클라이언트가 요청함.>> " + i);
		}
	}

}
