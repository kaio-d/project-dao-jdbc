package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DAOFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class DepartmentProgram {

	public static void main(String[] args) {
		DepartmentDAO departmentDAO = DAOFactory.createDepartmentDao();
		
		System.out.println("Execute method findByID: ");
		Department dep = departmentDAO.findByID(1);
		System.out.println(dep);
		
		System.out.println();
		System.out.println("Execute method findAll: ");
		List<Department> departments = departmentDAO.findAll();
		for(Department d : departments) {
			System.out.println(d);
		}
	}

}
