package com.restful.model;

public class Empleado {

	
	   private String empNo;
	    private String empNombre;
	    private String empOficio;
	 
	    public Empleado() {
	 
	    }
	 
	    public Empleado(String empNo, String empNombre, String empOficio) {
	        this.empNo = empNo;
	        this.empNombre = empNombre;
	        this.empOficio = empOficio;
	    }
	 
	    public String getEmpNo() {
	        return empNo;
	    }
	 
	    public void setEmpNo(String empNo) {
	        this.empNo = empNo;
	    }
	 
	    public String getEmpNombre() {
			return empNombre;
		}

		public void setEmpNombre(String empNombre) {
			this.empNombre = empNombre;
		}

		public String getEmpOficio() {
			return empOficio;
		}

		public void setEmpOficio(String empOficio) {
			this.empOficio = empOficio;
		}

	
	
	
	
	
}
