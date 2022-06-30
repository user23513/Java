package co.edu.book;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/BookServelt")
public class BookServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BookServelt() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		
		BookDAO dao = new BookDAO();
		PrintWriter out = response.getWriter();
		Gson gson = new GsonBuilder().create();
		
		String cmd = request.getParameter("cmd");
		String code = request.getParameter("code");
		String name = request.getParameter("name");
		String auth = request.getParameter("auth");
		String pres = request.getParameter("pres");
		String amt = request.getParameter("amt");
		
		// 전체 데이터 출력
		if(cmd.equals("list")) {
			List<BookVO> bookList = dao.bookList();
			out.print(gson.toJson(bookList));
		
		 // 입력한 데이터 출력	
		}else if(cmd.equals("insert")) {
			BookVO vo = new BookVO();
			vo.setBookCode(code);
			vo.setBookName(name);
			vo.setBookAuth(auth);
			vo.setBookPres(pres);
			vo.setBookAmt(Integer.parseInt(amt));
			
			dao.bookInsert(vo);
			out.print(gson.toJson(vo));
			
		// 삭제	
		}else if(cmd.equals("delete")) {
			if(dao.bookDelete(code)) {
				out.print("{\"retCode\" : \"Success\"}");
			}else {
				out.print("{\"retCode\" : \"Fail\"}");
			}
		}
		
		
	}
	
	

}
