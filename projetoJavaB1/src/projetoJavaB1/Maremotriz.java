package projetoJavaB1;

public class Maremotriz extends Energia {
	
	public int desNivel;

	public Maremotriz(int desNivel, String nomeEmpresa, String cnpj, float consumo, double orcamento, int regiao, float faturamento,double percAbt) 
	{
		super(nomeEmpresa,cnpj,consumo,orcamento,regiao,faturamento,percAbt);
		this.desNivel = desNivel;
	}
	
	@Override
	public void fonte (String fonte)
	{
		System.out.println("A fonte da energia � o mar.");
	}
	
	@Override
	public void vidaUtil (int V)
	{
		System.out.println("A vida �lti � "+50+" anos, funcionando com 80% do seu desempenho original.");
	}
	
	@Override 
	public void capacidade (float capacidade)
	{
		System.out.println("No Brasil, a capacidade � de "+120+"GW de pot�ncia");
	}
	
	@Override
	public void custo (double custo)
	{
		System.out.println("O custo anual �: "+100*getConsumo()*30*12);
	}
	
	public void desNivel (int desNivel)
	{
		System.out.println("� preciso que o desn�vel das mar�s seja maior do que 7 metros.");
	}

	public int getDesNivel() {
		return desNivel;
	}

	public void setDesNivel(int desNivel) {
		this.desNivel = desNivel;
	}
}



