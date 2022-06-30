package co.edu.book;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO extends DAO {

	// 데이터베이스 전체 리스트
	public List<bookVO> bookList() {
		getConnect();
		
		List<bookVO> bookList = new ArrayList<bookVO>();
		
		String sql = "select * \r\n"
				+ "from book";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				bookVO vo = new bookVO();
				vo.setBookCode(rs.getString(1));
				vo.setBookName(rs.getString(2));
				vo.setBookAuth(rs.getString(3));
				vo.setBookPres(rs.getString(4));
				vo.setBookAmt(rs.getInt(5));
				
				bookList.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			disConnect();
		}
		
		return bookList;
		
	}
	
	// 데이터베이스 삭제
	public boolean deleteBook(String bookCode) {
		getConnect();
		
		String sql = "delete from book\r\n"
				+ "where book_code = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bookCode);
			
			int r = psmt.executeUpdate(); // 삭제한 건수
			
			if(r>0) {
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}finally {
			disConnect();
		}
		
		return false;
	}
	
	// 데이터베이스 입력
	public bookVO insertBook(bookVO vo) {
		getConnect();
		
		String sql = "insert into book\r\n"
				+ "VALUES (?, ?, ?, ?, ?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getBookCode());
			psmt.setString(2, vo.getBookName());
			psmt.setString(3, vo.getBookAuth());
			psmt.setString(4, vo.getBookPres());
			psmt.setInt(5, vo.getBookAmt());
			
			int r = psmt.executeUpdate(); // r건 입력
			
			System.out.println(r + "건 입력.");
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			disConnect();
		}
		
		return vo;
	}
	
	
	
	
	
	
	
}
