package projetoJavaB1;

import java.util.Scanner;

public class TesteIndicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		Empresa emp1 = new Empresa (null, null, 0, 0, 0, 0, 0);
		EnergiaSolar solar = new EnergiaSolar (null, null, null, 0, 0, 0, 0, 0);
		Biomassa bio = new Biomassa (null, null, 0, 0, 0, 0, 0, null);
		EnergiaEolica eol = new EnergiaEolica (0,null,null,0,0,0,0,0);
		Maremotriz mare = new Maremotriz (0,null,null,0,0,0,0,0);
		
		System.out.println("============================================================================================================");
		System.out.println("_____________         _____                        ________                ________       _____        \r\n"
				+ "__  ___/___(_)___________(_)____  __________       ___  __ \\______________ ______(_)_____ __  /________\r\n"
				+ "_____ \\ __  / __  ___/__  / _  / / /__  ___/       __  /_/ /__  ___/_  __ \\_____  / _  _ \\_  __/_  ___/\r\n"
				+ "____/ / _  /  _  /    _  /  / /_/ / _(__  )        _  ____/ _  /    / /_/ /____  /  /  __// /_  / /__  \r\n"
				+ "/____/  /_/   /_/     /_/   \\__,_/  /____/         /_/      /_/     \\____/ ___  /   \\___/ \\__/  \\___/  \r\n"
				+ "                                                                           /___/");
		System.out.println("============================================================================================================");
		System.out.println("\n\t\t\tS  I  R  I  U  S         P  R  O  J  E  C  T         v1.0");
		System.out.println("\n\t\t\t\tPrezade Cliente, seja bem-vinde ao futuro!");
		
		System.out.println("\n\nGostaria de saber mais sobre as energias limpas e sustentáveis? \n1-Sim \n2-Não");
		int op = leia.nextInt();
		if (op==1)
		{
			do
			{
			System.out.println("\nEscolha um tipo de energia: \n1-Energia Solar \n2-Energia Biomassa \n3-Energia Eólica \n4-Energia Maremotriz \n5-Sair");
			op = leia.nextInt();
				if(op==1)
				{
					solar.fonte(null);
					solar.tipo(null);
					solar.vidaUtil(0);
					solar.capacidade(0);
					System.out.println("\nEscolha um tipo de energia: \n1-Energia Solar \n2-Energia Biomassa \n3-Energia Eólica \n4-Energia Maremotriz \n5-Sair");
					op = leia.nextInt();
				}
				if(op==2)
				{	bio.fonte(null);
					bio.queima(null);
					bio.vidaUtil(0);
					bio.capacidade(0);
					System.out.println("\nEscolha um tipo de energia: \n1-Energia Solar \n2-Energia Biomassa \n3-Energia Eólica \n4-Energia Maremotriz \n5-Sair");
					op = leia.nextInt();
				}
				if(op==3)
				{	eol.fonte(null);
					eol.velVento(null);
					eol.vidaUtil(0);
					eol.capacidade(0);
					System.out.println("\nEscolha um tipo de energia: \n1-Energia Solar \n2-Energia Biomassa \n3-Energia Eólica \n4-Energia Maremotriz \n5-Sair");
					op = leia.nextInt();
				}
				if(op==4)
				{	mare.fonte(null);
					mare.desNivel(0);
					mare.vidaUtil(0);
					mare.capacidade(0);
					System.out.println("\nEscolha um tipo de energia: \n1-Energia Solar \n2-Energia Biomassa \n3-Energia Eólica \n4-Energia Maremotriz \n5-Sair");
					op = leia.nextInt();
				}
				if(op>5 || op<1)
				{
					System.out.println("\nOpção inválida. Tente novamente.");
					System.out.println("\nEscolha um tipo de energia: \n1-Energia Solar \n2-Energia Biomassa \n3-Energia Eólica \n4-Energia Maremotriz \n5-Sair");
					op = leia.nextInt();
				}
				
			}while(op>=1 && op<5);
			
			while(op>5 || op <1)
			{
			
				if(op>5 || op<1)
				{
					System.out.println("\nOpção inválida. Tente novamente.");
					System.out.println("\nEscolha um tipo de energia: \n1-Energia Solar \n2-Energia Biomassa \n3-Energia Eólica \n4-Energia Maremotriz \n5-Sair");
					op = leia.nextInt();
				}
			}
			
			if(op==5)
			{
				emp1.infoEmpresa();
				emp1.consumo();
				emp1.verificacao();
			}
		}
		else if (op==2)
		{
			emp1.infoEmpresa();
			emp1.consumo();
			emp1.verificacao();
		}
		else
		{	
			do
			{
				System.out.println("\nOpção inválida. Tente novamente.");
				System.out.println("\n\nGostaria de saber mais sobre as energias limpas e sustentáveis? \n1-Sim \n2-Não");
				op = leia.nextInt();
			}
			while (op<1 || op>2);
		}
	}
}
