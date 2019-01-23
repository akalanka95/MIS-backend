package com.epic.MIS;

import com.epic.MIS.model.Bank;
import com.epic.MIS.model.Employee;
import com.epic.MIS.repository.BankRepository;
import com.epic.MIS.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MisApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private BankRepository bankRepository;


	public static void main(String[] args) {
		SpringApplication.run(MisApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        Employee e1 = new Employee();
        e1.setId(1);
        e1.setFirstName("Akalankaa");
        e1.setLastName("Gamage");
        e1.setEmail("akala@gmail.com");
        e1.setPassword("admin");
        e1.setRole("employee");
        employeeRepository.save(e1);

        Bank b1 = new Bank();
        b1.setBankName("HNB");
        b1.setAmount(100);
        bankRepository.save(b1);

        Bank b2 = new Bank();
        b2.setBankName("BOC");
        b2.setAmount(150);
        bankRepository.save(b2);

        Bank b3 = new Bank();
        b3.setBankName("DFCC");
        b3.setAmount(200);
        bankRepository.save(b3);
    }
}

