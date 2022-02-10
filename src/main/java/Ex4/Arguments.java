package Ex4;

/**
 * Created by Danila Shestipalov
 *
 * @author G3B
 *
 * */

/**
 * Класс хранящий аргументы
 * */
public class Arguments {

    private static float argument1;
    private static float argument2;

    public static float getArgument1() {
        return argument1;
    }

    public void setArgument1(float argument1) {
        this.argument1 = argument1;
    }

    public static float getArgument2() {
        return argument2;
    }

    public void setArgument2(float argument2) {
        this.argument2 = argument2;
    }



    public Arguments(float argument1, float argument2) {
        this.argument1 = argument1;
        this.argument2 = argument2;
    }


}
