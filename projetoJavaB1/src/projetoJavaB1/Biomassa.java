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
		System.out.println("A fonte s�o res�duos s�lidos e l�quidos urbanos t�m origens diversas e se encontra no lixo e esgoto");
	}
	
	public void queima (String queima)
	{
		System.out.println("Existem tr�s tipos de queima de mat�ria org�nica para a energia de biomassa: combust�o direta, gaseifica��o, termoqu�mica e pir�lise");
	}

	@Override
	public void vidaUtil(int V) {
		System.out.println("o tempo de vida �til de uma usina biomassa �, em m�dia " + 20 + " anos. ");
	}

	@Override
	public void capacidade(float capacidade) {
		System.out.println(
				"T�m capacidade de gerar uma produ��o adicional de energia a curto prazo de " + 1.8 + " mil GWh ");
	}

	public String getQueima() {
		return queima;
	}

	public void setQueima(String queima) {
		this.queima = queima;
	}
	
	
}
