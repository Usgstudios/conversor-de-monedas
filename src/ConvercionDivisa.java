import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConvercionDivisa {
    public void resultadoConvercion(String divisa1, String divisa2, int valor) throws IOException, InterruptedException {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/f89e079ce93935ea62585b2f/pair/" + divisa1 + "/" + divisa2 + "/" + valor);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();
        DivisasModel divisasModel = gson.fromJson(json, DivisasModel.class);
        System.out.println("La convercion de " + valor + " " + divisa1 + " a " + divisa2 + " es de " + divisasModel.getResultado() + " " + divisa2);

        HistorialDivisa historialDivisa = new HistorialDivisa();
        historialDivisa.historialConvercion(json,valor);

    }
}
