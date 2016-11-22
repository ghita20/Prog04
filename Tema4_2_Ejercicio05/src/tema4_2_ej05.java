//Programa que intercambia la ultima y primera palabra de una frase
import java.util.Scanner;

public class tema4_2_ej05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase,nuevaFrase="";
		
		System.out.println("Introduce la frase: ");
		frase=teclado.nextLine();
		
		//agrego la ultima letra
		nuevaFrase+=frase.charAt(frase.length()-1);
		//agrego el substring desde 1 a length -1
		nuevaFrase+=frase.substring(1, frase.length()-1);
		//agrego la primera letra para que sea la ultima
		nuevaFrase+=frase.charAt(0);
		
		System.out.println(nuevaFrase);
		
	}

}
