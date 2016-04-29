/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieston.cliente.bean.persistencia;

import com.fieston.cliente.entity.Cliente;
import com.fieston.persistencia.BaseDatosBeanLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author nvolpe
 */
@Stateless
public class ClientePersistenciaBean implements ClientePersistenciaBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @EJB
    BaseDatosBeanLocal baseDatos;
    
    @Override
    public void agregarCliente(Cliente cNuevo){
    System.out.println("ENTRE AL AGREGAR DE CLIENTE PERSISTENCIA BEAN");
        baseDatos.agregarCliente(cNuevo);
    }
    
}
