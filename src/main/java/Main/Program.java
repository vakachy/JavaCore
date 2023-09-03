package Main;

import Model.Decorator;
import Model.Evaluation;

/**
 * Основной класс приложения, содержащий точку входа
 */
public class Program {

    /**
     * Точка входа в программу (главный метод)
     *
     * @param args -- параметры главного метода в виде массива строк
     */
    public static void main(String[] args) {

        Evaluation ev = new Evaluation();

        ev.add(3, 5);
        System.out.println(Decorator.decorate(ev.getResultInt()));

        ev.add("123", "456");
        System.out.println(Decorator.decorate(ev.getResultString()));

        ev.sub("123", "456");
        System.out.println(Decorator.decorate(ev.getResultString()));
    }
}
