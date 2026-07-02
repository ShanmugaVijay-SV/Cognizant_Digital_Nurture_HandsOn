package com.cognizant.ormlearn;

import java.util.*;

import org.slf4j.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.exception.CountryNotFoundException;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);

        countryService = context.getBean(CountryService.class);

        testGetAllCountries();
        
        try {
            testFindCountry();
        } catch (CountryNotFoundException e) {
            LOGGER.error(e.getMessage());
        }
    }

    private static void testGetAllCountries() {


        List<Country> countries =
                countryService.getAllCountries();

        LOGGER.info("Countries = {}", countries);

    }

    private static void testFindCountry() throws CountryNotFoundException {
            try {
                System.out.print("Enter country code: ");
                String str = sc.nextLine().toUpperCase();

                Country country = countryService.findCountryByCode(str);

                LOGGER.info("Country = {}", country);

            } catch (CountryNotFoundException e) {
                LOGGER.error(e.getMessage());
            }

        }

    

}