package AvaliacaoFormativaMarco.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AvaliacaoFormativaMarco.Entities.Cliente;
import AvaliacaoFormativaMarco.Repository.ClienteRepository;

@Service
public class ClienteService {
	
private final ClienteRepository ClienteRepository;
	
	@Autowired
	public ClienteService (ClienteRepository ClienteRepository) {
		this.ClienteRepository = ClienteRepository;
	}
	
	public Cliente saveCliente (Cliente Cliente) {
		return ClienteRepository.save(Cliente);
	}

	public Cliente getClienteById (Long id) {
		Optional<Cliente> Cliente = ClienteRepository.findById(id);
		return Cliente.orElse(null);
	}

	public List<Cliente> getAllCliente(){
		return ClienteRepository.findAll();
	}
	public Cliente updateCliente(Long id, Cliente updatedCliente) {
		Optional<Cliente> existingCliente = ClienteRepository.findById(id);

		if (existingCliente.isPresent()) {
			updatedCliente.setId(id);
			return ClienteRepository.save(updatedCliente);
		}
		return null;
	}

		public boolean deleteCliente(Long id) {
			Optional <Cliente> existingCliente = ClienteRepository.findById(id);
			if (existingCliente.isPresent()) {
				ClienteRepository.deleteById(id);
				return true;
			}
			return false;

		}

	


}