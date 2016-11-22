//Programa que tras introducir una frase imprime los carácteres que tienen y su frecuencia en la frase
import java.util.Scanner;
public class tema4_ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase,letrasEncontradas="";
		
		do{
		System.out.println("Introduce la frase: ");
		frase=teclado.nextLine();
		
		}while(frase.length()>60);
		
		int frecuencia=0;
		char letra;
		//paso la frase a mayuscula
        frase=frase.toUpperCase();
        
        for(int i=0;i<frase.length();i++){
			
			letra=frase.charAt(i);
			//si la letra ya ha sido comprobada no quiero comprobarla otra vez
			if(!(letrasEncontradas.indexOf(letra)>=0)){
				System.out.println("comprobando");
				//reinicio la frecuencia para cada letra
				frecuencia=0;
				
				for(int k=0;k<frase.length();k++)
					//cantidad de veces que se repite la letra en la palabra
				frecuencia=letra==frase.charAt(k)?++frecuencia:frecuencia;
				//imprimo la división de la frecuencia entre el numero de letras y lo paso a float porque suele dar decimales, después lo multiplico por 100 para que quede mejor
				System.out.println("La letra " +letra +" tiene una frecuencia de: " +100*((float)frecuencia/frase.length()) +"%");
			//agrego la letra a letras encontradas
			letrasEncontradas+=letra;
			}else
				System.out.println("ya sta comprobada");
			
			
				
		}
	}

}
