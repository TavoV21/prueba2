package com.restful.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.restful.model.Empleado;

public class EmpleadoDAO {

	
		 
	    private static final Map<String, Empleado> empMap = new HashMap<String, Empleado>();
	 
	    static {
	        initEmps();
	    }
	 
	    private static void initEmps() {
	    	Empleado emp1 = new Empleado("E01", "Smith", "Clerk");
	    	Empleado emp2 = new Empleado("E02", "Allen", "Salesman");
	    	Empleado emp3 = new Empleado("E03", "Jones", "Manager");
	 
	        empMap.put(emp1.getEmpNo(), emp1);
	        empMap.put(emp2.getEmpNo(), emp2);
	        empMap.put(emp3.getEmpNo(), emp3);
	    }
	 
	    public static Empleado getEmployee(String empNo) {
	        return empMap.get(empNo);
	    }
	 
	    public static Empleado addEmployee(Empleado emp) {
	        empMap.put(emp.getEmpNo(), emp);
	        return emp;
	    }
	 
	    public static Empleado updateEmployee(Empleado emp) {
	        empMap.put(emp.getEmpNo(), emp);
	        return emp;
	    }
	 
	    public static void deleteEmployee(String empNo) {
	        empMap.remove(empNo);
	    }
	 
	    public static List<Empleado> getAllEmployees() {
	        Collection<Empleado> c = empMap.values();
	        List<Empleado> list = new ArrayList<Empleado>();
	        list.addAll(c);
	        return list;
	    }
	     
	    List<Empleado> list;
	 

	
	
}
