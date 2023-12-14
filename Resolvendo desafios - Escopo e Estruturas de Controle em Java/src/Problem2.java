/*// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// T: complete os espaços em branco com sua solução para o problema
		String[] nomes = new String[     ];
		
		for(int i=0 ; i<10 ; i++)
			nomes[    ] = sc.nextLine();

	}
}*/
//abaixo o codigo resolvido

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String[] instituicoes = {"USP", "UFPE", "UFCG", "UFRN", "UFRJ", "IME", "ITA", "UNIOESTE", "URI", "UFG"};
   			String[] nomes = new String[10];
     	for (int i = 0; i < 10; i++) {
			  nomes[i] = sc.nextLine();
     	}
     System.out.println(nomes[2] + instituicoes[2]);
     System.out.println(nomes[6] + instituicoes[6]);
     System.out.println(nomes[8] + instituicoes[8]);
		}
    }
}