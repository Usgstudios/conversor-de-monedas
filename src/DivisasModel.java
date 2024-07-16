import com.google.gson.annotations.SerializedName;

public class DivisasModel {
    @SerializedName("conversion_result")
    double resultado;
    @SerializedName("base_code")
    String monedaLocal;
    @SerializedName("target_code")
    String monedaConvertir;
    @SerializedName("conversion_rate")
    double precioConvercion;
    @SerializedName("valor")
    int valor;
    @SerializedName("fecha")
    String fecha;

    public DivisasModel(double resultado, String monedaLocal, String monedaConvertir, double precioConvercion, int valor, String fecha) {
        this.resultado = resultado;
        this.monedaLocal = monedaLocal;
        this.monedaConvertir = monedaConvertir;
        this.precioConvercion = precioConvercion;
        this.valor = valor;
        this.fecha = fecha;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getMonedaLocal() {
        return monedaLocal;
    }

    public void setMonedaLocal(String monedaLocal) {
        this.monedaLocal = monedaLocal;
    }

    public String getMonedaConvertir() {
        return monedaConvertir;
    }

    public void setMonedaConvertir(String monedaConvertir) {
        this.monedaConvertir = monedaConvertir;
    }

    public double getPrecioConvercion() {
        return precioConvercion;
    }

    public void setPrecioConvercion(double precioConvercion) {
        this.precioConvercion = precioConvercion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "DivisasModel{" +
                "resultado=" + resultado +
                ", monedaLocal='" + monedaLocal + '\'' +
                ", monedaConvertir='" + monedaConvertir + '\'' +
                ", precioConvercion=" + precioConvercion +
                ", valor=" + valor +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
