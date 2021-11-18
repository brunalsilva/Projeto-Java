package projetoJavaB1;

import java.util.ArrayList;

public class TesteCadastro {

	public static void main(String[] args) {
			  	  
		Empresa emp1 = new Empresa(null, null, 0, 0, 0, 0, 0);
<<<<<<< HEAD
	
=======
		Empresa emp2 = new Empresa(null, null, 0, 0, 0, 0, 0);
		Empresa emp3 = new Empresa(null, null, 0, 0, 0, 0, 0);
		Empresa emp4 = new Empresa(null, null, 0, 0, 0, 0, 0);
		
		System.out.println("============================================================================================================");
		System.out.println("_____________         _____                        ________                ________       _____        \r\n"
				+ "__  ___/___(_)___________(_)____  __________       ___  __ \\______________ ______(_)_____ __  /________\r\n"
				+ "_____ \\ __  / __  ___/__  / _  / / /__  ___/       __  /_/ /__  ___/_  __ \\_____  / _  _ \\_  __/_  ___/\r\n"
				+ "____/ / _  /  _  /    _  /  / /_/ / _(__  )        _  ____/ _  /    / /_/ /____  /  /  __// /_  / /__  \r\n"
				+ "/____/  /_/   /_/     /_/   \\__,_/  /____/         /_/      /_/     \\____/ ___  /   \\___/ \\__/  \\___/  \r\n"
				+ "                                                                           /___/");
		System.out.println("============================================================================================================");
		System.out.println("Prezade Cliente, seja Bem-Vinde ao Futuro!!\nPor favor, prossiga com o seu Cadastro.");
		ArrayList<String> empresas = new ArrayList();
		ArrayList<String> cnpjs = new ArrayList();
		ArrayList<Integer> regiao = new ArrayList();
		ArrayList<String> regioesTxt = new ArrayList();
>>>>>>> 12828140bd3cd1194376efc7c1dfa042fb03b0fd
		
		emp1.cadastroEmpresa();
		
		
		
<<<<<<< HEAD
=======
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
>>>>>>> 12828140bd3cd1194376efc7c1dfa042fb03b0fd
}
	}

