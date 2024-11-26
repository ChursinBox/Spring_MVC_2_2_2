package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

	@GetMapping(value = "/cars")
	public String cars(@RequestParam(value = "count", defaultValue = "5") int carsNum, Model model) {
		List<Car> listCars = new ArrayList<>();
		listCars.add(new Car("Mazda", 3, "Japan"));
		listCars.add(new Car("VAZ", 4, "Russia"));
		listCars.add(new Car("Volkswagen", 5, "Germany"));
		listCars.add(new Car("Ford", 4, "USA"));
		listCars.add(new Car("Kia", 2, "Korea"));

		model.addAttribute("cars", CarService.carsCount(listCars, carsNum));
		return "car";

	}
	
}