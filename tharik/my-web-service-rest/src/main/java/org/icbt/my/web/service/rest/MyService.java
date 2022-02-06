/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.my.web.service.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author tharik
 */
@Path("/my-service")
public class MyService {
    @GET
    public Response getMessage(){
       return Response.status(200).entity("Hello World").build();
    }
    
    @GET
    @Path("/hello/{message}")
    public Response getMessage2(@PathParam("message") String message){
       return Response.status(200).entity(message).build();
    }
}
