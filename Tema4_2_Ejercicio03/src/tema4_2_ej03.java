//Pide una palabra y dice si es palindromo o no (si se lee igual al revés)
import java.util.Scanner;

public class tema4_2_ej03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase,inverso="";
		
		System.out.println("Introduce una frase: ");
		frase=teclado.nextLine();
		
		//agrego cada carácter desde el ultimo al primero
		for(int i=frase.length()-1;i>=0;i--)
			inverso+=frase.charAt(i);
		//si la palabra inversa es igual a la original es palindromo
		System.out.println(frase.equals(inverso)?"Es palindromo.":"No es palindromo.");
	}

}
