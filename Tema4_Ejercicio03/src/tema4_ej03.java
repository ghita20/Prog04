//Programa que lee una frase y una palabra y nos dice su posición en la frase
//si no está devuelve un 0
import java.util.Scanner;

public class tema4_ej03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase, palabra; 
		
		System.out.println("Introduce una frase: ");
		frase=teclado.nextLine();
		
		System.out.println("Introduce una palabra");
		palabra=teclado.next();
		
		/* opcional * poner todo a minúsculas
		frase=frase.toLowerCase();
		palabra=palabra.toLowerCase();
		*/
		
		//si encuentra la palabra tendrá una posición mayor o igual que 0, si es -1 significa que no está en la frase
		System.out.println(frase.indexOf(palabra)>=0?"La palabra " +palabra +" está en la posición " +frase.indexOf(palabra):"0");
		
		
	}
	
	

}
