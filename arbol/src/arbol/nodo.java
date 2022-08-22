package arbol;

public class nodo {
	
	Nodo raiz;
	public nodo (  ) {
		raiz=null;
	}
	
	public void insertar(int i, Object sorpresa) {
	Nodo n=new Nodo(i);
	n.numero=sorpresa;
	
	if (raiz==null) {
		raiz=n;
	}else {
		    Nodo aux=raiz;
		    
		    while(aux!=null) {
		    	n.head=aux; 
		    	if(n.llave>=aux.llave){
                aux=aux.derecha;
		    	}else { 
		    		   aux=aux.izquierda;
		    	      }
		    }
		    if(n.llave<n.head.llave){
                n.head.izquierda=n;
            }else{
                n.head.derecha=n;
            }
	      }

	}
	
    public void recorrer(Nodo n){
        if(n !=null){
            recorrer(n.izquierda);
            System.out.println("indice"+n.llave+"nunero"+n.numero);
            recorrer(n.derecha);
            
        }
    }
	
class Nodo
{
	public Nodo head;
	
	public Nodo derecha;
	public Nodo izquierda ;
	public int llave;
	public Object numero;
	
	  public Nodo(int indice) 
	  {
		llave=indice;
		derecha=null;
		izquierda=null;
		head=null;
		numero=null;
		
		
		
		  
	  }
}

}
