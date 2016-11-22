//Programa que pide codificar o decodificar una fras
//Codificar: dado un numero x, aumenta cada palabra x posiciones más
//Decodificar: dado un numero x, resta cada palabra x posiciones menos
//eleccion: pide dos opciones :Codificar o Decodificar
import java.util.Scanner;
public class tema4_ej08 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int opcion,numero;
		boolean repetir;
		String frase;
		
		do{
			//pido la frase
			frase=pedirFrase();
			//pido el numero
			numero=pedirNumero();
			//la opción será lo que la función eleccion dvuelva
			opcion= eleccion();
			
			switch(opcion){
			case 1://si devuelve 1
				//Llamo a la función Codificar y le envio la frase y el numero
				Codificar(frase, numero); break;
			case 2://si devuelve 2
				//Llamo a la función Decodificar y le envio la frase y el numero
				Decodificar(frase, numero); break;
			}
			
			//llamo a la función repetir
			repetir=repetir();

		}while(repetir); //hace el bucle hasta que repetir sea falso


	}

	public static boolean repetir(){
		Scanner teclado=new Scanner(System.in);
		char opcion;
		
		do{
			System.out.println("Repetir? (s/n): ");
			opcion=teclado.nextLine().charAt(0);
		
		}while(opcion!='s' && opcion!='n');
		
		//si la opción elegida es s retorno true
		if(opcion=='s')
			return true;
		else
			return false;//si es n retorno false
		
	}
	
	//está función la utilizo imprimir el menú de opciones y pedir una
	public static int eleccion(){
		Scanner teclado=new Scanner(System.in);
		int opcion;
		
		do{
			System.out.println("Elige una opción: ");
			System.out.println("1. Codificar 2. Decodificar");
			opcion=teclado.nextInt();
		}while(opcion<1 || opcion>2);
		//devuelvo la opción elegida
		return opcion;
	}

	//aqui codifico la palabra ingresada
	public static void Codificar(String frase, int numero){
		Scanner teclado=new Scanner(System.in);
		String fraseCodificada="";

		for(int i=0;i<frase.length();i++)
			//aumento la posicion del caracter x veces(segun el numero introducido)
			//y después guardo ese caracter en fraseCodificada
			fraseCodificada+=(char)(frase.charAt(i)+numero);
		//hago (char)(frase.charAt(i)+numero) para que al char frase.charAt(i) le sume el numero
		//y obtendrá un número int, pero como quiero imprimir el caracter ascii
		//entonces lo convierto a char de nuevo con (char)

		System.out.println(fraseCodificada);

	}
	//aqui dcodifico la palabra que ingrese
	public static void Decodificar(String frase, int numero){
		Scanner teclado=new Scanner(System.in);
		String fraseDeCodificada="";
		
		for(int i=0;i<frase.length();i++)
			//a cada caracter de la frase le resto el numero introducido
			fraseDeCodificada+=(char)(frase.charAt(i)-numero);
		
		//imprimo la frase decodificada
		System.out.println(fraseDeCodificada);

	}
	
	public static String pedirFrase(){
		Scanner teclado=new Scanner(System.in);
		String frase;
		
		//pido la frase
		System.out.println("Introduce una frase: ");
		frase=teclado.nextLine();
		
		//la pongo en mayuscula
		frase=frase.toUpperCase();
		//dvuelvo la frase
		return frase;
	}
	
	public static int pedirNumero(){
		Scanner teclado=new Scanner(System.in);
		int numero;
		//pido el numero
		do{
			System.out.println("Introduce un numero entre 1 y 10: ");
			numero=teclado.nextInt();

		}while(numero>10 && numero<1);//mientras el numero no este entre 1 y 10 lo vuelvo a pedir
		
		//devuelvo el numero introducido
		return numero;
	}



}
