package com.nttdata.bootcamp.clienterest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClienteRestApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ClienteRestApplication.class, args);	
		
		}
	
	@Override
	
	public void run (String ...args) throws Exception{
		
		Service service = new Service();
		
		String open = "open";
		String close = "close";
		String  halFopen= "half-open";
		
		Cliente cliente = new ClienteBuilder()
				.Status(open)
				.nombre("Jose")
				.apellidos("Portero").build();
			
		Service Service = new Service();
				
		for(int i=0; i <= 5 && cliente.getStatus().equals(open); i++) {
			cliente.setStatus(halFopen);
			Service.setTohalFopen();
			Thread.sleep(3000);
			if(i >= 3) {
				cliente.setStatus(close);
				Service.setToClose();
				Thread.sleep(3000);
			}else {
				cliente.setStatus(open);
				Service.setToClose();
				Thread.sleep(3000);
			}
			
		}
				
		
		
		    
	}

}
