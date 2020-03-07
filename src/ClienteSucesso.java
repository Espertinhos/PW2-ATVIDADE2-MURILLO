import java.util.Date;

public class ClienteSucesso {
	public static void main(String[] args) {
		Cliente clie = new Cliente();
		clie.nome = "Murillo";
		clie.cpf = 323232;
		clie.dtnascimento = new Date();
		
		if (clie.ehCPFValido() && clie.ehMaiorIdade()) {
			System.out.println("Sucesso!!");
		}else {
			System.out.println("Erro");
		}
		
		
	}
}
