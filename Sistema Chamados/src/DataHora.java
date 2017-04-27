import java.text.SimpleDateFormat;
import java.util.Date;

public class DataHora {

	private Date data;
	private Date hora;
	
	public DataHora(Date data, Date hora) {
		
		this.data = data;
		this.hora = hora;
		String dateString = data+" "+hora;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        dateString = df.format(dateString);
	}

	public String dataReal(String data) {
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		data = df.format(date);
		return data;
	}

	public String horaReal(String hora) {
		Date date = new Date();
		SimpleDateFormat hf = new SimpleDateFormat("hh:mm:ss");
		hora = hf.format(date);
		return hora;
	}

}
