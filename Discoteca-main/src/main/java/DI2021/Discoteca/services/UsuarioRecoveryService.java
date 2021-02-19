package DI2021.Discoteca.services;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import DI2021.Discoteca.models.Usuario;

public class UsuarioRecoveryService {
	 // USERS
	private static Path getLocalUserMockData() {
		return Paths.get(System.getProperty("user.dir"), "utils", "usuarios.json");
	}

    public static List<Usuario> getAllUsuarios() {
           
        Gson gson = new Gson();
        Usuario[] users;
        try {
            users = gson.fromJson(new FileReader(getLocalUserMockData().toString()), Usuario[].class);            

        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found!!");
            return null;
        }
        return Arrays.asList(users);
        //System.out.println(gson.toJson(myTypes));
    }

    public static void saveAllUsuarios(List<Usuario> allUsers) {        
        Gson gson = new Gson();
        String usersJson = gson.toJson(allUsers.toArray());
        try (FileWriter fileWriter = new FileWriter(getLocalUserMockData().toString())) {
           fileWriter.write(usersJson);
        }catch (IOException fnfe) {
            System.out.println("File not found!!");            
        }
    }
}
