import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class sendMsg extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{		
	
		// Set response content type
                response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
                PrintWriter out = null;
		
		//Get message and username values
		String msg = request.getParameter("msg");
		String username = request.getParameter("username");
		
		System.out.println("------------------------------------");
		System.out.println("***MESSAGE SENT***");
		System.out.println("Message is: " + msg);
		System.out.println("Username is: "+ username);
		//Uncomment for checking that the messageQueue array works correctly
		/* System.out.println("Message array is: ");	
		for (String i :  Item.messageQueue){
			System.out.println(i);
		}  */
		System.out.println("------------------------------------");
		
		//Add new message to messageQueue array and username to messageUsername
		Item.messageQueue.addElement(msg);
		Item.messageUsername.addElement(username);
		Item.number = Item.number + 1;
		
                try {
             	    out = response.getWriter();
                } catch (IOException io) {
                    System.out.println("Exception creating PrintWriter");
                }
		
		//AJAX, show the user that sent the message that it was sent correctly
		String next = "Sent!";
		out.write(next);
		out.flush();
	}
}
