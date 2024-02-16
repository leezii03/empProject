package home.Controller;

import Component.AlertMessager;
import Datebase.DBConnector;
import java.sql.*;
import home.Model.EmployeeModel;
import java.util.*;

public class EmployeeController extends DBConnector{
    PreparedStatement ps ;
    ResultSet rs ;
    
    public Collection<EmployeeModel> getData(){
        List<EmployeeModel> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM `table_employee`";      
            ps = connector().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                EmployeeModel emp = new EmployeeModel(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("gender"),
                        rs.getInt("age"),
                        rs.getString("position"),
                        rs.getDouble("salary"),
                        rs.getString("contact"),
                        rs.getString("image"),
                        rs.getString("date")
                );
                list.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list ;
    }
    
    public void addEmpToDB(EmployeeModel emp){
        try {
            String sql = "INSERT INTO `table_employee`(`name`, `gender`, `age`, `position`, `salary`, `contact`, `image`, `date`) VALUES (?,?,?,?,?,?,?,?)";
            ps = connector().prepareStatement(sql);
            ps.setString(1, emp.getName());
            ps.setString(2, emp.getGender());
            ps.setInt(3, emp.getAge());
            ps.setString(4, emp.getPosition());
            ps.setDouble(5, emp.getSalary());
            ps.setString(6, emp.getContact());
            ps.setString(7, emp.getImage());
            ps.setString(8, emp.getDate());
            
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Add Employee To Database Successfully");
            } else {
                AlertMessager.warning("Employee can't be Add");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateEmpToDB(EmployeeModel emp){
        try {
            String sql = "UPDATE `table_employee` SET `name`=?,`gender`=?,`age`=?,`position`=?,`salary`=?,`contact`=?,`image`=?,`date`=? WHERE id = ?";
            ps = connector().prepareStatement(sql);
            ps.setString(1, emp.getName());
            ps.setString(2, emp.getGender());
            ps.setInt(3, emp.getAge());
            ps.setString(4, emp.getPosition());
            ps.setDouble(5, emp.getSalary());
            ps.setString(6, emp.getContact());
            ps.setString(7, emp.getImage());
            ps.setString(8, emp.getDate());
            
            ps.setInt(9, emp.getId());
            
            int i = ps.executeUpdate();
            if(i > 0){
                AlertMessager.success("Update Successfully");
            }else{
                AlertMessager.error("Update Error");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    public void deleteEmp(int id){
        try {
            String sql = "DELETE FROM `table_employee` WHERE `id` = ?";
            ps = connector().prepareStatement(sql);
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            if(i > 0){
                AlertMessager.success("Delete Successfully");
            }else{
                AlertMessager.error("Delete Fail");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public int getTotalEmp(){
        int count = 0 ;
        try{
            String sql = "SELECT `id` FROM `table_employee`";
            ps = connector().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                count++ ;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return count;
    }
    
    public int getTotalMale(){
        int count = 0 ;
        try{
            String sql = "SELECT `id` FROM `table_employee` WHERE `gender` = \"Male\"";
            ps = connector().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                count++ ;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return count;
    }
    
    public int getTotalFemale(){
        int count = 0 ;
        try{
            String sql = "SELECT `id` FROM `table_employee` WHERE `gender` = \"Female\"";
            ps = connector().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                count++ ;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return count;
    }
    
    public double getTotalSalary(){
        int count = 0 ;
        try{
            String sql = "SELECT `salary` FROM `table_employee`";
            ps = connector().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                count += rs.getDouble(1);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return count;
    }
}
