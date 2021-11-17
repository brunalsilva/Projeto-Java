package projetoJavaB1;

public class EnergiaSolar extends Energia {
		
		public EnergiaSolar (String tipo,String nomeEmpresa, String cnpj, float consumo, double orcamento, String regiao, float faturamento,double percAbt)
		{
			super(nomeEmpresa,cnpj,consumo,orcamento,regiao,faturamento,percAbt);
			this.tipo = tipo;
		}
		
		private String tipo;
		
		public void imprimirInfo() 
		{
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

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
}
