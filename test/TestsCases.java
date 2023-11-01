import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unlam.pb2.Movil;
import ar.edu.unlam.pb2.Pc;

class TestsCases {

	@Test
	void queSePuedaCrearUnCliente() {
		Long cuitEsperado = 20403503216L;
		String nombreEsperado = "Marcelo Sebastian";
		Cliente nuevoCliente = new Cliente(20403503216L, "Marcelo Sebastian");
		assertEquals(nuevoCliente.getCuit(), cuitEsperado);
		assertEquals(nuevoCliente.getNombre(), nombreEsperado);
		
	}
	
	@Test
	void queSePuedaCrearUnDispositivo() {
		String sistemaOperativoEsperado = "Windows";
		String direccionIpEsperado = "172151815185";
		String localidadDeConexionEsperado = "Castillo";
		Integer imeiEsperado = 12;
		Boolean biometriaEsperada = false;
		Pc nuevaPC = new Pc("Windows", "172151815185","Castillo" );
		Movil nuevoMovil = new Movil("Windows", "172151815185","Castillo", 12, false );
		assertEquals(nuevaPC.getSistemaOperativo(), sistemaOperativoEsperado);
		assertEquals(nuevaPC.getDireccionIp(), direccionIpEsperado);
		assertEquals(nuevaPC.getLocalidadDeConexion(), localidadDeConexionEsperado);
		assertEquals(nuevoMovil.getDireccionIp(), direccionIpEsperado);
		assertEquals(nuevoMovil.getDireccionIp(), direccionIpEsperado);
		assertEquals(nuevoMovil.getDireccionIp(), direccionIpEsperado);
		assertEquals(nuevoMovil.getImei(), imeiEsperado);
		assertEquals(nuevoMovil.getBiometria(), biometriaEsperada);
	}
	
	@Test
	void queSePuedaMonitorearUnaExtraccion() {
		Long cuitEsperado = 20403503216L;
		String nombreEsperado = "Marcelo Sebastian";
		Cliente nuevoCliente = new Cliente(20403503216L, "Marcelo Sebastian");
		assertEquals(nuevoCliente.getCuit(), cuitEsperado);
		assertEquals(nuevoCliente.getNombre(), nombreEsperado);
		
	}
	
	

}
