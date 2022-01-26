/* Classe Restcontroller ou Endpoint */
package com.tdorea.papaleguas.resources;

import com.tdorea.papaleguas.domain.Cliente;
import com.tdorea.papaleguas.dto.ClienteDto;
import com.tdorea.papaleguas.services.ClienteServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RestController
@Component
@RequestMapping(value = "cliente")
public class ClienteResource {

    @Autowired
    private ClienteServiceImp clienteServiceImp;

    @PersistenceContext
    private EntityManager manager;

    @GetMapping("/{id}")
    public ClienteDto clientesDto(@PathVariable Long id) {
        Cliente cliente = this.clienteServiceImp.buscarClientePorId(id);
        return new ClienteDto(cliente);
    }
 }
    

