package laçofor;

public class numeroprimo {

	public static void main(String[] args) {
		   int primo = 1; 
	        int cont = 2;
	        
	        while (primo<=200) {
	            if (primo == 1) {
	                System.out.println(primo);
	                primo++;
	            } else {
	                cont = 2;
	                while (primo>=cont) {
	                    if (primo == 2) {
	                        System.out.println(primo + " é primo");
	                        primo++;
	                        break;
	                    }
	                    
	                    if ((primo%cont)!=0 && (primo%2)!=0 && primo!=1) {
	                        if (primo>cont && primo==(cont+1)) {
	                            System.out.println(primo + " é primo");
	                            primo++;
	                            break;
	                        }
	                        cont++;
	                        continue;
	                        
	                    } else {
	                        System.out.println(primo);
	                        primo++;
	                        break;
	                    }
	                }
	            }
	            
	        }
	    }
	

	

}
