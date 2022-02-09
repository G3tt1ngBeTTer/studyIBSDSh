package EX3;
/**
 * Created by Danila Shestipalov
 *
 * @author G3B
 *
 */
/**Класс для конфет, с уникальным параметром наполнение*/
public class Candy extends someCandy {
    private String filling;

    public Candy (String name, int weight, double price, String filling){
        super(name, weight, price);
        this.filling=filling;
    }

    @Override
    public String toString() {
        return "Конфета - "+super.toString()+" с наполнителем - " + filling;
    }
}
