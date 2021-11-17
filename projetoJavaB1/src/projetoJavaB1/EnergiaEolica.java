package projetoJavaB1;

public class EnergiaEolica extends Energia {
	
	private double velVento;
	private double denVento;
	
	public EnergiaEolica(String fonte, int vidaUtil, float capacidade, double velVento, double denVento)
	{
		super(fonte, vidaUtil, capacidade);
		this.velVento = velVento;
		this.denVento = denVento;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome da Empresa: " +getNomeEmpresa()+ "\nCNPJ: " +getCnpj()+ "\nMédia de Consumo: " 
	+getConsumo()+ "\nOrçamento: " +getOrcamento()+ "\nRegiao: " +getRegiao()+ "\nFaturamento: " +getFaturamento()+ 
	"\nPercentual: " +getPercAbt()+ "\nInforme a Velocidade do Vento: " +velVento+ "\nInforme a Densidade (Opcional): " 
	+denVento);
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
