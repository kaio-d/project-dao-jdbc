package application;

import java.time.LocalDate;

import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		Department d1 = new Department(1, "ADM");

		LocalDate birthDate = LocalDate.parse("2001-07-07");
		Seller s1 = new Seller(21, "Kaio", "kaio@teste.com", birthDate, 3000.0, d1);
		System.out.println(s1);
	}

}
