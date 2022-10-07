package com.investmentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.investmentapp.model.Investment;
import com.investmentapp.model.Nominee;
import com.investmentapp.model.Purpose;
import com.investmentapp.model.Risk;
import com.investmentapp.model.planType;
import com.investmentapp.service.IInvestmentService;

@SpringBootApplication
public class SpringInvestrrmentappJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringInvestrrmentappJdbcApplication.class, args);
		
	}

	@Autowired
	IInvestmentService investmentService;
	
	@Override
	public void run(String... args) throws Exception {

		
	Investment investment=new Investment("Voya Mutual",30 , planType.mutual.type, 8000, Purpose.MARRIAGE.name(), Risk.LOW.name(), Nominee.DAUGHTER.name(), 30);
//			 investment=new Investment("Voya Mutual",20 , planType.fd.type, 10000, Purpose.RETIRMENT.name(), Risk.LOW.name(), Nominee.FATHER.name(), 20);
//		investmentService.addInvestment(investment);
		investmentService.getAll().forEach(System.out::println);
		System.out.println();
		
		System.out.println("By purpose");
		investmentService.getByPurpose("MARRIAGE").forEach(System.out::println);
		System.out.println();
//		
		System.out.println("By Type");
		investmentService.getByType("Fixed Deposite").forEach(System.out::println);
		System.out.println();
//		
		System.out.println("By ID");
		System.out.println(investmentService.getById(5));
	}
	
	

}
