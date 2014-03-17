// Filename: HelloServlet.java
// Compile: javac HelloServlet.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
                    throws ServletException, IOException {
        // 下面兩行讓中文字能正確顯示
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<BODY>");
        out.println("<p>Hello! 這是我的第一支 Java servlet 程式(for war deployment)。</p>");
        out.println("</BODY>");
        out.println("</HTML>");
  }
}