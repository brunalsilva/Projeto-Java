package projetoJavaB1;

public class EnergiaSolar extends Energia {
		
		private String tipo;
	
		public EnergiaSolar (String tipo,String nomeEmpresa, String cnpj, float consumo, double orcamento, int regiao, float faturamento,double percAbt)
		{
			super(nomeEmpresa,cnpj,consumo,orcamento,regiao,faturamento,percAbt);
			this.tipo = tipo;
		}
		
		@Override
		public void fonte (String fonte)
		{
			System.out.println("A fonte da energia é o sol.");
		}
		
		@Override
		public void vidaUtil (int V)
		{
			System.out.println("\nA vida últi é "+25+" anos, funcionando com 80% do seu desempenho original.");
		}
		
		@Override 
		public void capacidade (float capacidade)
		{
			System.out.println("\nNo Brasil, a capacidade é de "+10+"GW de potência");
		}
		
		public void tipo (String tipo)
		{
			System.out.println("\nTipos de energia solar: Térmica e Fotovoltaica.");
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
}
