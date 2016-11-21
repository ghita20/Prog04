import java.util.Scanner;

public class tema4_ej08_alex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
	String frase, nuevafrase="";
	int i=0, n=0, opcion=0;
	System.out.println("Introduce la frase que quieres modificar: ");
	frase=teclado.nextLine();
	frase=frase.toUpperCase();
	System.out.println("1.Codificar o 2.Decodificar");
	opcion=teclado.nextInt();
	switch(opcion){
	case 1:
		System.out.println("Introduce un numero de 1-10 para codificar: ");
		n=teclado.nextInt();
		i=0;
		while(frase.length()>i){
			nuevafrase+=(char)(frase.charAt(i)+n);
			i++;}break;
		
	case 2:
		System.out.println("Introduce un numero de 1-10 para descodificar: ");
		n=teclado.nextInt();
		i=0;
		while(frase.length()>i){
			nuevafrase+=(char)(frase.charAt(i)-n);
		i++;
		}break;
	default: 
		System.out.println("Opcion no valida");
	}
	System.out.println(nuevafrase);
	
	}

}
