/* Classe Repository */
package com.tdorea.papaleguas.repositories;

import com.tdorea.papaleguas.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    
    public Optional<Pedido> findById(Long id);
}
