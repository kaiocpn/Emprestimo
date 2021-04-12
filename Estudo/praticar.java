
import java.util.Scanner;

public class praticar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Ler = new Scanner(System.in);

		double emp, juros, calc, Resultado, parce; 
		
		
		System.out.println("Quanto voce quer de emprestimo ? ");
		emp = Ler.nextDouble();
		
		System.out.println("Qual o valor do juros ");
		juros = Ler.nextDouble();
		
		calc = (emp * juros) / 100;
		
		emp = emp + calc;
		
		System.out.println("Em quantas Parcelas ?");
		parce = Ler.nextInt();
		
		Resultado = emp / parce;		
		
				
		System.out.println("Com o calculo de " + juros + "%, sera pago nessa solicitação de emprestimo os seguintes valores R$:"
		+ calc + " de juros." + " Com parcelas de R$:" + Resultado + ", E o total é R$: " + emp);
		
		 
				
		
		
				
				
				
	}

}
