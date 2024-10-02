package co.edu.uco.ucobet.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.helpers.TextHelper;

public class StateDomain extends Domain {

		private String name;
		private CountryDomain country;
		
		private StateDomain(final UUID id,final String name) {
			super(id);
			setName(name);
		}
		
		public static final StateDomain create(final UUID id,final String name) {
			return new StateDomain(id,name);
		}
		
		public String getName() {
			return name;
		}
		
		private void setName(final String name) {
			this.name=TextHelper.applyTrim(name);
		}
		
		public UUID getId() {
			return super.getId();
		}
	
	
	
	
	
}
