package lojajava;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

	//Variaveis 
	private Long id;
	private String descicaoVenda;
	private String NomeCliente;
	private String enderecoEntrega;
	private BigDecimal valorTotal;
	
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	// Metodo para calcular total de vendas
	private double totalVenda() {
		double total = 0.0;
		for(Produto produto : listaProdutos){
			total += produto.getValor().doubleValue();
		}
		return total;
	}
	
	//Metodos Get e Set
	public BigDecimal getValorTotal() {
		this.valorTotal = BigDecimal.valueOf(totalVenda());
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescicaoVenda() {
		return descicaoVenda;
	}

	public void setDescicaoVenda(String descicaoVenda) {
		this.descicaoVenda = descicaoVenda;
	}

	public String getNomeCliente() {
		return NomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}	
	
	//to string
	@Override
	public String toString() {
		return "Venda [id=" + id + ", descicaoVenda=" + descicaoVenda + ", NomeCliente=" + NomeCliente
				+ ", enderecoEntrega=" + enderecoEntrega + ", valorTotal=" + valorTotal + ", listaProdutos="
				+ listaProdutos + "]";
	}
}

