/* Classe Repository */
package com.tdorea.papaleguas.repositories;

import com.tdorea.papaleguas.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
    public Optional<Cliente> findById(Long id);
}
