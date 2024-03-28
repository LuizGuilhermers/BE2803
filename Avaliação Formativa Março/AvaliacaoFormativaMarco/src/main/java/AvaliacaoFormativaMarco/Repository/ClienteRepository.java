package AvaliacaoFormativaMarco.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AvaliacaoFormativaMarco.Entities.Cliente;

interface ClienteRepository  extends JpaRepository<Cliente, Long>{

}