package p2021_02_24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Selectboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs01 = null;
		ResultSet rs02 = null;
		int count = 0;				// 총 데이터 갯수
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/jsptest";
		
		SimpleDateFormat sd = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "jspid", "jsppass");
			
			String sql="select * from board order by no desc";
			
			pstmt = con.prepareStatement(sql);
			rs01 = pstmt.executeQuery();
			
			System.out.println("번호\t작성자명\t비밀번호\t제목\t내용\t날짜");
			System.out.println("--------------------------------------------");
			
			while(rs01.next()) {
				int no = rs01.getInt("no");
				String writer = rs01.getString("writer");
				String passwd = rs01.getString("passwd");
				String subject = rs01.getString("subject");
				String content = rs01.getString("content");
				Timestamp ts = rs01.getTimestamp("reg_date");
				
				System.out.println(no+"\t"+writer+"\t"+passwd+"\t"+subject+"\t"+content+"\t"+sd.format(ts));
			}
			
			sql = "select count(*) from board";
			pstmt = con.prepareStatement(sql);
			rs02 = pstmt.executeQuery();
			if(rs02.next()) {
				count = rs02.getInt(1);
//				count = rs02.getInt("count(*)");
			}
			System.out.println("총데이터 수:"+count);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs01 != null) rs01.close();
				if(rs02 != null) rs02.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
