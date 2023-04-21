package entities;

public class Node {

	int valor;
	Node proximo;
	
	
	public Node() {
		
	}
	
	public Node(int valor) {
		this.valor = valor;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}

	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(valor);
		sb.append("\n");
		if(proximo != null) {
			sb.append(proximo);
		}
		
		return sb.toString();
	}

	
	
}
