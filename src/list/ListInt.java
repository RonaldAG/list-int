package list;

import java.util.List;

import entities.Node;

public class ListInt {
	private Node node;
	private int size;
	
	public ListInt() {
		this.node = new Node();
	}
	
	public void add(int n){
		//Verify the first value
		if(node.getValor() == 0) {
			node.setValor(n);
		}
		else {
			Node aux = node;
			
			while(aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(new Node(n));	
		}
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public void remove(int n) {
		if(node.getValor() == n) {
			node = node.getProximo();
		}
		else {
			Node aux = node;
			
			while(aux.getProximo() != null) {
				
				if(aux.getProximo().getValor() == n) {
					aux.setProximo(aux.getProximo().getProximo());
					break;
				}
				
				aux = aux.getProximo();
			}
		}
	}
	
	//LISTA COMEÇA NA POSIÇÃO 1
	public int get(int posicao) {
		Node aux = node;
		int counter = 0;
		
		while(aux != null) {
			counter++;
			if(counter == posicao) {
				return aux.getValor();
			}
			aux = aux.getProximo();
		}
		
		return -1;
	}
	
	
	public void insert(int posicao, int n) {
		Node novo = new Node(node.getValor());
		if(posicao == 1) {
			novo.setProximo(node.getProximo());
			node.setValor(n);
			node.setProximo(novo);
		}
		else {
			Node aux = node;
			int counter = 1;
			
			
			while(aux != null) {
				if(counter + 1 == posicao) {
					Node proximo = aux.getProximo();
					novo.setProximo(proximo);
					aux.setProximo(novo);
					break;
				}
				counter++;
				aux = aux.getProximo();
			}	
		}
	}
	
	public boolean contains(int n) {
		Node aux = node;
		
		while(aux != null) {
			if(aux.getValor() == n) {
				return true;
			}
			aux = aux.getProximo();
		}
		
		return false;
	}

	@Override
	public String toString() {
		return node.toString();
	}
	
	
}
