import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    protected int num = 1;

    private static Logger logger;

    private Logger() {
    }

    public void log(String msg) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        String format = formatter.format(new Date(System.currentTimeMillis()));
        System.out.println("[" + format + " " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        return (logger != null) ? logger : (logger = new Logger());
    }

}
