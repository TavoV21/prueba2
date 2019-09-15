package com.restful.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.restful.dao.EmpleadoDAO;
import com.restful.model.Empleado;

@Path("/empleado")
public class EmpleadoService {
 
    
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Empleado> getEmployees_JSON() {
        List<Empleado> listOfCountries = EmpleadoDAO.getAllEmployees();
        return listOfCountries;
    }
 
    @GET
    @Path("/{empNo}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Empleado getEmployee(@PathParam("empNo") String empNo) {
        return EmpleadoDAO.getEmployee(empNo);
    }
 
   
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Empleado addEmployee(Empleado emp) {
        return EmpleadoDAO.addEmployee(emp);
    }
 
   
    @PUT
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Empleado updateEmployee(Empleado emp) {
        return EmpleadoDAO.updateEmployee(emp);
    }
 
    @DELETE
    @Path("/{empNo}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public void deleteEmployee(@PathParam("empNo") String empNo) {
        EmpleadoDAO.deleteEmployee(empNo);
    }
 
}