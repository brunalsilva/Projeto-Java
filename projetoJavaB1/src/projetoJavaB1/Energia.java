package projetoJavaB1;

import java.util.Scanner;

public abstract class Energia {

	protected String nomeEmpresa;
	protected String cnpj;
	protected float consumo;
	protected double orcamento;
	protected int regiao;
	protected float faturamento;
	protected double percAbt;

	public Energia(String nomeEmpresa, String cnpj, float consumo, double orcamento, int regiao, float faturamento,
			double percAbt) {

		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
		this.consumo = consumo;
		this.orcamento = orcamento;
		this.regiao = regiao;
		this.faturamento = faturamento;
		this.percAbt = percAbt;

	}
	
	Scanner leia = new Scanner(System.in);

	  public void cadastroEmpresa()
	    {
	        System.out.println("\nNome da Empresa: ");
	        this.nomeEmpresa = leia.next();
	        System.out.println("\nCNPJ: ");
	        this.cnpj = leia.next();
	        do
	        {
	        System.out.println("\n--CNPJ Inválido!!");
	        }while(getCnpj().length() != 14);
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
	        System.out.println("\nFaturamento da empresa: ");
	        this.faturamento = leia.nextFloat();
	    }
	    
    
	abstract public void fonte (String fonte);
	abstract public void vidaUtil (int V);
	abstract public void capacidade (float capacidade);
	abstract public void custo (double custo);
	
	public void consumo()
	{
		if(getConsumo()<1000)
		{
			System.out.println("O consumo de energia da empresa é baixo.");
		}
		if(getConsumo()>=1000 && getConsumo()<1500)
		{
			System.out.println("O consumo de energia da empresa é médio.");
		}
		if (getConsumo()>1500)
		{
			System.out.println("O consumo de energia da empresa é alto.");
		}
	}
	
	public void verificacao()
	{
		int M=0, S=0, B=0, E=0;
		
		if (getRegiao()== 1)
		{
			S++;
		}
		if (getRegiao()== 2)
		{
			M++; E++; S++;
		}
		if (getRegiao()== 5)
		{
			E++;
		}
		if (getOrcamento()>=15000 && getOrcamento()<20000 && getRegiao()==2)
		{
			M++;
		}
		if (getOrcamento()>=20000 && getOrcamento()<25000 && getRegiao()==1)
		{
			S++;
		}
		if (getOrcamento()>=25000 && getOrcamento()<30000 && getRegiao()==3 || getRegiao()==4)
		{
			B++;
		}
		if (getOrcamento()>30000 && getRegiao()==2 || getRegiao()==5)
		{
			E++;
		}
		if(getConsumo()<1000)
		{
			S++;
		}
		if(getConsumo()>=1000 && getConsumo()<1500)
		{
			E++;
		}
		if (getConsumo()>1500 && getRegiao()==2)
		{
			M++;
		}
		if (getConsumo()>1500)
		{
			B++;
		}
		
		if(S>B && S>E && S>M)
		{
			System.out.println("A energia solar é a mais indicada.");
		}
		else if(B>S && B>E && B>M)
		{
			System.out.println("A energia biomassa é a mais indicada.");
		}
		else if(E>B && E>S && E>M)
		{
			System.out.println("A energia eólica é a mais indicada.");
		}
		else if(M>B && M>E && M>S)
		{
			System.out.println("A energia maremotriz é a mais indicada.");
		}
		
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public float getConsumo() {
		return consumo;
	}

	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}

	public double getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(double orcamento) {
		this.orcamento = orcamento;
	}

	public int getRegiao() {
		return regiao;
	}

	public void setRegiao(int regiao) {
		this.regiao = regiao;
	}

	public float getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(float faturamento) {
		this.faturamento = faturamento;
	}

	public double getPercAbt() {
		return percAbt;
	}

	public void setPercAbt(double percAbt) {
		this.percAbt = percAbt;
	}

}