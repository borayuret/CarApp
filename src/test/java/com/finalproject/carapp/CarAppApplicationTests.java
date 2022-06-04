package com.finalproject.carapp;

import com.finalproject.carapp.controller.CarController;
import com.finalproject.carapp.entity.Car;
import com.finalproject.carapp.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CarAppApplicationTests {


    @Autowired
    private CarController controller;



    @Test
    void contextLoads() {
        assertThat(controller).isNotNull();
    }







}
