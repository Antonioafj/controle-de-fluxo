import java.util.Scanner;
public class Contador {
	public static void main(String[] args) {
		Scanner numeroScanner = new Scanner(System.in);
		System.out.println("DIGITE UM NUMERO: ");
		int numeroUm = numeroScanner.nextInt();
		System.out.println("DIGITE OUTRO NUMERO: ");
		int numeroDois = numeroScanner.nextInt();
		
		try {
			contar(numeroUm, numeroDois);
		
		}catch (ParametrosInvalidosException e) {
            System.out.println("O segundo numero digitado deve ser maior que o primeiro numero digitado");
		}
		
	}
	static void contar(int numeroUm, int numeroDois ) throws ParametrosInvalidosException {
		if (numeroUm > numeroDois || numeroUm == numeroDois) 
            throw new ParametrosInvalidosException();

            int contagem = numeroDois - numeroUm;
        for(int resultado = 1; resultado <= contagem; resultado++){
            System.out.println("Imprimindo numeros de 1 até " + contagem + " numero " + resultado + "\n");
        
	}
 }
} 