package database;

import java.sql.*;

public class DB implements DB_Interface{

    Connection connect;
    String connection = "jdbc:mysql://localhost:3306/realestate";

    public DB(){
        try {
            connect = DriverManager.getConnection(connection, "root", "root");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public ResultSet select() {
        String str_query = "SELECT * FROM listings";
        Statement stm = null;
        ResultSet resultSet = null;

        try {
            stm = connect.createStatement();
            resultSet = stm.executeQuery(str_query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return resultSet;
    }

    @Override
    public void insert(String deal, String location, String specific_location, String product, String price, String rooms, String description) {
        String str_query = "INSERT INTO listings(Deal, City, District, Residence, Rooms, Price, Text) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try{
            PreparedStatement prep = connect.prepareStatement(str_query);
            prep.setString(1, deal);
            prep.setString(2, location);
            prep.setString(3, specific_location);
            prep.setString(4, product);
            prep.setString(5, rooms);
            prep.setString(6, price);
            prep.setString(7, description);
            prep.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(int id, String deal, String location, String specific_location, String product, String price, String rooms) {
        String str_query = "UPDATE listings SET Deal=?, City=?, District=?, Residence=?, Rooms=?, Price=? WHERE id=?";

        try{
            PreparedStatement prep = connect.prepareStatement(str_query);
            prep.setString(1, deal);
            prep.setString(2, location);
            prep.setString(3, specific_location);
            prep.setString(4, product);
            prep.setString(5, rooms);
            prep.setString(6, price);
            prep.setInt(7, id);
            prep.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String str_query = "DELETE FROM listings WHERE id=?";

        try{
            PreparedStatement prep = connect.prepareStatement(str_query);
            prep.setInt(1, id);
            prep.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
