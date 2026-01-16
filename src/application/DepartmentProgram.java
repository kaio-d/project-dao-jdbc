package application;

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
		
		System.out.println();
		System.out.println("Execute method insert: ");
		Department newDepartment = new Department(null, "Marketing");
		departmentDAO.insert(newDepartment);
		System.out.println("Inser a new Department! ID = " + newDepartment.getId());
		
		System.out.println();
		System.out.println("Execute a method update: ");
		Department department = departmentDAO.findByID(5);
		department.setName("RH");
		departmentDAO.update(department);
		System.out.println("Update Completed!");
		
		System.out.println();
		System.out.println("Execute a method delete: ");
		departmentDAO.deleteByID(5);
		System.out.println("Delete completed!");
	}

}
