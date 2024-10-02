package co.edu.uco.ucobet.entity;

import java.util.UUID;

import co.edu.uco.crosscutting.helpers.TextHelper;
import co.edu.uco.crosscutting.helpers.UUIDHelpers;

public class CountryEntity extends DomainEntity{
	
	private String name;
	
	public CountryEntity() {
		super(UUIDHelpers.getDefault());
		setName(TextHelper.EMPTY);
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = TextHelper.applyTrim (name);
	}
	
	@Override
	public void setId(final String id) {
		super.setId(id);
	}
	
	@Override
	public UUID getId() {
		return super.getId();
	}
	
	public static void main(String[] args)
	{
		CountryEntity country = new CountryEntity();
		country.setName(null);
		
		System.out.println(country.getId());
		System.out.println(country.getName());

}
