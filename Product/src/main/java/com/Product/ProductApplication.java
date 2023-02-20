package com.Product;

import com.Product.Models.StudentInfo;
import com.Product.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
			System.out.println("Service start");

		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setName("s1");
		studentInfo.setAbout("superb");
		}
}
