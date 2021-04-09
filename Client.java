import java.util.List;

public class Client extends Data  {
    private String name;
    private String surname;
    private String telephoneNumber;
    private String email;
    private String dateOfBirth;
    private String pesel;
    private List<Order> orderList;

    public Client() throws Exception {
        super();
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Order> getOrderList() {
        return orderList;
    }
    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void show()throws Exception{
        Iterable<Client> iterable= Data.getExtent(Client.class);
        for(Client client : iterable){
            System.out.println("Client: "+client.getName()+" "+client.getSurname()+" "+ client.getPesel()+" "+client.getEmail());
        }
    }
}