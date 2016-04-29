/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieston.cliente.bean.negocio;

import com.fieston.cliente.entity.Cliente;
import javax.ejb.Local;

/**
 *
 * @author nvolpe
 */
@Local
public interface ClienteNegocioBeanLocal {
    public void agregarCliente(Cliente cNuevo);
}
