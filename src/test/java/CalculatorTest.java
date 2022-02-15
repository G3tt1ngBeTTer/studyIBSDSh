import org.junit.Assert;
import org.junit.Test;
import Ex4.Calculator;
/**
 * Created by G3B
 * */
public class CalculatorTest {

    /**
     * В данных тестах результат ноль, вызывающий ошибку правилен и тест направлен на отслеживание обнаружения этой ошибки
     * @see #getResultTestWithBadOperation()
     * @see #getResultTestWithNullSecondArg()
     * */
    @Test
    public void getResultTestWithBadOperation () {
        Calculator calc = new Calculator(4,3,"оо");
        Assert.assertEquals("Неправильная операция", 0, calc.getResult(),0);
    }

    @Test
    public void getResultTestWithNullSecondArg() {
        Calculator calc = new Calculator(4,0,"/");
        Assert.assertEquals("На ноль делить нельзя", 0, calc.getResult(),0);
    }

    /**
     * Данный тест производит проверку всех текущих действий в ООП калькуляторе
     * @see #getResultTestWithGoodArguments()
     * */

    @Test
    public void getResultTestWithGoodArguments(){
        Calculator calc = new Calculator(4,2,"/");
        Assert.assertEquals("Неправильный результат при деление 4 на 2", 2, calc.getResult(),0);
        Calculator calc1 = new Calculator(6,-2,"-");
        Assert.assertEquals("Неправильный результат при вычитании 6-(-2)", 8, calc1.getResult(),0);
        Calculator calc2 = new Calculator(6,4,"+");
        Assert.assertEquals("Неправильный результат при сложение 6+4)", 10, calc2.getResult(),0);
        Calculator calc3 = new Calculator(8,4,"*");
        Assert.assertEquals("Неправильный результат при умножение 8*4", 32, calc3.getResult(),0);
    }
}