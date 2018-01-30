package com.nneville.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;


@Path("/dbProduct")
public class DBProduct {
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		String output = "le code barre est : " + msg;

		Gson json = new Gson();
		return Response.status(200).entity(json.toJson(output)).build();

	}

}
