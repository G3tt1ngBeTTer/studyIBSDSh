package EX3;

/**
 * Created by Danila Shestipalov
 *
 * @author G3B
 *
 */

public abstract class someCandy {
    /**Общие параметры для всех сладостей и методы*/
    private String name;
    private int weight;
    private double price;

    public someCandy(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString(){
        return name + ", вес = " + weight + " грамм, цена = "+price+" рублей, ";
    }
}
