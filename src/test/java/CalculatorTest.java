import org.junit.Assert;
import org.junit.Test;
import Ex4.Calculator;
/**
 * Created by G3B
 * */
public class CalculatorTest {

    /**
     * Данные тесты производят проверку всех текущих действий в ООП калькуляторе
     * @see #getResultTestWithGoodArgumentsAdd()
     * @see #getResultTestWithGoodArgumentsSub()
     * @see #getResultTestWithGoodArgumentsMul()
     * @see #getResultTestWithGoodArgumentsDiv()
     * */

    @Test
    public void getResultTestWithGoodArgumentsDiv() throws Calculator.nullDivException, Calculator.operationException {
        Calculator calc = new Calculator(4,2,"/");
        Assert.assertEquals("Неправильный результат при деление 4 на 2", 2, calc.getResult(),0);
    }
    @Test
    public void getResultTestWithGoodArgumentsSub() throws Calculator.nullDivException, Calculator.operationException {
        Calculator calc = new Calculator(6,-2,"-");
        Assert.assertEquals("Неправильный результат при вычитании 6-(-2)", 8, calc.getResult(),0);
    }

    @Test
    public void getResultTestWithGoodArgumentsAdd() throws Calculator.nullDivException, Calculator.operationException {
        Calculator calc = new Calculator(6,4,"+");
        Assert.assertEquals("Неправильный результат при сложение 6+4)", 10, calc.getResult(),0);
    }

    @Test
    public void getResultTestWithGoodArgumentsMul() throws Calculator.nullDivException, Calculator.operationException {
        Calculator calc = new Calculator(8,4,"*");
        Assert.assertEquals("Неправильный результат при умножение 8*4", 32, calc.getResult(),0);
    }
}