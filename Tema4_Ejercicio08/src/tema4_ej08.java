import java.util.Scanner;

public class tema4_ej08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase,fraseCifrada="",fraseDesCifrada="";
		int opcion=0,numero;
		
		do{
			
			System.out.println("Elige una opción: ");
			System.out.println("1.Codificar 2.Decodificar");
			opcion=teclado.nextInt();
			
			teclado.nextLine();
		}while(opcion<1 && opcion>2);
		
		switch(opcion){
		case 1:
			
			do{
				System.out.println("Introduce la frase a codificar: ");
				frase=teclado.nextLine();
				
				System.out.println("Introduce un número: ");
				numero=teclado.nextInt();
				
			}while(numero>10 && numero<1);
			
			frase=frase.toUpperCase();
			
			for(int i=0;i<frase.length();i++){
				fraseCifrada+=(char)(frase.charAt(i)+numero);
			}
			
			System.out.println(fraseCifrada);
			
			break;
		case 2:
			do{
				System.out.println("Introduce la frase codificada: ");
				frase=teclado.nextLine();
				
				System.out.println("Introduce un número: ");
				numero=teclado.nextInt();
				
			}while(numero>10 && numero<1);
			
			frase=frase.toUpperCase();
			
			for(int i=0;i<frase.length();i++){
				fraseDesCifrada+=(char)(frase.charAt(i)-numero);
			}
			
			System.out.println(fraseDesCifrada);
		break;
		}
	}
	


}
