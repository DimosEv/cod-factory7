package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.*;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher(1,"Dimos", "Tzanou");
        User user =  new User(1, "Costas", "Mask", "cmask", "12345", true);
        Customer customer = new Customer(1,"Andrew", "Dimitrioiu", "02134678", "60123456987", "West Attica", "Attica", "Athens", "Pattision","76", "10434");
        Point point = new Point(0, 10);
        Order order = new Order(1,5.5, "Meat", "Ordered");


        System.out.println("Teacger full name: " + teacher.getFirstname() + "," + teacher.getLastname());
        System.out.println("User username: " + user.getUsername());
        System.out.println("Customer Vat: "  + customer.getVatRegistrationNo());
        System.out.println("Order Timestamp" + order.getFormattedtimestamp());

    }




}
