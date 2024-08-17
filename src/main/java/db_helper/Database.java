package db_helper;

import model.Customer;

import java.util.ArrayList;

public class Database {
    private  static Database database;
    private ArrayList<Customer> list = new  ArrayList<Customer>();

    private Database(){}

    public  static Database getDatabase(){
        if(database == null){
            database = new Database();
        }
        return database;
    }

    public void addData(Customer customer){
        list.add(customer);
    }

    public void updateData(String id){

    }
    public  Customer getData(int index){
      return list.get(index);
    }

    public int searchDate(String id) {
        int index = -1;
        for (Customer customer : list) {
            if (customer.getId().equals(id)) {
                return list.indexOf(customer);
            }
        }
        return index;
    }
}
