package controle;

import java.util.ArrayList;

import model.Produto;

/* 
 * METODO CONSTRUTOR
 * */
public class Checkout {

	ArrayList<Produto> produtos = new ArrayList<Produto>();

	/*
	 * INSTANCIA A LISTA DE PRODUTOS ATRAVÉS DO ITENS
	 * 
	 * @PARAM itensProdutos
	 */
	public Checkout() {
		produtos = new ArrayList<Produto>();
	}

	public void scan(String itensProdutos) {

		Produto produto;

		for (int i = 0; i < itensProdutos.length(); i++) {

			produto = new Produto();

			switch (itensProdutos.charAt(i)) {

			case 'A':
				produto.setItem('A');
				produtos.add(produto);
				break;

			case 'B':
				produto.setItem('B');
				produtos.add(produto);
				break;

			case 'C':
				produto.setItem('C');
				produtos.add(produto);
				break;

			case 'D':
				produto.setItem('D');
				produtos.add(produto);
				break;

			default:
				break;

			}

		}

	}

	/*
	 * CALCULA A REGRA DE NEGOCIOS DO PRODUTO
	 * 
	 * @return
	 */
	public int total() {
		int contA = 0;
		int contB = 0;
		int total = 0;

		for (Produto produto : produtos) {

			if (produto.getItem() == 'A') {
				contA++;
				total += produto.getProdutoA();

				if (contA == 3) {
					total -= produto.getDescontoA();
					contA = 0;
				}
			} else if (produto.getItem() == 'B') {
				contB++;
				total += produto.getProdutoB();
				if (contB == 2) {
					total -= produto.getDescontoB();
					contB = 0;
				}
			} else if (produto.getItem() == 'C') {
				total += produto.getProdutoC();
			} else if (produto.getItem() == 'D') {
				total += produto.getProdutoD();
			}

		}
		return total;
	}
}
