import java.util.Date;

public class Chamado {

	private int id_chamado;
	private String titulo_chamado;
	private String usuario_chamado;
	private Servico servico_chamado;
	private String descricao_chamado;
	private String responsavel_chamado;
	private DataHora abertura_chamado;
	private DataHora atualizacao_chamado;
	private Status status_chamado;
	private Prioridade prioridade_chamado;
	private String update_chamado;

	public Chamado(int id_chamado, String titulo_chamado, String usuario_chamado, Servico servico_chamado,
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

	public int getId_chamado() {
		return id_chamado;
	}

	public void setId_chamado(int id_chamado) {
		this.id_chamado = id_chamado;
	}

	public String getTitulo_chamado() {
		return titulo_chamado;
	}

	public void setTitulo_chamado(String titulo_chamado) {
		this.titulo_chamado = titulo_chamado;
	}

	public String getUsuario_chamado() {
		return usuario_chamado;
	}

	public void setUsuario_chamado(String usuario_chamado) {
		this.usuario_chamado = usuario_chamado;
	}

	public Servico getServico_chamado() {
		return servico_chamado;
	}

	public void setServico_chamado(Servico servico_chamado) {
		this.servico_chamado = servico_chamado;
	}

	public String getDescricao_chamado() {
		return descricao_chamado;
	}

	public void setDescricao_chamado(String descricao_chamado) {
		this.descricao_chamado = descricao_chamado;
	}

	public String getResponsavel_chamado() {
		return responsavel_chamado;
	}

	public void setResponsavel_chamado(String responsavel_chamado) {
		this.responsavel_chamado = responsavel_chamado;
	}

	public DataHora getAbertura_chamado() {
		return abertura_chamado;
	}

	public void setAbertura_chamado(DataHora abertura_chamado) {
		this.abertura_chamado = abertura_chamado;
	}

	public DataHora getAtualizacao_chamado() {
		return atualizacao_chamado;
	}

	public void setAtualizacao_chamado(DataHora atualizacao_chamado) {
		this.atualizacao_chamado = atualizacao_chamado;
	}

	public Status getStatus_chamado() {
		return status_chamado;
	}

	public void setStatus_chamado(Status status_chamado) {
		this.status_chamado = status_chamado;
	}

	public Prioridade getPrioridade_chamado() {
		return prioridade_chamado;
	}

	public void setPrioridade_chamado(Prioridade prioridade_chamado) {
		this.prioridade_chamado = prioridade_chamado;
	}

	public String getUpdate_chamado() {
		return update_chamado;
	}

	public void setUpdate_chamado(String update_chamado) {
		this.update_chamado = update_chamado;
	}

}
