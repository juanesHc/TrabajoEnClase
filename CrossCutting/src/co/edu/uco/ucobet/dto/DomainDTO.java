package co.edu.uco.ucobet.dto;

import java.util.UUID;

import co.edu.uco.crosscutting.helpers.TextHelper;
import co.edu.uco.crosscutting.helpers.UUIDHelpers;

public class DomainDTO {

	private String id;
	
	protected DomainDTO(final String id) {
		setIdentifier(id);
	}

	protected String getId() {
		return id;
	}

	protected void setIdentifier(final String id) {
		this.id = TextHelper.getDefault(id,UUIDHelpers.getDefaultAsString());
	}
	
}
