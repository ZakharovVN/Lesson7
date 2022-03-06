/**Java1.HomeWorkSeven
 *
 * @author ZalharovVN
 * @version 06.03.2022
 */
public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    void setFullness(boolean status) {
        fullness = status;
    }

    void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "name=" + name + ", appetite=" + appetite + ", fullness=" + fullness;
    }
}
