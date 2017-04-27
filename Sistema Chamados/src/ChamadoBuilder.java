import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChamadoBuilder {

	private List<Chamado> chamados = new ArrayList<>();

	private int id_chamado;
	private String titulo_chamado;
	private String usuario_chamado;
	private Servico servico_chamado;
	private String descricao_chamado;
	private DataHora abertura_chamado;
	private Status status_chamado;
	private Prioridade prioridade_chamado;

	public ChamadoBuilder(int id_chamado, String titulo_chamado, String usuario_chamado, Servico servico_chamado,
			String descricao_chamado, DataHora abertura_chamado, Status status_chamado, Prioridade prioridade_chamado) {
		this.id_chamado = id_chamado++;
		this.titulo_chamado = titulo_chamado;
		this.usuario_chamado = usuario_chamado;
		this.servico_chamado = servico_chamado;
		this.descricao_chamado = descricao_chamado;
		this.abertura_chamado = abertura_chamado;
		this.status_chamado = status_chamado.ABERTO;
		this.prioridade_chamado = prioridade_chamado;
	}

	public ChamadoBuilder addChamado(Chamado chamado) {
		chamados.add(chamado);
		return this;
	}

	public ChamadoBuilder setServico_chamado(Servico servico_chamado) {
		this.servico_chamado = servico_chamado;
		return this;
	}

	public ChamadoBuilder setPrioridade_chamado(Prioridade prioridade_chamado) {
		this.prioridade_chamado = prioridade_chamado;
		return this;
	}

	public Chamado build() {
		Chamado chamado = new Chamado(id_chamado, descricao_chamado, descricao_chamado, servico_chamado,
				descricao_chamado, abertura_chamado, status_chamado, prioridade_chamado);
		chamado.setServico_chamado(servico_chamado);
		chamado.setPrioridade_chamado(prioridade_chamado);
		chamados.add(chamado);
		return chamado;
	}

}
