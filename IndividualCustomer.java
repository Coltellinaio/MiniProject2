public class IndividualCustomer extends Customer {
    private String gender;
    private String identificationNumber;

    public IndividualCustomer(String name, String address, String gender, String id) {
        super(name, address);
        this.gender = gender;
        this.identificationNumber = id;
        
    }
}

