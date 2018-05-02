package pl.coderslab.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.coderslab.web.CountryDto;

@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    //football api key
//    25832600f3ee383b4756c717fabcd0853d8ee85b6715671cfb2a881eb4d4969f

    //test hello - WORKS
    @GetMapping(path= "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }
//cos jest zjebane w metodzie
    @RequestMapping(path= "/get-countries")
//    @ResponseBody
    public String getCountriesAction() {
        String url = "https://apifootball.com/api/?action=get_countries&" +
                "APIkey=25832600f3ee383b4756c717fabcd0853d8ee85b6715671cfb2a881eb4d4969f";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CountryDto[]> responseCountries = restTemplate.getForEntity(
                url, CountryDto[].class);
        CountryDto[] countries = responseCountries.getBody();
        for (CountryDto country: countries) {
            logger.info("countries {}", country);
        }
        return "some result";
    }
    //dont work either
    @RequestMapping(path= "/get-fake-countries")
//    @ResponseBody
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
