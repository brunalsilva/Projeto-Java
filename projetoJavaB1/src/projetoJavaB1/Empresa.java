package projetoJavaB1;

import java.util.Scanner;

public class Empresa extends Energia {

	public Empresa(String nomeEmpresa, String cnpj, float consumo, double orcamento, int regiao, float faturamento,
			double percAbt) {
		super(nomeEmpresa, cnpj, consumo, orcamento, regiao, faturamento, percAbt);
		// TODO Auto-generated constructor stub
		
	}
		public int op = 0,lugar;
		
		Scanner leia = new Scanner(System.in);
		@Override
		  public void cadastroEmpresa()
		    {
		        System.out.println("\nNome da Empresa: ");
		        this.nomeEmpresa = leia.next();
		        System.out.println("\nCNPJ: ");
		        this.cnpj = leia.next();
		        do
		        {
		        if(getCnpj().length() != 14)
		        	{
		        	System.out.println("\n--CNPJ Inválido!!");
		        	System.out.println("\nCNPJ: ");
		        	 this.cnpj = leia.next();
		        	}
		       	       
		        }while(getCnpj().length() != 14);
		        System.out.println("\nConsumo médio de energia da empresa em MWh/h: ");
		        this.consumo = leia.nextFloat();
		        System.out.println("\nOrçamento disponível: ");
		        this.orcamento = leia.nextDouble();
		        System.out.println("\nRegião que a empresa se situa: ");
		        System.out.println("\n1- Norte ");
		        System.out.println("\n2- Nordeste ");
		        System.out.println("\n3- Centro oeste ");
		        System.out.println("\n4- Sudeste ");
		        System.out.println("\n5- Sul ");
		        this.regiao= leia.nextInt();
		        if(getRegiao() >= 1 && getRegiao() <= 5)
		        {
		        	System.out.println("\nFaturamento da empresa: ");
			        this.faturamento = leia.nextFloat();
		        }else {
		        	
		       do {
		        System.out.println("\nRegião que a empresa se situa: ");
		        System.out.println("\n1- Norte ");
		        System.out.println("\n2- Nordeste ");
		        System.out.println("\n3- Centro oeste ");
		        System.out.println("\n4- Sudeste ");
		        System.out.println("\n5- Sul ");
		        this.regiao= leia.nextInt();
		        } while(getRegiao() < 1 || getRegiao() > 5);
		        
		        	
		        
		        
		        System.out.println("\nFaturamento da empresa: ");
		        this.faturamento = leia.nextFloat();
		        }
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

		@Override
		public void custo(double custo) {
			
			
		}
	
	

}
