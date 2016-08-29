
public class askisi4B {
	1.	// To save as "<CATALINA_HOME>\webapps\helloservlet\WEB-INF\src\HelloServlet.java"
	2.	//catalina is Tomact’s servlet container
	3.	import java.io.*;
	4.	import javax.servlet.*;
	5.	import javax.servlet.http.*;
	6.	import java.util.Date;

	7.	public class HelloServlet extends HttpServlet {
	8.	@Override
	9.	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	10.	// Set the response message's MIME type
	11.	response.setContentType("text/html;charset=UTF-8");
	12.	// Allocate an output writer to write the response message into the network socket
	13.	PrintWriter out = response.getWriter();

	14.	// Write the response message, in an HTML page
	15.	try {
	16.	out.println("<!DOCTYPE html>");
	17.	out.println("<html><head>");
	18.	out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
	19.	out.println("<title>Hello, World</title></head>");
	20.	out.println("<body>");
	21.	out.println("<h1>Hello, world!</h1>");  // says Hello
	22.	// Echo client's request information
	23.	out.println("<p>Request URI: " + request.getRequestURI() + "</p>");
	24.	out.println("<p>Protocol: " + request.getProtocol() + "</p>");
	25.	out.println("<p>PathInfo: " + request.getPathInfo() + "</p>");
	26.	out.println("<p>Remote Address: " + request.getRemoteAddr() + "</p>");
	27.	// Generate current datetime
	28.	String now = new Date().toString();
	29.	out.println("<p>Datetime: <strong>" + now + "</strong></p>");
	30.	out.println("</body>");
	31.	out.println("</html>");
	32.	} finally {
	33.	out.close();  // Always close the output writer
	34.	}
	35.	}
	36.	}
}
