package projetoJavaB1;

public class Maremotriz extends Energia {
	
	public int desNivel;

	public Maremotriz(String fonte, int vidaUtil, float capacidade) {
		super(fonte, vidaUtil, capacidade);
	}

	public int getDesNivel() {
		return desNivel;
	}

	public void setDesNivel(int desNivel) {
		this.desNivel = desNivel;
	}
}
