package APP;

import java.util.List;

import DAO.ClienteDao;
import DAO.PedidoDao;
import MODEL.Cliente;
import MODEL.Pedido;

public class App {
    public static void main( String[] args ) {
    	
    	
    	
    	
    	System.out.println("************************************** CLIENTES **************************************");
    	System.out.println();
    	ClienteDao clienteDao = new ClienteDao();
    	
        List<Cliente> misClientes = clienteDao.getAll();
        
        for (Cliente u : misClientes) {
			System.out.println(u.toString());
		}
        
        System.out.println();
        System.out.println("************************************** PEDIDOS **************************************");
    	System.out.println();
    	PedidoDao pedidoDao = new PedidoDao();
    	List<Pedido> misPedidos = pedidoDao.getAll();
        
    	for (Pedido v : misPedidos) {
			System.out.println(v.toString());
		}
    	
    	System.out.println();
        System.out.println("************************************** AÑADIR CLIENTES **************************************");
    	System.out.println();    	
    	Cliente c1 = new Cliente(0, null, null, null, 0, 0, null, null, null, null, null, 0, 0, 0);
    	clienteDao.guardar(c1);
    	
    	
    }
}
