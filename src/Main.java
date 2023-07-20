import Car.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car strada = new Strada("red");
        Car hb20 = new HB20("black");
        Car onix = new Onix("white");
        Car polo = new Polo("silver");
        Car modelS = new ModelS("black");

        List<Car> carList = createCarList(strada, hb20, onix, polo, modelS);
        printList(carList);
    }

    public static <T extends Car> List<T> createCarList(T ...cars) {
        List<T> list = new ArrayList<>();
        for (T car : cars) {
            list.add(car);
        }
        return list;
    }

    public static <T> void printList(List<T> list) {
        for(T o : list) {
            System.out.println(o.toString());
        }
    }
}
