

package com.usa.reto3.repositorios.interfaces;


import com.usa.reto3.modelos.Cliente;
import org.springframework.data.repository.CrudRepository;



public interface InterfaceCliente extends CrudRepository<Cliente,Integer> {
    
}


