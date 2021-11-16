package com.nttdata.bootcamp.clienterest;

public class Cliente {
	
		
		

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

	    public String getStatus() {
			return Status;
		}

		public void setStatus(String status) {
			this.Status = status;
		}

		private String nombre;
	    private String apellidos;
	    private String Status;
	  
	

	
	  
	    Cliente(ClienteBuilder builder) {
	      
	        this.nombre = builder.getNombre();
	        this.apellidos = builder.getApellidos();
	        this.Status = builder.getStatus();
	        
	       
	    }

		public Cliente() {
			
		}

	}



