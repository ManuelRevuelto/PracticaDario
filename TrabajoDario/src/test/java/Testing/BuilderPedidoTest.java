package Testing;

import org.junit.Assert;
import org.junit.Test;

import DAO.BuilderClienteDao;
import EXCEPCIONES.MisExcepciones;
import MODEL.misDocumentos;

public class BuilderPedidoTest {

	@Test
	private void test() {
	}

	@Test
	public void comprobarDNIValido() {
		try {
			Assert.assertTrue(BuilderClienteDao.validarDocumento(misDocumentos.DNI, "12345678Q"));
		} catch (MisExcepciones e) {
			e.printStackTrace();
		}
	}

	@Test
	public void comprobarDNINoValido() {
		try {
			Assert.assertFalse(BuilderClienteDao.validarDocumento(misDocumentos.DNI, "12334re5678Q"));
		} catch (MisExcepciones e) {
			e.printStackTrace();
		}
	}

	@Test
	public void comprobarNIEValido() throws MisExcepciones {
		try {
			Assert.assertTrue(BuilderClienteDao.validarDocumento(misDocumentos.NIE, "Q2345678Q"));
		} catch (MisExcepciones e) {
			e.printStackTrace();
		}
	}

	@Test
	public void comprobarNIENoValido() throws MisExcepciones {
		try {
			Assert.assertFalse(BuilderClienteDao.validarDocumento(misDocumentos.NIE, "123drfth45678Q"));
		} catch (MisExcepciones e) {
			e.printStackTrace();
		}
	}

	@Test
	public void comprobarEmailValido() {
		try {
			Assert.assertTrue(BuilderClienteDao.validarEmail("albaricoque12@gmail.com"));
		} catch (MisExcepciones e) {
			e.printStackTrace();
		}
	}

	@Test
	public void comprobarEmailNoValido() {
		try {
			Assert.assertFalse(BuilderClienteDao.validarEmail("emailerroneo"));
		} catch (MisExcepciones e) {
			e.printStackTrace();
		}
	}
}