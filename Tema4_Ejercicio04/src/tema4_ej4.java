//Programa que lee una frase de max.80 y da la opción de pasar todo a mayuscula o a minuscula
import java.util.Scanner;

public class tema4_ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase;
		int m,M,variante;
		
		do{
			System.out.println("Inotrudce una frase: ");
			frase=teclado.nextLine();
		}while(frase.length()>80);
		
		//pido la opción
		do{
		System.out.println("Elige 1.Mayusculas 2.minusculas: ");
		variante=teclado.nextInt();
		}while(variante<1 || variante>2);//si la opción es mayor que 2 o menor que 1 hago el do otra vez
		
		switch(variante){
		case 1:
			frase=frase.toUpperCase(); break;
		case 2:
			frase=frase.toLowerCase(); break;	
		}
		
		//imprimo la frase final
		System.out.println(frase);
		
	}

}
