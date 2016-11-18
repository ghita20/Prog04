import java.util.Scanner;

public class tema4_ej07_alex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase, numeros="0123456789";
		int i=0, k=0, min=0, may=0, num=0;
		boolean cosa=true;
		System.out.println("Introduce la frase: ");
		frase=teclado.nextLine();
		while(frase.length()>i){
			cosa=true;
			if(cosa==true){
				if(frase.charAt(i)>='a' && frase.charAt(i)<='z'){
					min++;
					cosa=false;
				}//fin minuscula
				else if(frase.charAt(i)>='A' && frase.charAt(i)<='Z'){
					may++;
					cosa=false;
				}//fin mayuscula
				else if(cosa==true){ 
					k=0;
					while(numeros.length()>k && cosa==true){
						if(frase.charAt(i)==numeros.charAt(k)){
					num++;
					cosa=false;}
						else 
							k++;
					}//fin bucle 
				}//fin numero
				
			}//fin bolea3na	
			i++;
			}//fin bucle 
		System.out.print("Minuscula: "+ min +" Mayuscula: "+ may +" Numero: "+ num);
		
	}

}
