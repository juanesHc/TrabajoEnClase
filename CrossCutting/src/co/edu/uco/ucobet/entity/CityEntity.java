package co.edu.uco.ucobet.entity;

import java.util.UUID;

import co.edu.uco.crosscutting.helpers.ObjectHelper;
import co.edu.uco.crosscutting.helpers.TextHelper;
import co.edu.uco.crosscutting.helpers.UUIDHelpers;

public class CityEntity extends DomainEntity {
	
	private String name;
	private CountryEntity country;
	
	public CityEntity country;
	
	public CityEntity() {
		super(UUIDHelpers.getDefault());
		setName(TextHelper.EMPTY);
	}
	
	public String getName() {
		return name;
	}
	public void setName(final String name) {
		this.name=TextHelper.applyTrim(name);
	}
	@Override
	public void setId(final UUID id) {
		super.setId(id);
	}
	
	@Override
	public UUID getId() {
		super.getId();
	}
	
	public CountryEntity getCountryEntity() {
		return country;
	}
	
	public void setCountryEntity (final CountryEntity country) {
		this.country=ObjectHelper.getDefault(country, new CountryEntity());
	}
	
	public static void main(String[] args) {
		CityEntity country =new CityEntity();
		country.setName(null);
		
		System.out.println(country.getId());
		System.out.println(country.getName());
		
	}

}
