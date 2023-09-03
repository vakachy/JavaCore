package Model;

/**
 * Класс для выполнения некоторых математических операций:
 * сложение, деление, умножение и вычитание
 */
public class Evaluation {
    private Integer resultInt;
    private Double resultDouble;
    private Float resultFloat;
    private String resultString;

    /**
     * Функция суммирования двух чисел или строк
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b.
     */
    public <T> void add(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            this.resultInt = (Integer) a + (Integer) b;
        }
        if (a instanceof Double && b instanceof Double) {
            this.resultDouble = (Double) a + (Double) b;
        }
        if (a instanceof Float && b instanceof Float) {
            this.resultFloat = (Float) a + (Float) b;
        }
        if (a instanceof String && b instanceof String) {
            this.resultString = (String) a + (String) b;
        }
    }

    /**
     * Функция деления двух  чисел или строк
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b.
     */
    public <T> void div(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            this.resultInt = (Integer) a / (Integer) b;
        }
        if (a instanceof Double && b instanceof Double) {
            this.resultDouble = (Double) a / (Double) b;
        }
        if (a instanceof Float && b instanceof Float) {
            this.resultFloat = (Float) a / (Float) b;
        }
        if (a instanceof String && b instanceof String) {
            this.resultString = (String) a + "/" + (String) b;
        }
    }

    /**
     * Функция умножения двух чисел или строк
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b.
     */
    public <T> void mul(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            this.resultInt = (Integer) a * (Integer) b;
        }
        if (a instanceof Double && b instanceof Double) {
            this.resultDouble = (Double) a * (Double) b;
        }
        if (a instanceof Float && b instanceof Float) {
            this.resultFloat = (Float) a * (Float) b;
        }
        if (a instanceof String && b instanceof String) {
            this.resultString = (String) a + "*" + (String) b;
        }
    }

    /**
     * Функция вычитания двух чисел или строк
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b.
     */
    public <T> void sub(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            this.resultInt = (Integer) a - (Integer) b;
        }
        if (a instanceof Double && b instanceof Double) {
            this.resultDouble = (Double) a - (Double) b;
        }
        if (a instanceof Float && b instanceof Float) {
            this.resultFloat = (Float) a - (Float) b;
        }
        if (a instanceof String && b instanceof String) {
            this.resultString = (String) a + "-" + (String) b;
        }
    }

    public Integer getResultInt() {
        return resultInt;
    }

    public Double getResultDouble() {
        return resultDouble;
    }

    public Float getResultFloat() {
        return resultFloat;
    }

    public String getResultString() {
        return resultString;
    }
}
