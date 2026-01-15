package application;

import java.time.LocalDate;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Seller;


public class Main {

	public static void main(String[] args) {
		SellerDAO sellerDAO = DAOFactory.createSellerDao();
		
		Seller seller = sellerDAO.findByID(3);
		
		System.out.println(seller);
	}

}
