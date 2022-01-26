/* Classe de serviço principal */
package com.tdorea.papaleguas.services;

import com.tdorea.papaleguas.domain.Pedido;
import org.springframework.stereotype.Service;

@Service
public interface PedidoService {

    public Pedido buscarPedidoPorId(Long id);
    
}
