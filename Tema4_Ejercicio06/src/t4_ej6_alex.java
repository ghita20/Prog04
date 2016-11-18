import java.util.Scanner;

public class t4_ej6_alex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase, vocales="aeiou", numero="0123456789";
		int i=0,k=0,n=0,vocal=0,numeros=0,consonante=0;
		frase=teclado.nextLine();
		while(i<frase.length()){
			while(k<numero.length()){
				if(frase.charAt(i)==numero.charAt(k)){
					numeros++;
					i++;
					k=0;}
				else 
					k++;
				}
			}System.out.println(numeros);
		}
	}


