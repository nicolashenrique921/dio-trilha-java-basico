/*// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		int C = leitor.nextInt();
		String nome;
		int N;

// TODO: complete os espaços em branco com sua solução para o problema

		for (int i = 0; i <   ; i++) {
			nome = leitor.next();
			N = leitor.nextInt();
			if (nome.equals("Thor")) System.out.println(         );
			else System.out.println(           );
		}
    }
	
}*/
//Abaixo o codigo resolvido

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
		try (Scanner leitor = new Scanner(System.in)) {
			int C = leitor.nextInt();
			
			String nome;
			int N;

			for (int i = 0; i < C; i++) {
				nome = leitor.next();
				N = leitor.nextInt();
				if (nome.equals("Thor")) System.out.println("Y");
				else System.out.println("N");
			}
		}
    }
	
}