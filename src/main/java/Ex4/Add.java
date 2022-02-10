package Ex4;

/**
 * Created by Danila Shestipalov
 *
 * @author G3B
 * Сложение
 *
 * */

public class Add extends Arguments{
    public static float getResult() {
        return Arguments.getArgument1() + Arguments.getArgument2();
    }


    public Add(float argument1, float argument2) {
        super(argument1, argument2);
    }

}
