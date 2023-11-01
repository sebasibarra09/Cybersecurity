package ar.edu.unlam.pb2;

public class Monetaria extends Transaccion implements Rechazable, Alertable, Monitoreable {

	@Override
	public void marcarComoCasoSospechoso() {
		// TODO Auto-generated method stub

	}

	@Override
	public void confirmarSiFueFraude(Boolean fueFraude) {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean monitorear() throws FraudeException {
		// TODO Auto-generated method stub
		return null;
	}

}
