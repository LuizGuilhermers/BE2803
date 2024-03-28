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
@Table(name = "Item Pedido")
public class Itempedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name ="id", nullable = false)
	private Long id;
	
	private int quantidade;
	
	private double valorunitario;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "id_produto", nullable = false)
	private Produto Produto;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pedido", nullable = false)
	private Pedido Pedido;

}
