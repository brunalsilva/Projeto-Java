package projetoJavaB1;

import java.util.ArrayList;

public class TesteCadastro {

	public static void main(String[] args) {
			  	  
		Empresa emp1 = new Empresa(null, null, 0, 0, 0, 0, 0);
		
		
		System.out.println("============================================================================================================");
		System.out.println("_____         __                        ___                ___              __ \r\n"
				+ "_  _/_()____()__  ____       _  _ \\_____ __()__ ___  /_\r\n"
				+ "__ \\ _  / _  _/_  / _  / / /_  _/       _  // /_  _/_  _ \\__  / _  _ \\_  _/_  __/\r\n"
				+ "_/ / _  /  _  /    _  /  / // / (_  )        _  _/ _  /    / // /__  /  /  _// /_  / /_  \r\n"
				+ "/_/  //   //     //   \\_,/  /_/         //      //     \\_/ _  /   \\__/ \\_/  \\_/  \r\n"
				+ "                                                                           /_/");
		System.out.println("============================================================================================================");
		System.out.println("\n\t\t\tS  I  R  I  U  S         P  R  O  J  E  C  T         v1.0");
		System.out.println("\n\t\t\t\tPrezade Cliente, seja bem-vinde ao futuro!\n\n");
		
		emp1.cadastroEmpresa();
			
	}
}

