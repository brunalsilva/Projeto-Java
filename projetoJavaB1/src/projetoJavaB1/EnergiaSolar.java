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
					+ "Or�amento: " + getOrcamento() + "\nRegiao: " + getRegiao() + "Faturamento: " + getFaturamento()
					+ "Percentual: " + getPercAbt());
		}
		
		@Override
		public void fonte (String fonte)
		{
			System.out.println("A fonta da energia � o sol.");
		}
		
		@Override
		public void vidaUtil (int V)
		{
			System.out.println("A vida �lti � "+25+" anos, funcionando com 80% do seu desempenho original.");
		}
		
		@Override 
		public void capacidade (float capacidade)
		{
			System.out.println("No Brasil, a capacidade � de "+10+"GW de pot�ncia");
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
}
