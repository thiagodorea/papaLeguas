/* Classe Restcontroller ou Endpoint */
package com.tdorea.papaleguas.resources;

import com.tdorea.papaleguas.domain.Pedido;
import com.tdorea.papaleguas.dto.PedidoDto;
import com.tdorea.papaleguas.services.PedidoServiceImp;
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
@RequestMapping(value = "pedido")
public class PedidoResource {

    @Autowired
    private PedidoServiceImp pedidoServiceImp;

    @PersistenceContext
    private EntityManager manager;

    @GetMapping("/{id}")
    public PedidoDto pedidosDto(@PathVariable Long id) {
        Pedido pedido = this.pedidoServiceImp.buscarPedidoPorId(id);
        return new PedidoDto(pedido);
    }
 }
    
