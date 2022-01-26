/* Classe de serviço principal */
package com.tdorea.papaleguas.services;

import com.tdorea.papaleguas.domain.Cliente;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {
    
    public Cliente buscarClientePorId(Long id);
}
