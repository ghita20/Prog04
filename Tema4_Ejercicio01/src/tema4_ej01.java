//Programa que lle una frase de max. 80 caracteres y imprime progresivamente
import java.util.Scanner;

public class tema4_ej01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase=""; 
		int i=1;
		
		do{
			System.out.println("Introduce la frase");
			frase=teclado.nextLine();
		}while(frase.length()>80); //Max. 80 carácteres
		
		do{
			//imprimo desde 0 a i
			System.out.println(frase.substring(0,i));
			i++;
		}while(i<=frase.length()); //Mientras i sea menor que la longitud de frase
	
	}

}
