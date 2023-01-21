package kata6;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import static java.util.stream.Collectors.joining;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Kata6 {
    public static void main(String[] args) throws IOException, JAXBException {

        String json = read("https://api.dictionaryapi.dev/api/v2/entries/en/apple");
        
        Gson gson = new Gson();
        Word word = gson.fromJson(gson.fromJson(json, JsonArray.class).get(0), Word.class);
        Word.Phonetic p = word.phonetics.get(0);
        System.out.println(p.license.url);
        
        
        JAXBContext context = JAXBContext.newInstance(Word.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(word, System.out); 
        
        
        
        String cerveceria_json = read("https://api.openbrewerydb.org/breweries/10-56-brewing-company-knox");
         
        Brewerie cerveceria = gson.fromJson(cerveceria_json, Brewerie.class);
        
            
        JAXBContext context1 = JAXBContext.newInstance(Brewerie.class);
        Marshaller marshaller1 = context1.createMarshaller();
        marshaller1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        
        System.out.println("\n \n JSON VS XML");
        
        System.out.println("\n ----------- Source: JSON --------------");        
        System.out.println(cerveceria);
        System.out.println("\n ------------- Resultado: XML -------------");
        marshaller1.marshal(cerveceria, System.out); 
         
         
         
        
        
    }
  
    private static String read(String url) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(url).openStream()))) {
            return reader.lines().collect(joining(" "));
        }
    }

    
}
