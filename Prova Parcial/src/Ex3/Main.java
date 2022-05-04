package Ex3;

public class Main {
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		// inserção dos elementos na lista
		lista.inserir(1);
		lista.inserir(2);
		lista.inserir(3);
		lista.inserir(4);
		lista.inserir(5);
		
		// inverte os elementos da lista
		inverter(lista);
		
		// imprime os elementos da lista
		lista.imprimir();
	}
	
	public static void inverter(Lista lista) {
		No aux = lista.fim;
		No aux2;
		lista.inicio = aux;
		
		while(aux.esq != null) {
			aux2 = aux.esq;
			aux.esq = aux.dir;
			aux.dir = aux = aux2;
		}
		
		lista.fim = aux;
		aux.esq = aux.dir;
		aux.dir = null;
		
	}
}

