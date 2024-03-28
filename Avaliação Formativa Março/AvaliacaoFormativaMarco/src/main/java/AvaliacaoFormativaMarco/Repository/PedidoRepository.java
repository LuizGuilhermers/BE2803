package AvaliacaoFormativaMarco.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AvaliacaoFormativaMarco.Entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{ 

}
