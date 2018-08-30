package com.demo.app.integration;

import com.demo.app.service.business.ICD;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@ApplicationPath("/scr")
public class RestfulMappings {

    @Inject
    private ICD cdRepo;

    @Path("/all")
    @GET
    @Produces({"application/json"})
    public String getAllAccounts() {
        return cdRepo.getAllCDS();
    }

}
