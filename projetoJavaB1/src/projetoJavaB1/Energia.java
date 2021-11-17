package projetoJavaB1;

import java.util.Scanner;

public abstract class Energia {

	private String nomeEmpresa;
	private String cnpj;
	private float consumo;
	private double orcamento;
	private String regiao;
	private float faturamento;
	private double percAbt;

	public Energia(String nomeEmpresa, String cnpj, float consumo, double orcamento, String regiao, float faturamento,
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
        this.regiao = leia.next();
        System.out.println("\nFaturamento da empresa: ");
        this.faturamento = leia.nextFloat();
    }
    
	abstract public void fonte (String fonte);
	abstract public void vidaUtil (int V);
	abstract public void capacidade (float capacidade);
	abstract public void custo (double custo);
	
	int M=0, S=0, B=0, E=0;
	
	public void verificacao()
	{
		if (getRegiao()=="Norte")
		{
			S++;
		}
		if (getRegiao()=="Nordeste")
		{
			M++; E++; S++;
		}
		if (getRegiao()=="Sul")
		{
			E++;
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

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
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