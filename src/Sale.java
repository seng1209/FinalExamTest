class Sale {
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;

    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public double getTotalExpense(){
        return  (getProductExpense() + getServiceExpense())
                - ((customer.getProductMemberDiscount() * getProductExpense())
                + (customer.getServiceMemberDiscount() * getServiceExpense()));
    }

    public void displayInfo(){
        System.out.println(customer.getCustomerName()+" "+customer.getCustomerType()+" "+getDate()+" "+
                getServiceExpense()+" "+getProductExpense()+" "+getTotalExpense());
    }

}