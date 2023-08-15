package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {

	public MemberVO one(String id) throws Exception {
		// 1~3: apache iBatis-> google myBatis
		// ���̹�Ƽ��
		// 1. ����̹�(Ŀ����) ����
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1. ����̹� ���� ok....");

		// 2. db����(shop, root, 1234)
		String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
		String user = "scott";
		String password = "tiger";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ok....");

		// 3. sql�� ����
		String sql = "selecy * where id = ? ";
		// SQL������ ����ϴ� ��ü�� ������־�� �ڹٴ� �ν�
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3. SQL�� ���� ok....");

		// 4. sql�� ����
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL�� ���� ok....");

		// 5. Java(ResultSet) <--- oracle(�˻� ��� table)
		String id2 = rs.getString(1);
		String pw = rs.getString(2);
		String name = rs.getString(3);
		String tel = rs.getString(4);

		// 6. 1)������ �����, 2)�����͸� �־�, 3)����(��ȯ, return)
		// 1). ������ �����.
		MemberVO bag = new MemberVO();

		// 2). ���濡 �����͸� �ϳ��� ����.
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);

		ps.close();
		con.close();
		
		// 3).������ ��������.
		return bag;
	}

	public void delete(String id) throws Exception {
		// 1~3: apache iBatis-> google myBatis
		// ���̹�Ƽ��
		// 1. ����̹�(Ŀ����) ����
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1. ����̹� ���� ok....");

		// 2. db����(shop, root, 1234)
		String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
		String user = "scott";
		String password = "tiger";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ok....");

		// 3. sql�� ����
		String sql = "delete from member where id = ? ";
		// SQL������ ����ϴ� ��ü�� ������־�� �ڹٴ� �ν�
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3. SQL�� ���� ok....");

		// 4. sql�� ����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ok....");

		ps.close();
		con.close();
	}

	public void insert(MemberVO bag) throws Exception {
		// 1~3: apache iBatis-> google myBatis
		// ���̹�Ƽ��
		// 1. ����̹�(Ŀ����) ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� ok....");

		// 2. db����(shop, root, 1234)
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ok....");

		// 3. sql�� ����
		String sql = "insert into member values (?,?,?,?)";
		// String sql = "delete from member where id = '700' ";
		// SQL������ ����ϴ� ��ü�� ������־�� �ڹٴ� �ν�
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getPw());
		ps.setString(3, bag.getName());
		ps.setString(4, bag.getTel());

		System.out.println("3. SQL�� ���� ok....");

		// 4. sql�� ����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ok....");

		ps.close();
		con.close();
	}

}
