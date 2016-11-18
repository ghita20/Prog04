import java.util.Scanner;

public class t4_ej02_Alex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase;
		int a=0,m=0,M=0;
		do{
			System.out.println("Introduce");
			frase=teclado.nextLine();
		}while(frase.length()>80);
		while(a<frase.length()){
			if(frase.charAt(a)>='a' && frase.charAt(a)<='z')
				m++;
			if(frase.charAt(a)>='A' && frase.charAt(a)<='Z')
				M++;		
		a++;
			
				
		}
		System.out.println("Mayusculas: " +M);
		System.out.println("minusculas: " +m);
		
	
	}

}
