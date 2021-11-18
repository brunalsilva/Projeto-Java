package projetoJavaB1;

import java.util.ArrayList;

public class TesteCadastro {

	public static void main(String[] args) {
		
		Empresa emp1 = new Empresa(null, null, 0, 0, 0, 0, 0);
		Empresa emp2 = new Empresa(null, null, 0, 0, 0, 0, 0);
		Empresa emp3 = new Empresa(null, null, 0, 0, 0, 0, 0);
		Empresa emp4 = new Empresa(null, null, 0, 0, 0, 0, 0);
		
		
		ArrayList<String> empresas = new ArrayList();
		ArrayList<String> cnpjs = new ArrayList();
		ArrayList<Integer> regiao = new ArrayList();
		ArrayList<String> regioesTxt = new ArrayList();
		
		emp1.cadastroEmpresa();
		empresas.add(emp1.getNomeEmpresa());
		cnpjs.add(emp1.getCnpj());
		regiao.add(emp1.getRegiao());
		
		emp2.cadastroEmpresa();
		empresas.add(emp2.getNomeEmpresa());
		cnpjs.add(emp2.getCnpj());
		regiao.add(emp2.getRegiao());
		
		emp3.cadastroEmpresa();
		empresas.add(emp3.getNomeEmpresa());
		cnpjs.add(emp3.getCnpj());
		regiao.add(emp3.getRegiao());
		
		emp4.cadastroEmpresa();
		empresas.add(emp4.getNomeEmpresa());
		cnpjs.add(emp4.getCnpj());
		regiao.add(emp4.getRegiao());
		
		for(int i = 0;i<regiao.size();i++)
		{
			if(regiao.get(i)  == 1)
			{
				regioesTxt.add("Norte");
			}
			if(regiao.get(i)  == 2)
			{
				regioesTxt.add("Nordeste");
			}
			if(regiao.get(i)  == 3)
			{
				regioesTxt.add("Centro oeste");
			}
			if(regiao.get(i)  == 4)
			{
				regioesTxt.add("Sudeste");
			}
			if(regiao.get(i) == 5)
			{
				regioesTxt.add("Sul");
			}
			
		}
		
	
			System.out.println("As empresas cadastradas são: "+empresas);	
			System.out.println("Os CNPJs das empresas cadastradas são: "+cnpjs);
			System.out.println("A região que as empresas se situam: "+regioesTxt);
		
				    
	}
}

