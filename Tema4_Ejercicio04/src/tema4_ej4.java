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
		System.out.println("Elige 1.Mayusculas 2.minusculas: ");
		variante=teclado.nextInt();
		switch(variante){
		case 1:
			frase=frase.toUpperCase();
			System.out.println(frase);break;
		case 2:
			frase=frase.toLowerCase();
			System.out.println(frase);break;
		default:
			System.out.println("Has elegido mal");
			
		}
		
	}

}
