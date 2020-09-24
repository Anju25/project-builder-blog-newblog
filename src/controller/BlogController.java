package controller;

import java.io.IOException;
//import java.time.LocalDate;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Blog;
import model.User;




@WebServlet(urlPatterns= {"/blog"})
public class BlogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BlogController() {
        super();
        //Blog obj=new Blog(null, 0);
        
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String blogDetails = request.getParameter("selectedAnswers");
	
		String[] s=blogDetails.split(",");
		
	String title=s[0];
	String des=s[1];
	LocalDate d=LocalDate.now();
    Blog obj=new Blog(title,des,d);
    User obj1=new User();
    System.out.println("Blog Title"+obj.getBlogTitle());
    System.out.println("Blog Description"+obj.getBlogDescription());
    System.out.println("Posted on"+obj.getDate());
    obj.getBlogDescription();
    //obj.getTitle();
		
		if(obj!=null) {
			request.setAttribute("blog",obj);
			request.setAttribute("user",obj1);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
			rd.forward(request, response);
		}
	
	}

}
