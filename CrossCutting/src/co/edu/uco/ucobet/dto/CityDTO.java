package co.edu.uco.ucobet.dto;

import co.edu.uco.crosscutting.helpers.ObjectHelper;
import co.edu.uco.crosscutting.helpers.TextHelper;
import co.edu.uco.crosscutting.helpers.UUIDHelpers;

public class CityDTO {

	private String name;
	private StateDTO state;
	
	public CityDTO() {
		super(UUIDHelpers.getDefaultAsString());
		setName(TextHelper.EMPTY);
		setState(StateDTO.create());
	}
	
	public static final CityDTO create(){
		return new CityDTO();
	}
	public String getName() {
		return name;
	}
	public CityDTO setName(final String name) {
		this.name=TextHelper.applyTrim(name);
		return this;
	}
	public CityDTO setId(final String id) {
		super.setIdentifier(id);
		return this;
	}
	@Override
	public String getId() {
		return super.getId();
	}
	
	public StateDTO getState() {
		return state;
	}
	
	public CityDTO setState(final StateDTO state) {
		this.state=ObjectHelper.getDefault(state, StateDTO.create());
		return this;
	}
	
	
	
}
