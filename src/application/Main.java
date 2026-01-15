package application;

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

	}

}
