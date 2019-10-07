package local.leslie.countries;

public class Country
{
	//fields
	private String name;
	private long landSize;
	private long population;
	private int medianAge;

	//country
	public Country(String name, long landSize, long population, int medianAge)
	{
		this.name = name;
		this.landSize = landSize;
		this.population = population;
		this.medianAge = medianAge;
	}

	//getters and setters
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public long getLandSize()
	{
		return landSize;
	}

	public void setLandSize(long landSize)
	{
		this.landSize = landSize;
	}

	public long getPopulation()
	{
		return population;
	}

	public void setPopulation(long population)
	{
		this.population = population;
	}

	public int getMedianAge()
	{
		return medianAge;
	}

	public void setMedianAge(int medianAge)
	{
		this.medianAge = medianAge;
	}

	@Override
	public String toString()
	{
		return "Country{" + "name='" + name + '\'' + ", landSize=" + landSize + ", population=" + population + ", medianAge=" + medianAge + '}';
	}
}
