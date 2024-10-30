package app;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.impl.DepartmentDaoJDBC;

import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        /*
        System.out.println("\n=== TEST 1: department insert =====");


        Department dep = new Department();
        dep.setId(1);
        dep.setName("Luciano");
        departmentDao.update(dep);
        */
        System.out.println("\n=== TEST 2: findAll =====");
        List<Department> list = departmentDao.findAll();
        for (Department dep : list) {
            System.out.println(dep);
        }




    }

}
