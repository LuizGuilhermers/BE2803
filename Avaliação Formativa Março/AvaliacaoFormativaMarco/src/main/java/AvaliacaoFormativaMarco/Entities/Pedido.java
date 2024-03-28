package AvaliacaoFormativaMarco.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name ="id", nullable = false)
	private Long id;
	
	private String data_pedido;
	
	private String valor_total;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "id_fornecedor", nullable = false)
	private Fornecedor Forecedor;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente", nullable = false)
	private Cliente Cliente;

}