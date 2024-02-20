public class Main {
    public static void main(String[] args){
        Customer customer1 = new Customer("Meng Leang", "Premium");
        Customer customer2 = new Customer("Lim Hong", "Gold");
        Customer customer3 = new Customer("Vea Sna", "Silver");
        Customer customer4 = new Customer("Chan", "Normal");

        Sale sale1 = new Sale(customer1, "2024-02-20");
        sale1.setServiceExpense(15);
        sale1.setProductExpense(10);
        sale1.displayInfo();

        Sale sale2 = new Sale(customer2, "2024-02-20");
        sale2.setServiceExpense(15);
        sale2.setProductExpense(10);
        sale2.displayInfo();

        Sale sale3 = new Sale(customer3, "2024-02-20");
        sale3.setServiceExpense(15);
        sale3.setProductExpense(10);
        sale3.displayInfo();

        Sale sale4 = new Sale(customer4, "2024-02-20");
        sale4.setServiceExpense(15);
        sale4.setProductExpense(10);
        sale4.displayInfo();
    }
}
