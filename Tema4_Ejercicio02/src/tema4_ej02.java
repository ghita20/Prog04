import java.util.Scanner;

public class tema4_ej02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase;
		int mayuscula=0,minuscula=0;
		
		do{
			System.out.println("Introduce la frase");
			frase=teclado.nextLine();
			
		}while(frase.length()>80);
		
		for(int i=0;i<frase.length();i++){
			
			if(Character.isAlphabetic(frase.charAt(i))){
			mayuscula=frase.charAt(i)==Character.toUpperCase(frase.charAt(i))?++mayuscula:mayuscula;
			minuscula=frase.charAt(i)==Character.toLowerCase(frase.charAt(i))?++minuscula:minuscula;
			}
		
		}
		System.out.println(mayuscula +" carácteres en mayúscula.");
		System.out.println(minuscula +" carácteres en minúscula.");
	}

}
