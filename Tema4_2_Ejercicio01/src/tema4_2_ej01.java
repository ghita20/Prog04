//Programa que dada una palabra pone cada ocurrencia de esa palabra en la frase en mayuscula
import java.util.Scanner;

public class tema4_2_ej01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase,nuevaFrase="";
		char palabra;
		
		System.out.println("Introduce una frase: ");
		frase=teclado.nextLine();
		
		System.out.println("Introduce una palabra: ");
		palabra=teclado.nextLine().charAt(0);
		
		for(int i=0;i<frase.length();i++)
			//si el carácter es igual a la palabra lo pongo en mayuscula
			nuevaFrase+=frase.charAt(i)==palabra?Character.toUpperCase(palabra):frase.charAt(i);
		
		System.out.println(nuevaFrase);
	}

}
