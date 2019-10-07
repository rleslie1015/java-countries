package local.leslie.countries;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.GroupSequence;
import java.util.ArrayList;

@RestController
@RequestMapping("/names")
public class CountryController
{
	//localhost:2019/names/all
	//this is a GET
	@GetMapping(value = "/all",
			   produces = {"application/json"})
	public ResponseEntity<?> getAllCountries()
	{
		//return what needs to be returned and also a response
		CountriesApplication.ourCountryList.countryList.sort((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
		return new ResponseEntity<>(CountriesApplication.ourCountryList.countryList, HttpStatus.OK);
	}

	//localhost:2019/names/start/l
	@GetMapping(value = "/start/{letter}",
				produces = {"application/json"})
	public ResponseEntity<?> getCountriesStartWith(@PathVariable char letter)
	{
		//make a temp array to hold said countries
		ArrayList<Country> rtnCountries = CountriesApplication.ourCountryList.getCountryList(c -> c.getName().toUpperCase().charAt(0) == Character.toUpperCase(letter));
		rtnCountries.sort((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
		return new ResponseEntity<>(rtnCountries, HttpStatus.OK);
	}

	///localhost/names/size/6  --return the countries alphabetically that have a name equal to or longer than the given length
	@GetMapping(value = "/size/{number}",
				produces = {"application/json"})
	public ResponseEntity<?> getCountryByNameSize(@PathVariable int number)
	{
		ArrayList<Country> rtnCountries = CountriesApplication.ourCountryList.getCountryList(c -> c.getName().length() == number);
		rtnCountries.sort((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
		return new ResponseEntity<>(rtnCountries, HttpStatus.OK);
	}
}
