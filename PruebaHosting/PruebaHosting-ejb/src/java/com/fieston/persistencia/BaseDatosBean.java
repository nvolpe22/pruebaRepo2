/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieston.persistencia;

import com.fieston.cliente.entity.Cliente;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

/**
 *
 * @author nvolpe
 */
@Singleton
public class BaseDatosBean implements BaseDatosBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private ArrayList<Cliente> listaClientes;

    public BaseDatosBean() {
        init();
        listaClientes = new ArrayList<Cliente>();
    }

     @PostConstruct
    private void init(){
     listaClientes = new ArrayList<Cliente>();
    }
    
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    @Override
    public void agregarCliente(Cliente cNuevo) {
System.out.println("ENTRE AL AGREGAR DE BD BEAN");
        listaClientes.add(cNuevo);

    }

    
   
    
}
