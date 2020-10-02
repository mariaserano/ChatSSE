import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class checkMsg extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{		
	
		// Initialize lastValue for each student running the servlet
		int lastValue=-1;
		
		// Set response content type
       	        response.setContentType("text/event-stream");
		response.setCharacterEncoding("UTF-8");
		
                 PrintWriter out = null;
		
		// Get username for explanation matters
		String username = request.getParameter("username");
	
     	        try {
                        out = response.getWriter();
                } catch (IOException io) {
                        System.out.println("Exception creating PrintWriter");
                }
		
		// Uncomment for checking that each user joining the group starts with no messages read 
		/* System.out.println("NEW CONNECTION: Array length is: " + Item.messageQueue.size());
		System.out.println("NEW CONNECTION: Last value is: " + lastValue); */
		
		while(true){
			for (int i=(lastValue+1); i<Item.messageQueue.size(); i++){
				String next = "data: " + ">> " + Item.messageUsername.elementAt(i) + " said: " + Item.messageQueue.elementAt(i) + "\n\n"; 
				System.out.println("next: " + next);
				out.write(next);
				out.flush();
				lastValue++;
			}
			
			try{
				Thread.sleep(2000);  //Change for faster replies
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			
		}
	}
}
