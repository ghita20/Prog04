import java.util.Scanner;

public class tema4_ej09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String fraseFinal="";
		do{
		int numero;
		do{
			System.out.println("Introduce un número entre 1990-1995: ");
			numero=teclado.nextInt();
		}while(numero!=0 && numero<1990 || numero>1995);
		
		char sexo;
		do{
			System.out.println("Introduce tu sexo (H/M): ");
			sexo=teclado.next().charAt(0);
			sexo=Character.toUpperCase(sexo);
		}while(sexo!='0' && sexo!='H' && sexo!='M');
		
		int curso;
		do{
			System.out.println("Introduce el curso (1-2): ");
			curso=teclado.nextInt();
		}while(curso<0 || curso>2);
		teclado.nextLine();
		String sept_oct;
		do{
			System.out.println("Introduce el séptimo y octavo valor: ");
			sept_oct=teclado.nextLine();
		}while(sept_oct.length()>2);
		
		
		System.out.println(numero);
		System.out.println(sexo);
		System.out.println(curso);
		System.out.println(sept_oct);
		
			fraseFinal+=numero;
			fraseFinal+=sexo;
			fraseFinal+=curso;
			fraseFinal+=sept_oct;
		}//fin del else
		
		System.out.println(fraseFinal);
	}while(!fraseFinal.equals("0"));
	}
}
