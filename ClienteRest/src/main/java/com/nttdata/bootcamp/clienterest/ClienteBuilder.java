package com.nttdata.bootcamp.clienterest;

public class ClienteBuilder {
	
	
    private String nombre;
    private String apellidos;
    private String Status;
   
    public String getStatus() {
		return Status;
	}



	public void setStatus(String status) {
		Status = status;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}
	 public ClienteBuilder() {
	    }

	  public ClienteBuilder nombre(String nombre) {
	        this.nombre = nombre;
	       
	        return this;
	    }

	  public ClienteBuilder Status(String Status) {
			this.Status = Status;
		       
	        return this;
		}
	 
	  public ClienteBuilder apellidos(String apellidos) {
	        this.apellidos = apellidos;
	       
	        return this;
	    }
   

  
      
    

    public  Cliente build() {
    	 return new Cliente(this);
    }



	






	
	
  



	
	
}
