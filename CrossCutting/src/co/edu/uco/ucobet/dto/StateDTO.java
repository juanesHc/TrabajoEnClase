package co.edu.uco.ucobet.dto;
import co.edu.uco.crosscutting.helpers.ObjectHelper;
import co.edu.uco.crosscutting.helpers.TextHelper;
public class StateDTO{
	
	private String name;
	private CountryDTO country;
	
	public StateDTO() {
		super(UUIDHelpers.getDefaultAssString());
		setName(TextHelper.EMPTY);
		setCountry(CountryDTO.create());
	}
	public static final StateDTO create() {
		return new StateDTO();
	}
	public  String getName() {
		return name;
	}
	public StateDTO setName(final String name) {
		this.name=TextHelper.applyTrim(name);
		return this;
	}
	 public StateDTO setId(final String id) {
		 super.setIdentifier(id);
		 return this;
	 }
	 @Override
	 public String getId() {
		 return super.getId();
	 }
	 
	 public CountryDTO getCountry() {
		 this.country=ObjectHelper.getDefault(country, CountryDTO.create());
		 return this;
	 }
	 
	 public static void main(String[] args) {
		 System.out.println(StateDTO.create().getCountry());
	 }
	 
}
