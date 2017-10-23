import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Ordenarnumeros {

	public static void main(String[] args) {
	
		System.out.println("--Ordenar numeros en forma ascendente y descendente-- ");
		
	    /* Ordenando la lista de forma Ascendente  */
	    List<Ordenarlos> numero = new LinkedList<Ordenarlos>();
	 
	    numero.add(new Ordenarlos(16));
	    numero.add(new Ordenarlos(10));
	    numero.add(new Ordenarlos(40));
	    numero.add(new Ordenarlos(14));
	    
	    System.out.println("\t --Numeros en forma Ascendente-- ");
	    
	    Collections.sort(numero, new Comparator<Ordenarlos>() {
	 
	        @Override
	        public int compare(Ordenarlos num, Ordenarlos n) {
	            return n.getn() - num.getn();
	        }
	    });
	 
	    System.out.println(numero);
	   // Ordenando la lista de forma Descendente
	    
	    System.out.println("\t --Numeros en forma Descendente-- ");
	 
	    Collections.sort(numero, new Comparator<Ordenarlos>() {
	 
	        @Override
	        public int compare(Ordenarlos num2, Ordenarlos n1) {
	            return num2.getn() - n1.getn();
	        }
	    });
	 
	    System.out.println(numero);
	 
	}
	 
	}
		
	


