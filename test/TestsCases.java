import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestsCases {

	@Test
	void queSePuedaCrearUnCliente() {
		Long cuitEsperado = 20403503216L;
		String nombreEsperado = "Marcelo Sebastian";
		Cliente nuevoCliente = new Cliente(20403503216L, "Marcelo Sebastian");
		assertEquals(nuevoCliente.getCuit(), cuitEsperado);
		assertEquals(nuevoCliente.getNombre(), nombreEsperado);
		
	}

}
