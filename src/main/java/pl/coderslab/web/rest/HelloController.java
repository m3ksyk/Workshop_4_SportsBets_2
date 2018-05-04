package pl.coderslab.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.coderslab.model.GameResult;
import pl.coderslab.web.*;

@RestController
@RequestMapping("/api")
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    CountryDto countryDto;
    //my football api key
//    25832600f3ee383b4756c717fabcd0853d8ee85b6715671cfb2a881eb4d4969f

//    https://apifootball.com/api/?action=get_countries&APIkey=eee5028bd4f1a9645f0de3b18aa4c17c11a0eedd815aeaacf2cae4d5801e8969

    @GetMapping(path= "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping(path= "/get-countries")
    public String getCountriesAction() {
        String url = "https://apifootball.com/api/?action=get_countries&APIkey=" +
                "eee5028bd4f1a9645f0de3b18aa4c17c11a0eedd815aeaacf2cae4d5801e8969";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CountryDto[]> responseCountries = restTemplate.getForEntity(
                url, CountryDto[].class);
        CountryDto[] countries = responseCountries.getBody();
        for (CountryDto country: countries) {
            logger.info("countries {}", country);
        }
        return "got countries";
    }

    @RequestMapping(path= "/get-leagues")
    public String getLeaguesAction() {
        String url = "https://apifootball.com/api/?action=get_leagues&APIkey=" +
                "eee5028bd4f1a9645f0de3b18aa4c17c11a0eedd815aeaacf2cae4d5801e8969";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<LeagueDto[]> responseLeagues = restTemplate.getForEntity(
                url, LeagueDto[].class);
        LeagueDto[] leagues = responseLeagues.getBody();
        for (LeagueDto league: leagues) {
            logger.info("leagues {}", league);
        }
        return "got leagues";
    }

    @RequestMapping(path= "/get-country-leagues/{country_id}")
    public String getLeaguesInCountryAction(@PathVariable long country_id) {
        String url = "https://apifootball.com/api/?action=get_leagues&country_id=" + country_id +
                "&APIkey=eee5028bd4f1a9645f0de3b18aa4c17c11a0eedd815aeaacf2cae4d5801e8969";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<LeagueDto[]> responseLeagues = restTemplate.getForEntity(
                url, LeagueDto[].class);
        LeagueDto[] leagues = responseLeagues.getBody();
        for (LeagueDto league: leagues) {
            logger.info("leagues {}", league);
        }
        return "got leagues in country with id: " + country_id;
    }

    @RequestMapping(path= "/get-teams/{league_id}")
    public String getTeamsAction(@PathVariable long league_id){
        String url="https://apifootball.com/api/?action=get_standings&league_id=" + league_id +
                "&APIkey=eee5028bd4f1a9645f0de3b18aa4c17c11a0eedd815aeaacf2cae4d5801e8969";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<TeamDto[]> responseTeams = restTemplate.getForEntity(
                url, TeamDto[].class);
        TeamDto[] teams = responseTeams.getBody();
        for (TeamDto team: teams) {
            logger.info("teams {}", team);
        }
        return " Got teams in a league with id:" + league_id;
    }

    @RequestMapping(path= "/get-standings/{league_id}")
    public String getStandingsAction(@PathVariable long league_id){
        String url="https://apifootball.com/api/?action=get_standings&league_id=" + league_id +
                "&APIkey=eee5028bd4f1a9645f0de3b18aa4c17c11a0eedd815aeaacf2cae4d5801e8969";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<StandingsDto[]> responseStandings = restTemplate.getForEntity(
                url, StandingsDto[].class);
        StandingsDto[] standings = responseStandings.getBody();
        for (StandingsDto standing: standings) {
            logger.info("teams {}", standing);
        }
        return " Got team standings in a league with id:" + league_id;
    }

    @RequestMapping(path= "/get-standings/{from}/{to}/{league_id}")
    public String getGameResultsAction(@PathVariable String from, @PathVariable String to,@PathVariable long league_id){
        String url="https://apifootball.com/api/?action=get_events&from="+from+"&to="+to+"&league_id=" + league_id +
                "&APIkey=eee5028bd4f1a9645f0de3b18aa4c17c11a0eedd815aeaacf2cae4d5801e8969";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<GameResultDto[]> responseResults = restTemplate.getForEntity(
                url, GameResultDto[].class);
        GameResultDto[] results = responseResults.getBody();
        for (GameResultDto result: results) {
            logger.info("teams {}", result);
        }
        return " Got game results from league:" + league_id;
    }

//    sportach (piłka nożna, koszykówka, hokej, itd.), - sporty brac z fakera

//    użytkownikach. -userow brac z fakera

}
