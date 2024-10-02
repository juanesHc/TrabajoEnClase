package co.edu.uco.ucobet.dto;
import co.edu.uco.crosscutting.helpers.TextHelper;
import co.edu.uco.crosscutting.helpers.UUIDHelpers;
import co.edu.uco.ucobet.entity.CountryEntity;

public class CountryDTO extends DomainDTO {

	private String name;
	
	public CountryDTO() {
		super(UUIDHelpers.getDefaultAsString());
		setName(TextHelper.EMPTY);
	}
	public  static final CountryDTO create() {
		return new CountryDTO();
	}
	public String getName() {
		return name;
	}
	public CountryDTO setName(final String name) {
		this.name=TextHelper.applyTrim(name);
		return this;
	}
	public CountryDTO setId(final String id) {
		super.setIdentifier(id);
		return this;}
		
	
	@Override
	public String getId() {
		return super.getId();
	}
	
	public static void main(String[] args)
	{
		CountryDTO country = new CountryDTO();
		country.setName(null);
		
		System.out.println(country.getId());
		System.out.println(country.getName());
				
	}	
}
