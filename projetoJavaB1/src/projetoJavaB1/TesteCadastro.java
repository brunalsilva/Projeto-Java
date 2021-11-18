package projetoJavaB1;

import java.util.ArrayList;

public class TesteCadastro {

	public static void main(String[] args) {
			  	  
		Empresa emp1 = new Empresa(null, null, 0, 0, 0, 0, 0);
		
		System.out.println("============================================================================================================");
		System.out.println("_____________         _____                        ________                ________       _____        \r\n"
				+ "__  ___/___(_)___________(_)____  __________       ___  __ \\______________ ______(_)_____ __  /________\r\n"
				+ "_____ \\ __  / __  ___/__  / _  / / /__  ___/       __  /_/ /__  ___/_  __ \\_____  / _  _ \\_  __/_  ___/\r\n"
				+ "____/ / _  /  _  /    _  /  / /_/ / _(__  )        _  ____/ _  /    / /_/ /____  /  /  __// /_  / /__  \r\n"
				+ "/____/  /_/   /_/     /_/   \\__,_/  /____/         /_/      /_/     \\____/ ___  /   \\___/ \\__/  \\___/  \r\n"
				+ "                                                                           /___/");
		System.out.println("============================================================================================================");
		System.out.println("Prezade Cliente, seja Bem-Vinde ao Futuro!!\nPor favor, prossiga com o seu Cadastro.");
	

		
		emp1.cadastroEmpresa();
			
		
}
	}

