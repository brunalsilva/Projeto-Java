package projetoJavaB1;

public class TesteMetodo1 {
	public static void main(String args[])
	{
		Energia emp1= new Energia(null, null, 0, 0, null, 0, 0);
		
		emp1.cadastroEmpresa();
		
		System.out.println(emp1.getNomeEmpresa());
	
	}

}
