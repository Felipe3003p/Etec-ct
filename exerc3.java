import java.util.Scanner;


public class exerc3 {

	/**
	 A l�gica para realizar este exerc�cio/programa, foi que ao criarmos uma vari�vel
	 "f=10", ela serviria para descobrirmos a �ltima posi��o da vari�vel "b".  Com
	 isso, podemos reutilizar a l�gica presente nos exerc�cios anteriores.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[],b[],i,j=0, f=10;
		
		a = new int [10];
		b = new int [10];
		
		j = f - 1; // ultima posicao de "b"
		//Entrada de dados
		for(i=0;i<10;i++) {
			System.out.println("Entre com o "+ (i+1)+"� valor:");
			a[i]=sc.nextInt();
			b[j] = a[i];
		    j = j - 1; // penultima, antepenultima, ... posicoes de "b"
		}
		
		//Imprimir sa�da para o usu�rio
		System.out.print("Vetor A = " );
		for(i=0;i<10;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = " );
		for(i=0;i<10;i++) {
			System.out.print(b[i]+" ");
		}
	  
		sc.close();

	}

}
