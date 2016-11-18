import java.util.Scanner;

public class tema4_ej07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int mayusculas=0,minusculas=0,numeros=0;
		System.out.println("Introduce la frase: ");
		String frase=teclado.nextLine();
		
		for(int i=0;i<frase.length();i++){
			mayusculas=frase.charAt(i)>='A' && frase.charAt(i)<='Z'?++mayusculas:mayusculas;
			minusculas=frase.charAt(i)>='a' && frase.charAt(i)<='z'?++minusculas:minusculas;
			numeros=frase.charAt(i)>='0' && frase.charAt(i)<='9'?++numeros:numeros;
			
			}
		System.out.println(mayusculas);
		System.out.println(minusculas);
		System.out.println(numeros);
	}

}
