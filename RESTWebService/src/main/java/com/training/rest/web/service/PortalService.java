package com.training.rest.web.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/portal")
public class PortalService {

	@GET
	@Path("/departments")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDepartments() {
		
		System.out.println("in getDepartments()");
		
		return null;
	}

}
