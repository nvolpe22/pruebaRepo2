/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieston.servicios.cliente;

import com.fieston.cliente.bean.negocio.ClienteNegocioBeanLocal;
import com.fieston.cliente.entity.Cliente;
import com.google.gson.Gson;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * REST Web Service
 *
 * @author nvolpe
 */
@Path("clientes")
public class ClientesResource {

    @Context
    private UriInfo context;

    @EJB
    ClienteNegocioBeanLocal clienteBean;

    /**
     * Creates a new instance of ClientesResource
     */
    public ClientesResource() {
    }

    /**
     * Retrieves representation of an instance of
     * com.fieston.servicios.cliente.ClientesResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        System.out.println("VAPAI");
        return "HOLAAAA";
    }

    /**
     * PUT method for updating or creating an instance of ClientesResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }

    @POST
    @Path("agregarCliente")
    @Consumes("application/x-www-form-urlencoded")
    public Response agregarCliente(@FormParam("nombre") String nombre) {

        Gson gson = new Gson();
        String json;

        System.out.println("ENTRE AL METODO con nombre " + nombre);
        Cliente cNuevo = new Cliente();
        cNuevo.setNombre(nombre);
        System.out.println("SETIE NOMBRE");
        clienteBean.agregarCliente(cNuevo);

        json = gson.toJson("OK: EL CLIENTE HA SIDO AGREGADO CORRECTAMENTE");

        //Retornamos
        return Response.ok(json).build();

    }
}
