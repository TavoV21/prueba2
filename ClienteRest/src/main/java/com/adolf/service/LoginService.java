package com.adolf.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.adolf.vo.UsuarioVo;


@Path("/PruebaAdolf")
public class LoginService {

	@POST
	@Path("/validarUsuario")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	
	public UsuarioVo validarUsuario(UsuarioVo usuarioVo) {
		if(usuarioVo.getUsuario().equals("admin") && usuarioVo.getPass().equals("1111")) {
			usuarioVo.setValidacion(true);
		}
		
		return usuarioVo;
		
	}
	
	
	

}
