package projetoJavaB1;

public class EnergiaEolica extends Energia {
	
	private double velVento;
	private double denVento;
	
	public EnergiaEolica(double velVento, double denVento, String nomeEmpresa, String cnpj, float consumo, double orcamento, int regiao, float faturamento,double percAbt)
	{
		super(nomeEmpresa, cnpj, consumo, orcamento, regiao, faturamento, percAbt);
		this.velVento = velVento;
		this.denVento = denVento;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome da Empresa: " +getNomeEmpresa()+ "\nCNPJ: " +getCnpj()+ "\nM�dia de Consumo: " 
	+getConsumo()+ "\nOr�amento: " +getOrcamento()+ "\nRegiao: " +getRegiao()+ "\nFaturamento: " +getFaturamento()+ 
	"\nPercentual: " +getPercAbt());
	}
	
	@Override
	public void fonte (String fonte)
	{
		System.out.println("Energia obtida a partir da For�a do Vento, por interm�dio de um Aerogerador.");
	}
	
	@Override
	public void vidaUtil (int V)
	{
		System.out.println("A vida m�nima �lti � "+20+" anos, conforme Norma IEC 61400-1 (International Electrotechnical Commission).");
	}
	
	@Override 
	public void capacidade (float capacidade)
	{
		System.out.println("No Brasil, a capacidade � de "+19+"GW de Pot�ncia. ");
	}
	
	@Override
	public void custo (double custo)
	{
		System.out.println("O custo Anual � de: "+375*getConsumo()*30*12);
	}

	public double getVelVento() {
		return velVento;
	}

	public void setVelVento(double velVento) {
		this.velVento = velVento;
	}

	public double getDenVento() {
		return denVento;
	}

	public void setDenVento(double denVento) {
		this.denVento = denVento;
	}
}
