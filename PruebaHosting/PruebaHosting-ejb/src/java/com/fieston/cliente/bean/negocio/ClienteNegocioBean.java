/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieston.cliente.bean.negocio;

import com.fieston.cliente.bean.persistencia.ClientePersistenciaBeanLocal;
import com.fieston.cliente.entity.Cliente;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author nvolpe
 */
@Stateless
public class ClienteNegocioBean implements ClienteNegocioBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @EJB
    ClientePersistenciaBeanLocal clientePersistencia;
    
    @Override
    public void agregarCliente(Cliente cNuevo){
        System.out.println("ENTRE AL AGREGAR DE CLIENTE NEGOCIO BEAN");
        clientePersistencia.agregarCliente(cNuevo);
    }
    
}
