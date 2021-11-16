package projetoJavaB1;

public class EnergiaSolar extends Energia {
		
		private String tipo;
		
		public EnergiaSolar(String fonte, int vidaUtil, float capacidade, String tipo)
		{
			super(fonte,vidaUtil,capacidade);
			this.tipo = tipo;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
}
