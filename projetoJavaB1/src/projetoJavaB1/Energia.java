package projetoJavaB1;

import java.util.Scanner;

public class Energia {

	private String nomeEmpresa;
	private String cnpj;
	private String fonte;
	private float consumo;
	private int vidaUtil;
	private double orcamento;
	private float capacidade;
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

	public Energia(String fonte, int vidaUtil, float capacidade) {

		this.fonte = fonte;
		this.vidaUtil = vidaUtil;
		this.capacidade = capacidade;

	}
	
	Scanner leia = new  Scanner(System.in);
	
	public void cadastroEmpresa()
	{
		System.out.println("\nNome da Empresa: ");
		this.nomeEmpresa = leia.next();
		System.out.println("\nCNPJ: ");
		this.cnpj = leia.next();
		System.out.println("\nMédia de consumo de energia da empresa: ");
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

	public String getFonte() {
		return fonte;
	}

	public void setFonte(String fonte) {
		this.fonte = fonte;
	}

	public float getConsumo() {
		return consumo;
	}

	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}

	public int getVidaUtil() {
		return vidaUtil;
	}

	public void setVidaUtil(int vidaUtil) {
		this.vidaUtil = vidaUtil;
	}

	public double getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(double orcamento) {
		this.orcamento = orcamento;
	}

	public float getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(float capacidade) {
		this.capacidade = capacidade;
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
