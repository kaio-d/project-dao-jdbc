package application;

import model.dao.DAOFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class DepartmentProgram {

	public static void main(String[] args) {
		DepartmentDAO departmentDAO = DAOFactory.createDepartmentDao();
		
		System.out.println("Execute method findByID: ");
		Department dep = departmentDAO.findByID(1);
		System.out.println(dep);
	}

}
