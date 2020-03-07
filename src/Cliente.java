import java.util.Calendar;
import java.util.Date;

public class Cliente {
	String nome;
	String email;
	int telefone;
	Date dtnascimento;
	int cpf;

	public boolean ehMaiorIdade() {
		Calendar cData = Calendar.getInstance();
		Calendar cHoje = Calendar.getInstance();
		cData.setTime(dtnascimento);
		cData.set(Calendar.YEAR, cHoje.get(Calendar.YEAR));
		int idade = cData.after(cHoje) ? -1 : 0;
		cData.setTime(dtnascimento);
		idade += cHoje.get(Calendar.YEAR) - cData.get(Calendar.YEAR);

		if (idade >= 18) {
			return true;

		} else {
			return false;

		}
		
	}

}
