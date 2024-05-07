public class InstitutionalCustomer extends Customer {
    private String institutionType;
    private String industrySector;

    public InstitutionalCustomer(String name, String address, String institutionType, String industrySector) {
        super(name, address);
        this.institutionType = institutionType;
        this.industrySector = industrySector;
    }
}
