/**Java1.HomeWorkSeven
 *
 * @author ZalharovVN
 * @version 06.03.2022
 */
public class Plate {
    private int maxVolume;
    private int food;

    Plate(int volume, int food) {
        this.maxVolume = volume;
        this.food = food;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void add(int food) {
        if (this.food + food <= maxVolume) {
            this.food += food;
        }
    }

    @Override
    public String toString() {
        return "plate: " + food;
    }
}
