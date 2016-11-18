//Programa que pide codificar o decodificar una frase
//Codificar: dado un numero x, aumenta cada palabra x posiciones más
//Decodificar: dado un numero x, resta cada palabra x posiciones menos
import java.util.Scanner;
public class tema4_ej08 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int opcion;
		char repetir;
		do{
			opcion= eleccion();

			switch(opcion){
			case 1:
				//Llamo a la función Codificar
				Codificar(); break;
			case 2:
				//Llamo a la función Decodificar
				Decodificar(); break;
			default:
				System.out.println("Opción incorrecta!");
			}
			System.out.println("Repetir? (s/n): ");
			repetir=teclado.nextLine().charAt(0);

		}while(repetir=='s');


	}

	public static int eleccion(){
		Scanner teclado=new Scanner(System.in);
		int opcion;
		do{
			System.out.println("Elige una opción: ");
			System.out.println("1. Codificar 2. Decodificar");
			opcion=teclado.nextInt();
		}while(opcion<1 && opcion>2);
		return opcion;
	}


	public static void Codificar(){
		Scanner teclado=new Scanner(System.in);
		String frase,fraseCodificada=""; int numero;
		do{
			System.out.println("Introduce una frase para codificar: ");
			frase=teclado.nextLine();

			System.out.println("Introduce un numero entre 1 y 10: ");
			numero=teclado.nextInt();

		}while(numero>10 && numero<1);

		frase=frase.toUpperCase();
		for(int i=0;i<frase.length();i++)
			//aumento la posicion del caracter x veces(segun el numero introducido)
			//y después guardo ese caracter en fraseCodificada
			fraseCodificada+=(char)(frase.charAt(i)+numero);
		//hago (char)(frase.charAt(i)+numero) para que al char frase.charAt(i) le sume el numero
		//y obtendrá un número int, pero como quiero imprimir el caracter ascii
		//entonces lo convierto a char de nuevo con (char)

		System.out.println(fraseCodificada);

	}

	public static void Decodificar(){
		Scanner teclado=new Scanner(System.in);
		String frase,fraseDeCodificada=""; int numero;
		do{
			System.out.println("Introduce una frase para decodificar: ");
			frase=teclado.nextLine();

			System.out.println("Introduce un numero entre 1 y 10: ");
			numero=teclado.nextInt();

		}while(numero>10 && numero<1);

		frase=frase.toUpperCase();
		for(int i=0;i<frase.length();i++)
			fraseDeCodificada+=(char)(frase.charAt(i)-numero);

		System.out.println(fraseDeCodificada);

	}



}
