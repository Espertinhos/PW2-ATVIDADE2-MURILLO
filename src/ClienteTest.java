public class ClienteTest {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.nome = "Murillo";
		cliente.email = "murillopereira@outlook.com";
		cliente.telefone = 1487656565;
		cliente.cpf = 51324286;
		cliente.dtnascimento = DateTimeUtils.toDate(10, 06, 1995);
		
		System.out.println(cliente.ehMaiorIdade());
		
		}
	}

