package com.HelloRest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.HelloRest.StudentTo;


@Path("/firstrs")
public class HelloRS {

	@GET
	@Path("/getstudent")
	@Produces(MediaType.APPLICATION_JSON)
	//@Produces("text/plain")
	
	public StudentTo getStudent() {
        StudentTo st = new StudentTo();
        st.setSname("JavaLearners");
        st.setSaddress("Hyderabad");
		return st;

	}
	
	@GET
	@Path("/getName")
	//@Produces(MediaType.APPLICATION_JSON)
	@Produces("text/plain")
	
public String getName()
{
	return "ravi";
	}
	
}
