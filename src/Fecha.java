import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {
    public String fecha(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
