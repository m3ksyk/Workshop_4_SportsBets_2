package pl.coderslab.web;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Service;

@Service
@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryDto {

    @JsonProperty("country_id")
    long apiCountryId;
    @JsonProperty("country_name")
    String name;

    public CountryDto() {
    }

    public CountryDto(long apiCountryId, String name) {
        this.apiCountryId = apiCountryId;
        this.name = name;
    }

    public long getApiCountryId() {
        return apiCountryId;
    }

    public void setApiCountryId(long apiCountryId) {
        this.apiCountryId = apiCountryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CountryDto: " +
                "apiCountryId= " + apiCountryId +
                ", name=' " + name + " ";
    }
}

