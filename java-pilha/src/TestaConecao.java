
public class TestaConecao {
	
	public static void main(String[] args) {
		
		try (Conecao con = new Conecao()){
			con.leDados();
		}catch (IllegalStateException ex) {
			System.out.println("Deu erro na coneção");
		}
	   /**
		Conecao con = null;
		
		try {
			con = new Conecao();
			con.leDados();
		}catch (IllegalStateException ex) {
			System.out.println("Deu erro na coneção");
		}finally {
			con.close();
		}*/
	}
}
	
	
		
		
	
