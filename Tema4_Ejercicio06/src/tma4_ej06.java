//programa que imprime las vocales, consonantes y caracteres de una frase
import java.util.Scanner;

public class tma4_ej06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase,vocales="aeiou";
		boolean esVocal;
		int cantidadVocal=0,cantidadCons=0,cantidadCarac=0;
		do{
			System.out.println("Introduce la frase: ");
			frase=teclado.nextLine();
		}while(frase.length()>80);
		
		for(int i=0;i<frase.length();i++){
			//compruebo que sea un caracter alfabetico
			if(Character.isAlphabetic(frase.charAt(i))){
				//compruebo que sea vocal
					esVocal=false; //reinicializo la variable para cada caracter
						//si encuentro que es vocal salgo del bucle
					for(int k=0;k<vocales.length() && !esVocal;k++)
						esVocal=frase.charAt(i)==vocales.charAt(k)?true:false;
				//si es vocal
				if(esVocal)
					cantidadVocal++;
				else
					cantidadCons++; //si es consonante
			}else if(frase.charAt(i)!=' ') //si no es un espacio, (no quiero que me cuente los espacios como caracteres)
					cantidadCarac++; //si no está en el alfabeto será un caracter
			
		}
		
		System.out.println("La cantidad de vocales : " +cantidadVocal);
		System.out.println("La cantidad de consonantes : " +cantidadCons);
		System.out.println("La cantidad de caracteres :" +cantidadCarac);
		
	}

}
