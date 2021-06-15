package com.pruebas;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/disco")
public class DiscoJSON {
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_HTML})
	public Disco leerDisco() {
		Disco disc = new Disco();
		disc.setTitulo("On the border");
		disc.setGrupo("The Eagles");
		return disc;
	}

}
