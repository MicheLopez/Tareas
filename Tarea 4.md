package polindromos;


public class polindromos 
{
	public static void main(String[] args) 
	{
	 int hora;
	 hora = 00;
	  for (int i = 00; i < 61; i++) 
	  {		  
		if (i == 60)
		{
		  if (hora <= 22) 
		    {
			  hora++;
			  i=00;			  
		    } 
	    } else 
	       {	    	  
	       }
		int comparador;
		int res;		
		res=0;
		comparador = (i/10);
		res = (i%10);
		res = (res*10)+comparador;		
		if (res == hora) {						
			System.out.println("hora  :"+ hora + "   minuto:  " + i);		
		}	
	  }
	}
}
