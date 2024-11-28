package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private static final List<Car> listCars = new ArrayList<>();

    static {
        listCars.add(new Car("Mazda", 3, "Japan"));
        listCars.add(new Car("VAZ", 4, "Russia"));
        listCars.add(new Car("Volkswagen", 5, "Germany"));
        listCars.add(new Car("Ford", 4, "USA"));
        listCars.add(new Car("Kia", 2, "Korea"));
    }

    @Override
    public List<Car> carsCount(int number) {
        if (number == 0 || number > 5) return listCars;
        return listCars.stream().limit(number).collect(Collectors.toList());
    }
}
