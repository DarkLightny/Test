package com.atexo;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/")
public class MyResource {
    @Inject
    Concat concat;
    @Inject
    Inscrits inscrits;

    @POST
    @Path("/person")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createClient(Criteres criteres) {

        if (criteres == null || criteres.getNom() == null || criteres.getPrenom() == null || criteres.getDate() == null)
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Missing or invalid parameters. Please provide 'nom', 'prenom', and 'date'.")
                    .build();
        concat.setCriteres(criteres);
        String formattedId = concat.toString();
        inscrits.ajouterInscrit(criteres.getNom(), criteres.getPrenom(), criteres.getDate(), formattedId);
        return Response.ok(formattedId).build();
    }

    @GET
    @Path("/inscrits")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getInscrits() {
        return Response.ok(inscrits.getListeInscrits()).build();
    }
}


