package projetoJavaB1;

public class EnergiaEolica extends Energia {
	
	private double velVento;
	private double denVento;
	
	public EnergiaEolica(String fonte, String vidaUtil, float capacidade, double velVento, double denVento)
	{
		super(fonte, vidaUtil, capacidade);
		this.velVento = velVento;
		this.denVento = denVento;
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
