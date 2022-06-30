package co.edu.book;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.oreilly.servlet.MultipartRequest;

@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BookServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");

		BookDAO dao = new BookDAO();
		List<bookVO> list = dao.bookList();
		Gson gson = new Gson();

		response.getWriter().print(gson.toJson(list));

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		
		BookDAO dao = new BookDAO();
		PrintWriter out = response.getWriter();
		
			String cmd = request.getParameter("cmd");
			String bookCode = request.getParameter("bookCode");
			String bookName = request.getParameter("bookName");
			String bookAuth = request.getParameter("bookAuth");
			String bookPres = request.getParameter("bookPres");
			String bookAmt = request.getParameter("bookAmt");

		// 입력
		if(cmd.equals("insert")) {
			bookVO vo = new bookVO();
			vo.setBookCode(bookCode);
			vo.setBookName(bookName);
			vo.setBookAuth(bookAuth);
			vo.setBookPres(bookPres);
			vo.setBookAmt(Integer.parseInt(bookAmt));
			
			Gson gson = new GsonBuilder().create();
			
			dao.insertBook(vo);
			
			out.print(gson.toJson(vo));
		
		// 삭제
		}else if(cmd.equals("delete")) {
			if(dao.deleteBook(bookCode)) {
				out.print("{\"retCode\" : \"Success\"}");
			}else {
				out.print("{\"retCode\" : \"Fail\"}");
			}
		}
		
	}

}
