import java.util.Scanner;

public class tema4_ej01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase=""; 
		int a=1;
		do{
		System.out.println("Introduce la frase");
		frase=teclado.nextLine();
		}while(frase.length()>80);
		do{
			System.out.println(frase.substring(0,a));
			a++;
		}while(a<=frase.length());
	}

}
