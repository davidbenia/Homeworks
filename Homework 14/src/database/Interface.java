package database;

import java.sql.ResultSet;

interface DB_Interface{
    ResultSet select();
    void insert(String deal, String location, String specific_location, String product, String price, String rooms, String description);
    void update(int id, String deal, String location, String specific_location, String product, String price, String rooms);
    void delete(int id);
}