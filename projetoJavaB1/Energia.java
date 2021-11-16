package projetoJavaB1;

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
