package projetoJavaB1;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa extends Energia {

	public Empresa(String nomeEmpresa, String cnpj, float consumo, double orcamento, int regiao, float faturamento,
			double percAbt) {
		super(nomeEmpresa, cnpj, consumo, orcamento, regiao, faturamento, percAbt);
		// TODO Auto-generated constructor stub

	}

	ArrayList<String> empresas = new ArrayList();
	ArrayList<String> cnpjs = new ArrayList();
	ArrayList<Integer> regiaoN = new ArrayList();
	ArrayList<String> regioesTxt = new ArrayList();

	public int op = 0, lugar;
	public int numE = 0, n;

	Scanner leia = new Scanner(System.in);

	@Override
	public void cadastroEmpresa()

	{
		do {
			
			System.out.println("----------------------------------------");
			System.out.println("\n(1) - Cadastrar nova empresa: ");
			System.out.println("\n(2) - Me mostre a lista de empresas cadastradas, seus CNPJS e suas regiões: ");
			System.out.println("\n(3) - Cancelar operação. ");
			System.out.println("\n\t Escolha uma opção. ");
			System.out.println("----------------------------------------");
			op = leia.nextInt();
			switch (op) {
			case 1:
				System.out.println("\nNome da Empresa: ");
				this.nomeEmpresa = leia.next();
				empresas.add(getNomeEmpresa());
				System.out.println("\nCNPJ(Apenas números): ");
				this.cnpj = leia.next();
				do {
					if (getCnpj().length() != 14) {
						System.out.println("\n--CNPJ Inválido!!");
						System.out.println("\nCNPJ(Apenas números): ");
						this.cnpj = leia.next();
					}

				} while (getCnpj().length() != 14);
				cnpjs.add(getCnpj());
				System.out.println("\nConsumo médio de energia da empresa em KWh/h: ");
				this.consumo = leia.nextFloat();
				System.out.println("\nOrçamento disponível: ");
				this.orcamento = leia.nextDouble();
				
				System.out.println("\nRegião que a empresa se situa: ");
				System.out.println("\n1- Norte ");
				System.out.println("\n2- Nordeste ");
				System.out.println("\n3- Centro oeste ");
				System.out.println("\n4- Sudeste ");
				System.out.println("\n5- Sul ");
				this.regiao = leia.nextInt();
				if (getRegiao() >= 1 && getRegiao() <= 5) {
					regiaoN.add(getRegiao());
					this.regiao = 0;
					System.out.println("\nFaturamento da empresa: ");
					this.faturamento = leia.nextFloat();
				} else {
					do {
						System.out.println("\nRegião que a empresa se situa: ");
						System.out.println("\n1- Norte ");
						System.out.println("\n2- Nordeste ");
						System.out.println("\n3- Centro oeste ");
						System.out.println("\n4- Sudeste ");
						System.out.println("\n5- Sul ");
						this.regiao = leia.nextInt();
					} while (getRegiao() < 1 || getRegiao() > 5);
					regiaoN.add(getRegiao());
					this.regiao = 0;
					System.out.println("\nFaturamento da empresa: ");
					this.faturamento = leia.nextFloat();

				}
				break;
			case 2: {
					
				for (int i = 0; i < regiaoN.size(); i++) {
					if (regiaoN.get(i) == 1) {
						regioesTxt.add("Norte");
					}
					if (regiaoN.get(i) == 2) {
						regioesTxt.add("Nordeste");
					}
					if (regiaoN.get(i) == 3) {
						regioesTxt.add("Centro oeste");
					}
					if (regiaoN.get(i) == 4) {
						regioesTxt.add("Sudeste");
					}
					if (regiaoN.get(i) == 5) {
						regioesTxt.add("Sul");
					}
					regiaoN.clear();
				}
				System.out.println("As empresas cadastradas são: " + empresas);
				System.out.println("Os CNPJs das empresas cadastradas são: " + cnpjs);
				System.out.println("A região que as empresas se situam: " + regioesTxt);
			}
				break;
			default:
				System.out.println("\nOperação Cancelada.");
				System.out.println("\n\n\n\n\n\n\n\n");

			}
		} while (op != 3);
	}

	public void infoEmpresa(){
		System.out.println("\nConsumo médio de energia da empresa em KWh/h: ");
		this.consumo = leia.nextFloat();
		System.out.println("\nOrçamento disponível: ");
		this.orcamento = leia.nextDouble();
		System.out.println("\nFaturamento da empresa: ");
		this.faturamento = leia.nextFloat();
	}

	@Override
	public void fonte(String fonte) {

	}

	@Override
	public void vidaUtil(int V) {

	}

	@Override
	public void capacidade(float capacidade) {

	}



}
