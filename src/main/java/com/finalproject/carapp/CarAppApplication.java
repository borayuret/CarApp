package com.finalproject.carapp;

import com.finalproject.carapp.entity.Car;
import com.finalproject.carapp.entity.Owner;
import com.finalproject.carapp.entity.User;
import com.finalproject.carapp.repository.CarRepository;
import com.finalproject.carapp.repository.OwnerRepository;
import com.finalproject.carapp.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarAppApplication implements CommandLineRunner {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private UserRepository userRepository;

    private static final Logger logger =
            LoggerFactory.getLogger("CarAppApplication.class");

    public static void main(String[] args) {
        SpringApplication.run(CarAppApplication.class, args);
        logger.info("Merhaba Car App");
    }

    @Override
    public void run(String... args) throws Exception {

        // Add owner objects and save these to db
        Owner owner1 = new Owner("John" , "Johnson");
        Owner owner2 = new Owner("Mary" , "Robinson");
        ownerRepository.save(owner1);
        ownerRepository.save(owner2);
        // Add car object with link to owners and save these to db.
        Car car = new Car("Ford", "Mustang", "Red","ADF-1121", 2017, 59000, owner1);
        carRepository.save(car);
        car = new Car("Nissan", "Leaf", "White", "SSJ-3002", 2014, 29000, owner2);
        carRepository.save(car);
        car = new Car("Toyota", "Prius", "Silver", "KKO-0212", 2018, 39000, owner2);
        carRepository.save(car);

        // username: bora password: bora1234
        userRepository.save(new User("bora","$2a$12$eSDoSAmsfjHHQmiw3EsFfuOKAb6KGtjVM/PWgxhn0o8C/90Aj6rdO","USER"));
        // username: admin password: admin1234
        userRepository.save(new User("admin","$2a$12$dU0Lj0P9CxUtV6XOv3Alr.5ntIkwLpNe2xNM1wZkeBcbW1SjfoxEC","ADMIN"));

    }
}
