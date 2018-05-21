import java.net.*;
import java.io.*;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args)
    {
        String output  = getUrlContents(" https://api.mercadolibre.com/sites/MLA/listing_types");
        System.out.println("Transforma el siguiente listado JSON a un array de Objetos: \n");
        System.out.println(output);
        System.out.println("Array de Objetos: \n");
        Gson gson = new Gson();
        TipoListado[] listado = gson.fromJson(output, TipoListado[].class);
        for (TipoListado tipoListado : listado) {
            System.out.println(tipoListado);
        }

    }

    private static String getUrlContents(String theUrl)
    {
        StringBuilder content = new StringBuilder();
        try
        {
            URL url = new URL(theUrl);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setRequestProperty("Accept", "*/*");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                content.append(line + "\n");
            }
            bufferedReader.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return content.toString();
    }
}