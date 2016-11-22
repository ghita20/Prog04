//Progama que reemplaza todos los "si" de una frase por "no"
import java.util.Scanner;

public class tema4_2_ej06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase;
		
		System.out.println("Introduce la frase: ");
		frase=teclado.nextLine();
		
		//reemplazo si por no
		System.out.println(frase.replace("si", "no"));
	}

}
