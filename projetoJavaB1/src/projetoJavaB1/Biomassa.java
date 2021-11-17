package projetoJavaB1;

public class Biomassa extends Energia {
	
	private double combustao;
	private double gaseificacao;
	private double pirolise;

	public Biomassa(String nomeEmpresa, String cnpj, float consumo, double orcamento, String regiao, float faturamento,
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
	public void fonte (String fonte)
	{
		System.out.println("A fonta da energia é o sol.");
	}
	
	@Override
	public void vidaUtil (int V)
	{
		System.out.println("A vida últi é "+25+" anos, funcionando com 80% do seu desempenho original.");
	}
	
	@Override 
	public void capacidade (float capacidade)
	{
		System.out.println("No Brasil, a capacidade é de "+10+"GW de potência");
	}
	
	//Getters e Setters 

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
