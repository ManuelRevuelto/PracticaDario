package EXCEPCIONES;

@SuppressWarnings("serial")
public class MisExcepciones extends Exception {
	private int codigoError;

	public MisExcepciones(int codigoError) {
		super();
		this.codigoError = codigoError;
	}

	public String getMessage() {

		String mensaje = "";
		switch (codigoError) {
		case 111:
			mensaje = "Compruebe el ID de los clientes introducidos";
			System.out.println("El ID del clientes es erroneo");
			break;
		case 222:
			mensaje = "Compruebe el valor del DNI y corrijalo";
			System.out.println("El DNI esta mal introducido");
			break;
		case 333:
			mensaje = "Compruebe el valor del NIE y corrijalo";
			System.out.println("El NIE esta mal introducido");
			break;
		case 444:
			mensaje = "Compruebe el email introducido y corrijalo";
			System.out.println("El email esta mal introducido");
			break;
		case 555:
			mensaje = "Compruebe que la fecha del pedido sea la fecha actual";
			System.out.println("La fecha del pedido no es la misma que la del dia de hoy");
			break;
		case 666:
			mensaje = "Compruebe que la fecha esperada sea la fecha actual";
			System.out.println("La fecha del pedido es anterior a la fecha de hoy");
			break;
		case 777:
			mensaje = "Compruebe el ID de los pedidos introducidos";
			System.out.println("El ID del pedido es erroneo");
			break;
		case 888:
			mensaje = "Compruebe el ID de icliente introducido en el pedido introducidos";
			System.out.println("El ID del clientes introducido en el pedido no existe");
			break;
		case 999:
			mensaje = "";
			System.out.println("");
			break;
		case 1000:
			mensaje = "";
			System.out.println("");
			break;
		}

		return mensaje;

	}
}
