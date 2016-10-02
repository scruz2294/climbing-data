package com.exscruzme.rest;

import com.exscruzme.rest.model.Route;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Created by stephaniecruz on 10/1/16.
 * This is the primary endpoint for this application
 */

@Path("/routes")
public class ClimbingDataService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        ObjectMapper mapper = new ObjectMapper();

        List<Route> routes = new ArrayList<Route>();
        Route r1 = new Route("Super Mario", "Little Rock City", "TN, USA", "V4", 3);
        Route r2 = new Route("Swingers", "Little Rock City", "TN, USA", "V3", 3);
        Route r3 = new Route();
        routes.add(r1);
        routes.add(r2);
        routes.add(r3);
        try {
            String jsonRoutes = mapper.writeValueAsString(routes);
            return Response.ok().entity(jsonRoutes).build();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return Response.serverError().build();
    }

    @GET
    @Path("/hello")
    public Response hello() {
        String msg = "YAY MY API FINALLY WORKS";
        return Response.ok().entity(msg).build();
    }
    @GET
    @Path("/echo/{message}")
    public Response echo(@PathParam("message") String msg) {
        return Response.ok().entity(msg).build();
    }
}
