//Programa que imprime la cantidad de mayusculas, minusculas y numeros de una frase
import java.util.Scanner;

public class tema4_ej07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int mayusculas=0,minusculas=0,numeros=0;
		System.out.println("Introduce la frase: ");
		String frase=teclado.nextLine();
		
		for(int i=0;i<frase.length();i++){
			//compruebo que sea mayuscula desde 'A' - 'Z'
			mayusculas=frase.charAt(i)>='A' && frase.charAt(i)<='Z'?++mayusculas:mayusculas;
			//compruebo que sea minuscula desde 'a' - 'z'
			minusculas=frase.charAt(i)>='a' && frase.charAt(i)<='z'?++minusculas:minusculas;
			//compruebo que sea numero desde '0' - '9'
			numeros=frase.charAt(i)>='0' && frase.charAt(i)<='9'?++numeros:numeros;
			
			}
		System.out.println("Cantidad de mayúsculas: " +mayusculas);
		System.out.println("Cantidad de minúsculas: " +minusculas);
		System.out.println("Cantidad de números: " +numeros);
	}

}
