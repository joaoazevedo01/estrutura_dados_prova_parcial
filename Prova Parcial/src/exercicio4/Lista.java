package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	// método para inserir um elemento na lista.
	// a inserção deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {
		No novo = new No(dado);
		
		if(inicio == null) {
			inicio = novo;
			fim = novo;
		}
		else if (inicio.dado > dado) {
			inicio.esq = novo;
			novo.dir = inicio;
			inicio = novo;
		}
		else if (fim.dado < dado) {
			fim.dir = novo;
			novo.esq = fim;
			fim = novo;
		}
		else {
			No aux = inicio;
			while(aux.dir != null && aux.dir.dado < dado) {
				aux = aux.dir;
			}
			novo.esq = aux;
			novo.dir = aux.dir;
			aux.dir.esq = aux;
			aux.dir = novo;
		}
	}
	
	// método para imprimir os elementos da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}
}

