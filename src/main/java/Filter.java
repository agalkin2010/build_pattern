import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < source.size(); i++) {
            int value = source.get(i);
            if (value > this.treshold) {
                result.add(value);
                logger.log("Элемент \"" + value + "\" проходит");
                continue;
            }
            logger.log("Элемент \"" + value + "\" не проходит");
        }

        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        return result;
    }

}
