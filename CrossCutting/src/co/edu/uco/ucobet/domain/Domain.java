package co.edu.uco.ucobet.domain;
import java.util.UUID;
import co.edu.uco.crosscutting.helpers.UUIDHelpers;

public class Domain {
	private UUID id;
	
	protected Domain (final UUID id) {
		setIdentifier(id);
	}
	
	protected UUID getId() {
		return id;
	}
	
	protected void setIdentifier(final UUID id) {
		this.id=UUIDHelpers.getDefault(id,UUIDHelpers.getDefault());
	}
}
