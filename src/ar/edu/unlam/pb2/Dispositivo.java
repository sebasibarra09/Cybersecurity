package ar.edu.unlam.pb2;

public class Dispositivo {

	protected String sistemaOperativo;
	protected String direccionIp;
	protected String localidadDeConexion;
	
	
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	public String getDireccionIp() {
		return direccionIp;
	}
	public void setDireccionIp(String direccionIp) {
		this.direccionIp = direccionIp;
	}
	public String getLocalidadDeConexion() {
		return localidadDeConexion;
	}
	public void setLocalidadDeConexion(String localidadDeConexion) {
		this.localidadDeConexion = localidadDeConexion;
	}
	
}
