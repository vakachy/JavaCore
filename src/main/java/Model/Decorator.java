package Model;

/**
 * Класс для оформления результата вычислений
 */
public class Decorator {

    /**
     * Метод для оформления результата для последующего вывода в консоль
     *
     * @param thingToDecorate -- число или строка, которую необходимо оформить
     * @return String
     */
    public static <T> String decorate(T thingToDecorate) {
        return "This is the result of the operation: " + thingToDecorate;
    }
}
