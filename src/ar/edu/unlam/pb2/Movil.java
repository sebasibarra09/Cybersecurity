package ar.edu.unlam.pb2;

public class Movil extends Dispositivo {

	private Integer imei;
	private Boolean biometria;
	
	public Movil(String sistemaOperativo, String direccionIp, String localidadDeConexion, Integer imei,
			Boolean biometria) {
		this.sistemaOperativo=sistemaOperativo;
		this.direccionIp=direccionIp;
		this.localidadDeConexion=localidadDeConexion;
		this.imei=imei;
		this.biometria=biometria;
	}

	public Integer getImei() {
		return imei;
	}

	public void setImei(Integer imei) {
		this.imei = imei;
	}

	public Boolean getBiometria() {
		return biometria;
	}

	public void setBiometria(Boolean biometria) {
		this.biometria = biometria;
	}
}
