import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       float firstN = Float.parseFloat(request.getParameter("firstO"));
       float secondN = Float.parseFloat(request.getParameter("secondO"));
       String operator = request.getParameter("Operator");
       float result = Calculator.calculate(firstN,secondN,operator);

       PrintWriter writer = response.getWriter();
       writer.println("<html>");
       writer.println("<h2>Result:<h2>");
       writer.println(firstN + operator + secondN +" = " + result);
       writer.println("</html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
