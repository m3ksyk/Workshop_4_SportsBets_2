package pl.coderslab.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.coderslab.web.CountryDto;

@RestController
@RequestMapping("/api")
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    CountryDto countryDto;
    //my football api key
//    25832600f3ee383b4756c717fabcd0853d8ee85b6715671cfb2a881eb4d4969f

//    https://apifootball.com/api/?action=get_countries&APIkey=eee5028bd4f1a9645f0de3b18aa4c17c11a0eedd815aeaacf2cae4d5801e8969
    //test hello - WORKS
    @GetMapping(path= "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    //works
    @RequestMapping(path= "/get-countries")
    public String getCountriesAction() {
        String url = "https://apifootball.com/api/?action=get_countries&APIkey=eee5028bd4f1a9645f0de3b18aa4c17c11a0eedd815aeaacf2cae4d5801e8969";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CountryDto[]> responseCountries = restTemplate.getForEntity(
                url, CountryDto[].class);
        CountryDto[] countries = responseCountries.getBody();
        for (CountryDto country: countries) {
            logger.info("countries {}", country);
        }
        return "some result";
    }

    //dont work
    @RequestMapping(path= "/get-fake-countries")
    public String getFakeCountriesAction() {
        String url = "localhost:8080/api/fake-countries-list";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CountryDto[]> responseCountries = restTemplate.getForEntity(
                url, CountryDto[].class);
        CountryDto[] countries = responseCountries.getBody();
        for (CountryDto country: countries) {
            logger.info("countries {}", country);
        }
        return "some result";
    }
}
