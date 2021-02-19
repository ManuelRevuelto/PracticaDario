package DI2021.Discoteca.services;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import com.google.gson.Gson;

import DI2021.Discoteca.models.Album;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
*
* @author darioaxel
*/
public class AlbumRecoveryService {
    
	//Locate the file 
    private static Path getLocalOrdersMockData() {
        return Paths.get(System.getProperty("user.dir"), "utils", "albums.json");
    }    
        
    public static List<Album> getAllAlbums() {
        
        Gson gson = new Gson();
        Album[] albums;
        try {
            albums = gson.fromJson(new FileReader(getLocalOrdersMockData().toString()), Album[].class);            

        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found!!");
            return null;
        }
        return Arrays.asList(albums);
        //System.out.println(gson.toJson(myTypes));
    }

    public static void saveAlbums(List<Album> allUsers) {        
        Gson gson = new Gson();
        String usersJson = gson.toJson(allUsers.toArray());
        try (FileWriter fileWriter = new FileWriter(getLocalOrdersMockData().toString())) {
           fileWriter.write(usersJson);
        }catch (IOException fnfe) {
            System.out.println("File not found!!");            
        }
    }
}
    
   

