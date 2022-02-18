package Ex4;

/**
 * Created by Danila Shestipalov
 *
 * @author G3B
 */

public class Calculator {
    /**
     * Переменные
     */
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

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Метод получения результата
     */
    public void getResultOfCalculation(float arg1, float arg2, String operation) throws operationException, nullDivException {


        switch (operation) {
            case "+":
                result = arg1 + arg2;
                break;
            case "-":
                result = arg1 - arg2;
                break;
            case "*":
                result = arg1 * arg2;
                break;
            case "/":
                if (arg2 == 0) {
                    throw new nullDivException();
                } else {
                    result = arg1 / arg2;
                }
                break;
            default:
                throw new operationException();
        }
    }

    public float getResult() throws nullDivException, operationException {
        getResultOfCalculation(argument1, argument2, operation);
        return result;
    }

    /**Ошибка при деление на ноль*/
    public class nullDivException extends Exception {
        private int arg2 = getArgument2();

        public String getMsg() {
            return "Ошибка на ноль делить нельзя! Вторым аргументом был подан - " + arg2;
        }
    }

    /**Ошибка при вводе неправельной операции*/
    public class operationException extends Exception {
        private String op = getOperation();

        public String getMsg() {
            return "Ошибка неизвестная операция " + op;
        }
    }

}

