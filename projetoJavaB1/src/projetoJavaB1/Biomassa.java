package projetoJavaB1;

public class Biomassa extends Energia {

	private String queima;

	public Biomassa(String nomeEmpresa, String cnpj, float consumo, double orcamento, int regiao, float faturamento,
			double percAbt, String queima) {
		super(nomeEmpresa, cnpj, consumo, orcamento, regiao, faturamento, percAbt);
		this.queima = queima;
	}
	
	@Override
	public void fonte(String fonte) 
	{
		System.out.println("A fonte são resíduos sólidos e líquidos urbanos têm origens diversas e se encontra no lixo e esgoto");
	}
	
	public void queima (String queima)
	{
		System.out.println("Existem três tipos de queima de matéria orgânica para a energia de biomassa: combustão direta, gaseificação, termoquímica e pirólise");
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

	public String getQueima() {
		return queima;
	}

	public void setQueima(String queima) {
		this.queima = queima;
	}
	
	
}
