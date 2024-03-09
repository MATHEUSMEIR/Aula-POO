package lojajava;

import java.math.BigDecimal;

public class ExecutarTeste {

		public static void main(String[] args) {
			
			Produto produto1 = new Produto();
			
			produto1.setId(Long.valueOf(645));
			produto1.setNome("Desktop");
			produto1.setValor(BigDecimal.valueOf(50.0));
			
			Produto produto2 = new Produto();
			
			produto2.setId(Long.valueOf(102));
			produto2.setNome("Teclado");
			produto2.setValor(BigDecimal.valueOf(100.0));
			
			Produto produto3 = new Produto();
			
			produto3.setId(Long.valueOf(469));
			produto3.setNome("Mouse");
			produto3.setValor(BigDecimal.valueOf(40.0));
			
			Produto produto4 = new Produto();
			
			produto4.setId(Long.valueOf(178));
			produto4.setNome("Mouse Pad");
			produto4.setValor(BigDecimal.valueOf(10.0));
			
			
			Venda venda = new Venda();
			
			venda.setId(Long.valueOf(001));
			venda.setNomeCliente("Matheus");
			venda.setDescicaoVenda("Venda PC");
			venda.setEnderecoEntrega("Rua dos Lampeões");
			venda.setValorTotal(BigDecimal.valueOf(184.0));
			
			
			venda.getListaProdutos().add(produto1);
			venda.getListaProdutos().add(produto2);
			venda.getListaProdutos().add(produto3);
			venda.getListaProdutos().add(produto4);
			
			
			System.out.println("Descrição venda: " + venda.getDescicaoVenda());
			
			System.out.println("Valor da variavel total venda: " + venda.getValorTotal());
		}
	}