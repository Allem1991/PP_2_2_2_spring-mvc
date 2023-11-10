package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Override
    public List<Car> getCarListByAmount(int value) {
        if (value < 5) {
            return getCarList().subList(0, value);
        } else {
            return getCarList();
        }
    }

    private List<Car> getCarList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "M", 5));
        carList.add(new Car("BMW", "X", 6));
        carList.add(new Car("Audi", "RS", 7));
        carList.add(new Car("Porsche", "Turbo S", 911));
        carList.add(new Car("Ferrari", "F", 8));
        return carList;
    }

}
