import java.util.Scanner;

public class tema4_ej05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase,par="",impar="";
		
		do{
			System.out.println("Introduce la frase: ");
			frase=teclado.nextLine();
		}while(frase.length()>80);
		
		//recorro la frase
		for(int i=0;i<frase.length();i++){
			//si i resto de 2 es 0 es par
			if(i%2==0)
				par+=frase.charAt(i);
			else //si no es impar
				impar+=frase.charAt(i);
		}
		
		System.out.println("Las palabras en posición par : " +par);
		System.out.println("Las palabras en posición impar : " +impar);
	}

}
