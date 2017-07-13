package com.hss01248.ps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PsApplication  {

//	@Autowired
//	private PersonMapper personMapper;


	public static void main(String[] args) {
		SpringApplication.run(PsApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		System.out.println(this.personMapper.getById(2));
	}*/

}
