package co.edu.book;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO extends DAO{
	
	// 디비에서 전체 데이터
	public List<BookVO> bookList() {
		getConnect();
		List<BookVO> list = new ArrayList<>();
		
		String sql = "select * from book";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				BookVO vo = new BookVO();
				vo.setBookCode(rs.getString(1));
				vo.setBookName(rs.getString(2));
				vo.setBookAuth(rs.getString(3));
				vo.setBookPres(rs.getString(4));
				vo.setBookAmt(rs.getInt(5));
				
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disConnect();
		}
		
		return list;
		
	}
	
	// 디비에 입력
	public BookVO bookInsert(BookVO vo) {
		getConnect();
		String sql = "insert into book\r\n"
				+ "values (?, ?, ?, ?, ?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getBookCode());
			psmt.setString(2, vo.getBookName());
			psmt.setString(3, vo.getBookAuth());
			psmt.setString(4, vo.getBookPres());
			psmt.setInt(5, vo.getBookAmt());
			
			int r = psmt.executeUpdate(); // r건 입력
			System.out.println(r + "건 입력");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return vo;
		
	}
	
	// 디비 삭제
	public boolean bookDelete(String code) {
		getConnect();
		
		String sql = "delete from book\r\n"
				+ "where book_code = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, code);
			
			int r = psmt.executeUpdate();
			
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
	
	

}
