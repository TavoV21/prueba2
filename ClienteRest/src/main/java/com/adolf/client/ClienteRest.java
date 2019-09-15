package com.adolf.client;

import javax.swing.JOptionPane;

import com.adolf.vo.UsuarioVo;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class ClienteRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String urlServicio= "http://localhost:8080/ClienteRest/servicio/PruebaAdolf/validarUsuario";
    System.out.println("Servicio:"+ urlServicio);
		
	UsuarioVo user=new UsuarioVo();		
	user.setUsuario(JOptionPane.showInputDialog("Ingrese un usuario"));
	user.setPass(JOptionPane.showInputDialog("Ingrese una contraseña"));
	user.setValidacion(false);
		
    ClientConfig clientConfig=new DefaultClientConfig();
    clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
    
    Client cliente=Client.create(clientConfig);
    
	WebResource webresource=cliente.resource(urlServicio);
	
	ClientResponse respuesta=webresource.type("application/json").post(ClientResponse.class,user);
	user=respuesta.getEntity(UsuarioVo.class);
	
    System.out.println("RESPONSE: [User:"+ user.getUsuario()+"]");
    System.out.println("RESPONSE: [Validation:"+ user.isValidacion()+"]");

		
	}

}
