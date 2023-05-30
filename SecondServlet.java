import java.io.*;  
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.*;  
public class SecondServlet extends HttpServlet {  

    private static final long serialVersionUID = 1L;
    private Exception e;

    /**
     *
     * @param request
     * @param response 
     */
    //@Override
    @Override
     public void doGet(HttpServletRequest request, HttpServletResponse response){        response.setContentType("text/html");  
        //<editor-fold defaultstate="collapsed" desc="comment">
       // public Exception doGet(HttpServletRequest request, HttpServletResponse response){
//</editor-fold>
 PrintWriter out = null;  
        try {
            out = response.getWriter();
        } catch (IOException ex) {
            Logger.getLogger(SecondServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        //Getting the value from the hidden field  
        String n=request.getParameter("uname");  
        out.print("Hello "+n);  
  
        out.close();  
//<editor-fold defaultstate="collapsed" desc="comment">
/*    }catch(private Exception e){System.out.println(getE());}*/
        //</editor-fold>
        /**
         * @return the e
         */
        // public Exception getE() {
        //  Exception e = null;
    }

    /**
     * @param e the e to set
     */
    public void setE(Exception e) {
        this.e = e;
    }
    }  