import java.util.Date;

public class Principal {

	public static void main(String[] args) {

		// data/hora em tempo real
		Date data = new Date();
		Date hora = new Date();
		DataHora abertura_chamado = new DataHora(data, hora);

		Chamado chamado = new ChamadoBuilder(1, "Problema no RStudio", "000933295", Servico.APLICACAO,
				"Diret�rio do arquivo n�o encontrado.", abertura_chamado, Status.ABERTO, Prioridade.MEDIA).build();
		
		Chamado chamado2 = new ChamadoBuilder(2, "Sem conex�o", "000933295", Servico.INTERNET,
				"N�o h� conex�o com a internet na m�quina PT1L313.", abertura_chamado, Status.ABERTO, Prioridade.ALTA).build();
	}
}
