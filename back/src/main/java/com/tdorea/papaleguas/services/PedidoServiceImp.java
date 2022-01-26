/* Classe de serviço implemntação */
package com.tdorea.papaleguas.services;

import com.tdorea.papaleguas.domain.Pedido;
import com.tdorea.papaleguas.exception.ObjectNotFoundException;
import com.tdorea.papaleguas.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoServiceImp implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public Pedido buscarPedidoPorId(Long id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        if (pedido == null) {
            try {
                throw new ObjectNotFoundException(
                        "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName());
            } catch (ObjectNotFoundException e) {
                e.printStackTrace();
            }
        }
        return pedidoRepository.findById(id).orElseThrow(() -> new RuntimeException("Pedido não encontrato"));
    }
    
    
}
