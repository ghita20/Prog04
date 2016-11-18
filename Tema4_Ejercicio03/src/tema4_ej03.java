import java.util.Scanner;

public class tema4_ej03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase, palabra; 
		int r=0;
		System.out.println("Introduce una frase: ");
		frase=teclado.nextLine();
		System.out.println("Introduce una palabra");
		palabra=teclado.next();
		frase=frase.toLowerCase();
		palabra=palabra.toLowerCase();
		r=frase.indexOf(palabra);
		if(r>0)
			System.out.println(frase.indexOf(palabra));
		else
			System.out.println("0");
		
	}
	
	

}
