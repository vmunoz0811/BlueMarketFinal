package co.edu.unbosque.bluemarketfinal.resources;

import co.edu.unbosque.bluemarketfinal.model.User;
import co.edu.unbosque.bluemarketfinal.services.UserServices;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/users")
public class UserResource {

    private UserServices services;

    public UserResource(){
        services = new UserServices();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response register(User user) {
       User response = services.addElement(user.getName(), user.getMail(), user.getPassword(), user.getRole());
       return Response.status(201).entity(response).build();
    }


    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(User user){
        List<User> list = services.getList(user.getName(), user.getPassword());
        return Response.ok()
                       .entity(list.stream()
                       .peek(y -> System.out.println(y))
                       .filter(x -> x.getName().equals(user.getName()) && x.getPassword().equals(user.getPassword()))
                               .peek(x -> System.out.println("La persona es = " + x))
                       .findFirst()
                       .orElse(new User()))
                       .build();
    }


    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateFcoins(User user){
        return Response.ok()
                       .entity(services.updateFcoins(user.getName(), user.getFcoins()))
                       .build();
    }
}

