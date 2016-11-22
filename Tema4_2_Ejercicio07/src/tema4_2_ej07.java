//Programa que pide una palabra y muestra la vocal más repetida y el numero de veces que se repite
import java.util.Scanner;

public class tema4_2_ej07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase;
		int cantidad=0,cantidadMayor=0;
		char vocalMayor=' ';
		boolean esVocal=false;
		final String Vocales="aeiou";
		
		System.out.println("Introduce la palabra: ");
		frase=teclado.nextLine();
		
		for(int i=0;i<frase.length();i++){
			esVocal=false;
			for(int k=0;k<Vocales.length() && !esVocal;k++)
				esVocal=frase.charAt(i)==Vocales.charAt(k)?true:false;
			if(esVocal){
				cantidad=0;
				for(int j=0;j<frase.length();j++)
					cantidad=frase.charAt(j)==frase.charAt(i)?++cantidad:cantidad;
			
				if(cantidad>cantidadMayor){
					vocalMayor=frase.charAt(i);
					cantidadMayor=cantidad;
				}//fin del if cantidad
			}//fin del esVocal
		}//fin del primer for
		System.out.println("La vocal " +vocalMayor +" es la vocal más repetida con " +cantidadMayor +" repeticiones.");
		
	}

}
