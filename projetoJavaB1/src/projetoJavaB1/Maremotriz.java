package projetoJavaB1;

public class Maremotriz extends Energia {
	
	public int desNivel;

	public Maremotriz(String fonte, int vidaUtil, float capacidade) {
		super(fonte, vidaUtil, capacidade);
	}
	
	public int getdesNivel() {
		return desNivel;
	}
	
	public int setdesNivel(int desNivel) {
		this.desNivel = desNivel;
	}

}
