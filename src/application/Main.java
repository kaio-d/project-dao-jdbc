package application;

import java.time.LocalDate;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.dao.impl.SellerDAOJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		SellerDAO sellerDAO = DAOFactory.createSellerDao();
	}

}
