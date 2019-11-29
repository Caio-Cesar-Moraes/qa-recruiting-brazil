package model;

public class Produto {

	private int produtoA = 50;
	private int produtoB = 30;
	private int produtoC = 20;
	private int produtoD = 15;
	private int descontoA = 20;
	private int descontoB = 15;
	private char item;

	public Produto() {
		super();
		this.produtoA = produtoA;
		this.produtoB = produtoB;
		this.produtoC = produtoC;
		this.produtoD = produtoD;
	}

	public int getProdutoA() {
		return produtoA;
	}

	public void setProdutoA(int produtoA) {
		this.produtoA = produtoA;
	}

	public int getProdutoB() {
		return produtoB;
	}

	public void setProdutoB(int produtoB) {
		this.produtoB = produtoB;
	}

	public int getProdutoC() {
		return produtoC;
	}

	public void setProdutoC(int produtoC) {
		this.produtoC = produtoC;
	}

	public int getProdutoD() {
		return produtoD;
	}

	public void setProdutoD(int produtoD) {
		this.produtoD = produtoD;
	}

	public int getDescontoA() {
		return descontoA;
	}

	public void setDescontoA(int descontoA) {
		this.descontoA = descontoA;
	}

	public int getDescontoB() {
		return descontoB;
	}

	public void setDescontoB(int descontoB) {
		this.descontoB = descontoB;
	}

	public char getItem() {
		return item;
	}

	public void setItem(char c) {
		this.item = c;

	}

}
