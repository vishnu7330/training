package com.training.rest.web.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.training.portal.model.Department;
import com.training.portal.service.DepartmentService;

@Path("/portal")
public class PortalController {

	private static Logger logger = LogManager.getLogger(PortalController.class);
	
	@Inject
	private DepartmentService departmentService;

	@GET
	@Path("/departments")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDepartments() {

		logger.info("in getDepartments()");
		List<Department> departments = departmentService.getDepartments();
		logger.debug(" departments : " + departments);
		return Response.ok().entity(departments).build();
	}

}
