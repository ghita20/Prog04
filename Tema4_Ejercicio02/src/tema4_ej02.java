//Pide una frase de max. 80 caracteres y imprime cuántas mayusculas y minusculas hay
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
			
		}while(frase.length()>80);//max. 80 caracteres
		
		//recorro cada char de la frase
		for(int i=0;i<frase.length();i++){
			//si el carácter es alfabetico
			if(Character.isAlphabetic(frase.charAt(i)))
				//si el caracter es mayuscula
				if(frase.charAt(i)==Character.toUpperCase(frase.charAt(i)))
					mayuscula++;
				else //si no es mayuscula será minuscula
					minuscula++;
		
		}//fin del for
		System.out.println(mayuscula +" carácteres en mayúscula.");
		System.out.println(minuscula +" carácteres en minúscula.");
	}

}
