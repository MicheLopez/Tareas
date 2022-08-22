package arbol;

public class estructura {

	public static void main (String[] args) {
		 nodo Nodo= new nodo();
	       
	       
	       Nodo.insertar(20, "");
	       Nodo.insertar(23, "");
	       Nodo.insertar(19, "");
	       Nodo.insertar(57, "");
	       Nodo.insertar(67, "");
	       Nodo.insertar(99, "");
	       
	       Nodo.recorrer(Nodo.raiz.izquierda);
	       Nodo.recorrer(Nodo.raiz.izquierda);
	}
	
}
