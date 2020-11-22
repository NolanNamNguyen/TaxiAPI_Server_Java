package NamVuEntertainment.TaxiProject.Domain.DTO;

import java.io.Serializable;

public class JwtResponse implements Serializable {
	private final String jwttoken;
	
	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}
	
	public String getTOken() {
		return this.jwttoken;
	}
}
