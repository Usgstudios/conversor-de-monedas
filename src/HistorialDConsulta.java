import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class HistorialDConsulta {
    public void historialConsulta(){
        String pie = "********************************************************************";
        Gson gson = new Gson();

        String menu = """
                    ************************** HISTORIAL ********************************
                    """;
        System.out.println(menu);

        try{
            FileReader lector = new FileReader("historialD.json");

            Type listType = new TypeToken<List<DivisasModel>>() {}.getType();

            List<DivisasModel> listaDivisa = gson.fromJson(lector, listType);

            for (DivisasModel divisasModel : listaDivisa) {
                System.out.println(divisasModel.getValor() + " " + divisasModel.getMonedaLocal() + " => " + divisasModel.getMonedaConvertir() +
                        " = " + divisasModel.getResultado() + " " + divisasModel.getMonedaConvertir() + "  Precio" + " = " + divisasModel.getPrecioConvercion() + "  " + divisasModel.getFecha());
            }

            System.out.println("\n" + pie);

        } catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
            System.out.println("Vacio\n" + pie);
        }
    }
}
