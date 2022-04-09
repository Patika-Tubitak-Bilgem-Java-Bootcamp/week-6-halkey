package com.example.arackiralamaportali.Data;

import com.example.arackiralamaportali.Models.Car;
import com.example.arackiralamaportali.Models.CarType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {
    List<Car> findByType_IdAndCompany_City_Id(int type, int cityId);
}
