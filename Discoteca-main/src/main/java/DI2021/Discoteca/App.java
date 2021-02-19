package DI2021.Discoteca;

import java.util.List;

import DI2021.Discoteca.models.Album;
import DI2021.Discoteca.models.Usuario;
import DI2021.Discoteca.services.AlbumRecoveryService;
import DI2021.Discoteca.services.UsuarioRecoveryService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Ejemplo Básico de recuperación de datos" );
        List<Album> myAlbums = AlbumRecoveryService.getAllAlbums();
        for(var album: myAlbums) {
        	System.out.println(album);
        }
        
        List<Usuario> usuarios = UsuarioRecoveryService.getAllUsuarios();
        for(var user: usuarios) {
        	System.out.println(user);
        }
    }
}
