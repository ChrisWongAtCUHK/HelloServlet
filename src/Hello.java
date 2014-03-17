import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hello extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 下面兩行讓中文字能正確顯示
        response.setContentType("text/html; charset=big5");
        request.setCharacterEncoding("big5");

        PrintWriter out = response.getWriter();

        String UserID = request.getParameter("UserID");
        out.println("<html><body>");
        out.println("您好, " + UserID + " is handsome.");
        out.println("</body></html>");
    }

    public String getServletInfo() {
        return "A servlet that knows the user ID";
    }
}
