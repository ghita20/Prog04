//Pide dos nombres y apellidos e intercambia los apellidos a cada nombre
import java.util.Scanner;

public class tema4_2_ej04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String nombreUno,nombreDos,nombreUnoNuevo="",nombreDosNuevo="";
		
		System.out.println("Introduce el primer nombre y apellido: ");
		nombreUno=teclado.nextLine();
		
		System.out.println("Introduce el segundo nombre y apellido: ");
		nombreDos=teclado.nextLine();
		
		//Hago la primera frase
		for(int i=0;i<=nombreDos.indexOf(' ');i++)
			nombreUnoNuevo+=nombreDos.charAt(i);
		for(int i=nombreUno.indexOf(' ');i<nombreUno.length();i++)
			nombreUnoNuevo+=nombreUno.charAt(i);
		
		//Hago la segunda frase
		for(int i=0;i<=nombreUno.indexOf(' ');i++)
			nombreDosNuevo+=nombreUno.charAt(i);
		for(int i=nombreDos.indexOf(' ');i<nombreDos.length();i++)
			nombreDosNuevo+=nombreDos.charAt(i);
		
		System.out.println(nombreUnoNuevo);
		System.out.println(nombreDosNuevo);
	}

}
