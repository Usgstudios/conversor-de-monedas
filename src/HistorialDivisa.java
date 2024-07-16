import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HistorialDivisa {
    public void historialConvercion(String json, int valor) throws IOException {
        List<DivisasModel> listaDivisa;

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        File archivo = new File("historialD.json");

        if (archivo.exists()){
            FileReader lector = new FileReader(archivo);
            listaDivisa = gson.fromJson(lector, new TypeToken<List<DivisasModel>>(){}.getType());
            lector.close();
        } else {
            listaDivisa = new ArrayList<>();
        }

        Fecha fecha = new Fecha();
        String formatofecha = fecha.fecha();


        DivisasModel divisasModel = gson.fromJson(json, DivisasModel.class);
        divisasModel.setValor(valor);
        divisasModel.setFecha(formatofecha);
        listaDivisa.add(divisasModel);

        FileWriter escritura = new FileWriter(archivo);
        escritura.write(gson.toJson(listaDivisa));
        escritura.close();
    }
}
