package thecodinglive.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/newcookie"})
public class CookieCreateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html><head><title> Cookie Example </title></head><body>");
        writer.println("<br/>");

        Cookie cookie = new Cookie("jpub", "books");
        cookie.setMaxAge(3600);
        resp.addCookie(cookie);
        writer.println("<a href='/readcookie'>readcookie</a></body></html>");
    }
}
