import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	
	
	public static void main(String[] args) {
		
	
		
		ArrayList<Integer> randomNumber = new ArrayList<Integer>();
		// generation du nombre Aléatoire
		for( int i = 0 ; i <4 ; i++) {
		 int n = (int)(Math.random() * 9);
			 randomNumber.add(n);
			 
		}	
		System.out.println("Le nombre Random est de "+ randomNumber);
		
		
		for (int nombreTenta = 1 ; nombreTenta <= 10 ; nombreTenta++) {
			System.out.println("Tentative numero : " + nombreTenta);
			
			boolean isValid = false;
			
			
			Scanner scanner = new Scanner(System.in);
			
		    System.out.println("Saisissez un nombre de 4 chiffres :");
		
		    String nombreSaisie = scanner.next();
		    do {
		    	if(typeOf(nombreSaisie))
		    	   if(String.valueOf(nombreSaisie).length() != 4) {
		    		   System.out.println(nombreSaisie);
				    	System.out.println("Merci de saisir un nombre de 4 chiffres ");
				    	nombreSaisie = scanner.next();
				    	if(String.valueOf(nombreSaisie).length() ==4 ) {
				    		isValid = true;
				    	}
				    }else {
				    	isValid = true;
				    }
				   
		    }while(!isValid);
		    
		    System.out.println("nombre saisie est :"+nombreSaisie);
		    
		    
		    String numberToString = String.valueOf(nombreSaisie);
		    
		    String numberArray [] = numberToString.split("");
		    
		    
		    
		   
		    ArrayList<Integer> intList = new ArrayList<Integer>(numberArray.length);
		    
		    //transformation de la string array to int
		    for (String i : numberArray)
		    {
		        intList.add(Integer.parseInt(i));
		    }
		    
		    System.out.println(intList);
		    
		    
		    if (randomNumber.equals(intList) == true) {
	            System.out.println("BRAVO !!!!");
	            break;
	        }
		    
		    
		    for (int i = 0; i<4;i++ )
		    {
		    	for(int x : intList) {
		    		if(randomNumber.get(i) == intList.get(i)) {
			    		System.out.println("#");
			    		intList.set(i,99);
			    		
			    	}
		    	}
		    	
		    	for(int z : randomNumber) {
		    		if(intList.get(i) == z ) {
		    			
		    			System.out.println("O");
		    		}
		    	}
		    }
		    
		    
           
		    
		    
		    
		 
			
			
			
		}
		
		
		
		 
		 

		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
    }

}
