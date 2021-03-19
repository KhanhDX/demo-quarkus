package com.dxkhanh;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Hihi hello() {
        Hihi hihi = new Hihi("Khanh");

        System.out.println("Hello RESTEasy");
        return hihi;
    }


}