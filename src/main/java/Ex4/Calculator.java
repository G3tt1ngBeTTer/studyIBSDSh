package Ex4;

/**
 * Created by Danila Shestipalov
 *
 * @author G3B
 *
 */

public class Calculator {
    /**Переменные*/
    private int argument1;
    private int argument2;
    private String operation;
    private float result;


    public Calculator(int argument1, int argument2, String operation) {
        this.argument1 = argument1;
        this.argument2 = argument2;
        this.operation = operation;
    }

    public int getArgument2() {
        return argument2;
    }

    public void setArgument2(int argument2) {
        this.argument2 = argument2;
    }

    public int getArgument1() {
        return argument1;
    }

    public void setArgument1(int argument1) {
        this.argument1 = argument1;
    }

    /**Метод получения результата
     * */
    public void getResultOfCalculation(float arg1, float arg2, String operation) {
        switch (operation) {
            case "+":
                result=arg1 + arg2;
            break;
            case "-":
                result=arg1 - arg2;
            break;
            case "*":
                result=arg1 * arg2;
            break;
            case "/":
                result=arg1 / arg2;
            break;
            /**
             *             Убрал, хотя по моему мнению, можно оставить
             *             default:
             *             System.err.println("Ошибка незивестная операция "+ operation+ ", будет возвращён результат ноль");
             *
             */

        }
    }

    public float getResult() {
        getResultOfCalculation(argument1, argument2, operation);
        return result;
    }
}

