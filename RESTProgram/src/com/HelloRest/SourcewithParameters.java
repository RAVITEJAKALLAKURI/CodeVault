package com.HelloRest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/getValues/{fooID}")
public class SourcewithParameters 

{

	@GET
	@Path("/getValues/{fooID}")
	@Produces(MediaType.APPLICATION_JSON)
	//@Produces("text/plain")
	
	public Response getValues(@PathParam("fooID") String id) {
		return null;
		//return id;
       

	}
}
