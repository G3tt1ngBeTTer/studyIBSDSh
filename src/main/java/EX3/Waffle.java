package EX3;

/**
 * Created by Danila Shestipalov
 *
 * @author G3B
 *
 */
/**Класс для вафель, с уникальным параметром Глазурь*/
public class Waffle extends someCandy {
    private String glaze;
    public Waffle(String name, int weight, double price, String glaze){
        super(name, weight, price);
        this.glaze=glaze;
    }

    @Override
    public String toString() {
        return "Вафля - " + super.toString() + " в глазуре - "+glaze;
    }
}
