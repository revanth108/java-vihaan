import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.PrintWriter;

@WebServlet("/food")
public class FoodServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
//        HttpSession session = request.getSession(false);
//        if (session == null || session.getAttribute("username") == null) {
//            response.sendRedirect("login.html");
//            return;
//        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Available Food Items</h2><ul>");

        try (Connection conn = DBConnection.getConnection()) {
            String query = "SELECT * FROM food_items";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                out.println("<li>" + rs.getString("name") + " - ₹" + rs.getDouble("price") + "</li>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        out.println("</ul><a href='logout'>Logout</a>");
    }
}
