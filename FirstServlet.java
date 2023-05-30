import java.io.*;  
import javax.servlet.http.*;  
  
public class FirstServlet extends HttpServlet {  

    /**
     *
     * @param request
     * @param response
     */
    @Override
public void doGet(HttpServletRequest request, HttpServletResponse response){  
        try{  
  
        response.setContentType("text/html");  
            try (PrintWriter out = response.getWriter()) {
                String n=request.getParameter("userName");
                out.print("Welcome "+n);
                
                //creating form that have invisible textfield
                out.print("<form action='servlet2'>");
                out.print("<input type='hidden' name='uname' value='"+n+"'>");
                out.print("<input type='submit' value='go'>");
                out.print("</form>");
            }  
  
                }catch(Exception e){System.out.println(e);}  
    }  
  
}  