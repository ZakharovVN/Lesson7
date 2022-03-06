/**Java1.HomeWorkSeven
 *
 * @author ZalharovVN
 * @version 06.03.2022
 */

public class HomeWork {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Pushok", 15),
                new Cat("Barsik", 10),
                new Cat("Murzik", 20)
        };
        Plate plate = new Plate(50, 30);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
        plate.add(40);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

