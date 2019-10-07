package local.leslie.countries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountriesApplication
{
	//static field of COUNTRYLIST CLASS to be able to access countries in response
	static CountryList ourCountryList;

	public static void main(String[] args)
	{
		//initialize the field
		ourCountryList = new CountryList();

		SpringApplication.run(CountriesApplication.class, args);
	}

}
