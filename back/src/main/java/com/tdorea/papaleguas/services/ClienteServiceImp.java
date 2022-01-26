/* Classe de serviço implemntação */
package com.tdorea.papaleguas.services;

import com.tdorea.papaleguas.domain.Cliente;
import com.tdorea.papaleguas.exception.ObjectNotFoundException;
import com.tdorea.papaleguas.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImp implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente buscarClientePorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if(cliente == null) {
            try {
                throw new ObjectNotFoundException(
                    "Cliente não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()); 
            }
            catch (ObjectNotFoundException e) {
                    e.printStackTrace();
            }
        }
        return clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não localizado"));
    }
    
}
