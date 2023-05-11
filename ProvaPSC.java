import java.util.Scanner;

public class ProvaPSC {

	public static void main(String[] args) {
		/* Nome do Aluno: João Gabriel
		* RA: 32319766
		* Data: 10/05/23
		*/
		
		double ValorLitro, KMa60, KMa80, KMa100, KMa120, KMa140,
		CombstA60, CombstA80, CombstA100, CombstA120, CombstA140,
		CombstTotal, VelocMedia, CustoViagem;
		String placa;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual a placa do veículo? ");
		placa = teclado.next();
		System.out.println("Qual o valor do litro do combustível? ");
		ValorLitro = teclado.nextDouble();
		System.out.println("Quantos quilômetros rodados a 60 KM/H? ");
		KMa60 = teclado.nextDouble();
		System.out.println("Quantos quilômetros rodados a 80 KM/H? ");
		KMa80 = teclado.nextDouble();
		System.out.println("Quantos quilômetros rodados a 100 KM/H? ");
		KMa100 = teclado.nextDouble();
		System.out.println("Quantos quilômetros rodados a 120 KM/H? ");
		KMa120 = teclado.nextDouble();
		System.out.println("Quantos quilômetros rodados a 140 KM/H? ");
		KMa140 = teclado.nextDouble();
		
		CombstA60 = KMa60 / 30.7;
		CombstA80 = KMa80 / 26.8;
		CombstA100 = KMa100 / 22.4;
		CombstA120 = KMa120 / 18.1;
		CombstA140 = KMa140 / 14.5;
		CombstTotal = CombstA60 + CombstA80 + CombstA100 + CombstA120 + CombstA140;
		VelocMedia = ((KMa60*60) + (KMa80*80) + (KMa100*100) + (KMa120*120) + (KMa140*140))/(KMa60 + KMa80 + KMa100 + KMa120 + KMa140) ;
		CustoViagem = ValorLitro * CombstTotal;
		
		System.out.println("Placa do carro: " + placa);
		System.out.printf("Consumo total: %.3f %n", CombstTotal);
		System.out.printf("Valor total: R$ %.2f %n", CustoViagem);
		System.out.printf("Velocidade média ponderada: %.2f km/h %n", VelocMedia);
		
	}
}
