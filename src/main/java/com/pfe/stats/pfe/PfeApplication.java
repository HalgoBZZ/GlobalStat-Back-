package com.pfe.stats.pfe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pfe.stats.pfe.entities.Account;
import com.pfe.stats.pfe.entities.Module;
import com.pfe.stats.pfe.entities.Response;
import com.pfe.stats.pfe.services.AccountService;
import com.pfe.stats.pfe.services.ModuleService;
import com.pfe.stats.pfe.services.ResponseService;

@SpringBootApplication
public class PfeApplication implements CommandLineRunner{
	
	@Autowired
	AccountService service;
	
	@Autowired
	ResponseService responseService;
	
	@Autowired
	ModuleService moduleService;

	public static void main(String[] args) {
		SpringApplication.run(PfeApplication.class, args);
	}
	
	
	@Override
	public void run(String ...args)throws Exception{
		Account account=new Account("admin","admin");
		if(service.findOne(account.getLogin())==null) {
			service.add(account);
			System.out.println("Création du Compte Admin");
			}else {
				System.out.println("Compte Admin existe déja");
			}
		
		Response r1=new Response("Excellent");
		if(responseService.findOne(r1.getValueResponse())==null)
			responseService.add(r1);
		
		Response r2=new Response("Trés bon");
		if(responseService.findOne(r2.getValueResponse())==null) 
			responseService.add(r2);
		
		Response r3=new Response("Moyen");
		if(responseService.findOne(r3.getValueResponse())==null)
			responseService.add(r3);
		
		Response r4=new Response("Mauvais");
		if(responseService.findOne(r4.getValueResponse())==null)
			responseService.add(r4);
		
		Response r5=new Response("Trés mauvais");
		if(responseService.findOne(r5.getValueResponse())==null)
			responseService.add(r5);		
		
	
	 Module m1=new Module("Accueil",0);
	 if(moduleService.findOne(m1.getValueModule())==null)
		 moduleService.add(m1); 
	 
	 Module m2=new Module("Débit",0);
	 if(moduleService.findOne(m2.getValueModule())==null)
		 moduleService.add(m2); 
	 
	 Module m3=new Module("Nouveautés",0);
	 if(moduleService.findOne(m3.getValueModule())==null)
		 moduleService.add(m3); 
	}
	
}
