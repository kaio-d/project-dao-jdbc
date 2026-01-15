package application;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;


public class Main {

	public static void main(String[] args) {
		SellerDAO sellerDAO = DAOFactory.createSellerDao();
		
		System.out.println("Execute method findById: ");
		Seller seller = sellerDAO.findByID(3);
		System.out.println(seller);
		
		System.out.println();
		System.out.println("Execute method findByDepartment: ");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDAO.findByDepartment(dep);
		for(Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Execute method findAll: ");
		List<Seller> sellers = sellerDAO.findAll();
		for(Seller s : sellers) {
			System.out.println(s);
		}
		
		System.out.println();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Execute method insert: ");
		String stringBirthDate = "2001-07-07";
		try {
		    java.util.Date birthDate = sdf.parse(stringBirthDate);
		    
		    Seller newSeller = new Seller(null, "Luis", "luis@gmail.com", birthDate,
					4000.0, dep);
			sellerDAO.insert(newSeller);
			System.out.println("Insert a new seller! ID = " + newSeller.getId());
		} catch (ParseException e) {
		    e.printStackTrace();
		}

	}

}
