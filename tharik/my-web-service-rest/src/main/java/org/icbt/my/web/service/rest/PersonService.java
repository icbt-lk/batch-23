/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.my.web.service.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author tharik
 */
@Path("/person")
public class PersonService {
    @GET
    @Path("search/{text}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPerson(@PathParam("text") String text){
      DBUtil util = new DBUtil();
      Gson gson = new GsonBuilder().create();
      return gson.toJson(util.searchPerson(text));
    }
    
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPerson(@PathParam("id") int id){
      DBUtil util = new DBUtil();
      Gson gson = new GsonBuilder().create();
      return gson.toJson(util.getPerson(id));
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getPersons(){
      DBUtil util = new DBUtil();
      Gson gson = new GsonBuilder().create();
      return gson.toJson(util.getPersons());
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addPerson(String json) {
        Person person = new Gson().fromJson(json, Person.class);
        DBUtil util = new DBUtil();
        boolean result = util.addPerson(person);
        int status = 0;
        
        ResponseMessage responseMessage = new ResponseMessage();
        if (result) {
            responseMessage.setMessage("Sucessfully added");
            status = 200;
        } else {
            responseMessage.setMessage("Error occurred");
            status = 501;
        }
            
        Gson gson = new GsonBuilder().create();
        return Response.status(status).entity(gson.toJson(responseMessage)).build();
    }
    
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updatePerson(String json) {
        Person person = new Gson().fromJson(json, Person.class);
        DBUtil util = new DBUtil();
        boolean result = util.updatePerson(person);
        int status = 0;
        
        ResponseMessage responseMessage = new ResponseMessage();
        if (result) {
            responseMessage.setMessage("Sucessfully updated");
            status = 200;
        } else {
            responseMessage.setMessage("Error occurred");
            status = 501;
        }
            
        Gson gson = new GsonBuilder().create();
        return Response.status(status).entity(gson.toJson(responseMessage)).build();
    }
    
    @DELETE
    @Path("/{id}")
    public Response deletePerson(@PathParam("id") int id) {
        DBUtil util = new DBUtil();
        boolean result = util.deletePerson(id);
        int status = 0;
        
        ResponseMessage responseMessage = new ResponseMessage();
        if (result) {
            responseMessage.setMessage("Sucessfully deleted");
            status = 200;
        } else {
            responseMessage.setMessage("Error occurred");
            status = 501;
        }
            
        Gson gson = new GsonBuilder().create();
        return Response.status(status).entity(gson.toJson(responseMessage)).build();
    }
}
