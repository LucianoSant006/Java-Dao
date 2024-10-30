package model.dao;

import db.Db;
import model.impl.DepartmentDaoJDBC;
import model.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(Db.getConnection());
    }
    public static DepartmentDao createDepartmentDao(){return new DepartmentDaoJDBC(Db.getConnection());}

}
