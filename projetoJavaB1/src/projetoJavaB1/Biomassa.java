package projetoJavaB1;

public class Biomassa extends Energia {

	private double combustao;
	private double gaseificacao;
	private double pirolise;

	public Biomassa(String nomeEmpresa, String cnpj, float consumo, double orcamento, int regiao, float faturamento,
			double percAbt, double combustao, double gaseificacao, double pirolise) {
		super(nomeEmpresa, cnpj, consumo, orcamento, regiao, faturamento, percAbt);
		this.combustao = combustao;
		this.gaseificacao = gaseificacao;
		this.pirolise = pirolise;
	}

	public void imprimirInfo() {
		System.out.println("\nNome da Empresa: " + getNomeEmpresa() + "CPF: " + getCnpj() + "\nConsumo: " + getConsumo()
				+ "Orçamento: " + getOrcamento() + "\nRegiao: " + getRegiao() + "Faturamento: " + getFaturamento()
				+ "Percentual: " + getPercAbt());
	}

	@Override
	public void fonte(String fonte) {
		System.out.println(
				"A fonte são resíduos sólidos e líquidos urbanos têm origens diversas e se encontra no lixo e esgoto");
	}

	@Override
	public void vidaUtil(int V) {
		System.out.println("o tempo de vida útil de uma usina biomassa é, em média " + 20 + " anos. ");
	}

	@Override
	public void capacidade(float capacidade) {
		System.out.println(
				"Têm capacidade de gerar uma produção adicional de energia a curto prazo de " + 1.8 + " mil GWh ");
	}

	public void custo(double custo) {
		System.out.println("O custo anual é: " + 190 * getConsumo() * 30 * 12);
	}

	public double getCombustao() {
		return combustao;
	}

	public void setCombustao(double combustao) {
		this.combustao = combustao;
	}

	public double getGaseificacao() {
		return gaseificacao;
	}

	public void setGaseificacao(double gaseificacao) {
		this.gaseificacao = gaseificacao;
	}

	public double getPirolise() {
		return pirolise;
	}

	public void setPirolise(double pirolise) {
		this.pirolise = pirolise;
	}
}
