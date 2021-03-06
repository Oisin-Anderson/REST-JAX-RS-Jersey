package myApp;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//Sets the path to base URL + /hello
@Path("/hello")
public class Hello {

	 // This method is called if TEXT_PLAIN is request
	 @GET
	 @Produces(MediaType.TEXT_PLAIN)
	 public String sayPlainTextHello() {
	   return "Hello text Jersey";
	 }
	 //This method is called if XML is request
	 
	 
	 @GET
	 @Produces(MediaType.TEXT_XML)
	 public String sayXMLHello() {
	   return "<?xml version=\"1.0\"?>" + "<hello> Hello XML Jersey" + "</hello>";
	 }
	
	 // This method is called if HTML is request
	 @GET
	 @Produces(MediaType.TEXT_HTML)
	 public String sayHtmlHello() {
	   return "<html> " + "<title>" + "Hello HTml Jersey" + "</title>"
	       + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
	 }

} 
