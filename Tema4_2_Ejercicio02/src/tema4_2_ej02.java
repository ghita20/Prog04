//Programa que pide una frase y una letra y elimina las 3 primeras ocurrencias de la letra
import java.util.Scanner;

public class tema4_2_ej02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase,nuevaFrase="";
		char letra;
		
		System.out.println("Introduce una frase: ");
		frase=teclado.nextLine();
		
		System.out.println("Introduce una palabra: ");
		letra=teclado.nextLine().charAt(0);
		
		int ocurrencia=0;
		for(int i=0;i<frase.length();i++)
			//si ya ha encontrado 3 ocurrencias hago que el if sea falso
			if(frase.charAt(i)==letra && ocurrencia!=3)
				ocurrencia++;
			else
				nuevaFrase+=frase.charAt(i);
		
		System.out.println(nuevaFrase);
				
			
	}

}
