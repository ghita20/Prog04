import java.util.Scanner;

public class t4_ej6_alex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase, vocales="aeiou", numero="0123456789";
		int i=0,k=0,n=0,vocal=0,numeros=0,consonante=0;
		boolean cosa=true;
		do{
			System.out.println("Introduce una frase: ");
			frase=teclado.nextLine().toLowerCase();
		}while(frase.length()>80);
		while(i<frase.length()){
			k=0; cosa=true;

			while(k<numero.length() && cosa){

				if(frase.charAt(i)==numero.charAt(k)){
					numeros++;	
					cosa=false;
				}

				k++;
			}
			if(cosa==true){
				k=0;
			while(k<vocales.length() && cosa){
				if(frase.charAt(i)==vocales.charAt(k)){
					vocal++;
					cosa=false;}		
				k++;	
			}//final vocales
			if(cosa==true)
				if(frase.charAt(i)>'a' && frase.charAt(i)<='z')
				consonante++;
			}
			
					
				
					

			i++;
		}System.out.println("Numeros= "+ numeros +" Vocales: "+ vocal +" Consonantes: "+ consonante);
	}}



