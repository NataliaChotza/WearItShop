import java.util.ArrayList;
import java.util.List;

public class CreateObject {

    public static void createClient() throws Exception {
        Client client = new Client();
        client.setDateOfBirth("23-03-1990");
        client.setName("Paweł");
        client.setSurname("Kowalski");
        client.setEmail("pawel.kowalski8@gmail.com");
        client.setPesel("900323495");
        client.setTelephoneNumber("+48502340231");
        client.setOrderList(new ArrayList<>());

        List<Order> ol= new ArrayList<>();
        Client client1 = new Client();
        client1.setDateOfBirth("02-01-2000");
        client1.setName("Kamila");
        client1.setSurname("Kwiatkowska");
        client1.setEmail("kamilak@gmail.com");
        client1.setPesel("00010202020");
        client1.setTelephoneNumber("+4850309822");
        client1.setOrderList(ol);

    }
    public static void createProduct() throws Exception {

        Product product1= new Product();
        product1.setPrice(99.99);
        product1.setColor("Black");
        product1.setCountry("Italy");
        product1.setProductName("T-shirt");
        product1.setSize("L");

        Product product2= new Product();
        product2.setPrice(120);
        product2.setColor("Red");
        product2.setCountry("Italy");
        product2.setProductName("Dress");
        product2.setSize("M");

        Product produkt3= new Product();
        produkt3.setPrice(230);
        produkt3.setColor("Red");
        produkt3.setCountry("Italy");
        produkt3.setProductName("Dress");
        produkt3.setSize("XL");

    }
    public static void createCategory() throws Exception {
        List<Product> womenProd= new ArrayList<>();
        Category category= new Category();
        category.setCategoryName("Women");
        category.setProductList(womenProd);

        List<Product> menProd= new ArrayList<>();
        Category category1= new Category();
        category1.setCategoryName("Man");
        category1.setProductList(menProd);

        List<Product> kidsProd= new ArrayList<>();
        Category category2= new Category();
        category2.setCategoryName("Kids");
        category2.setProductList(kidsProd);

    }
    public static void createComplaint() throws Exception {
        Complaint complaint= new Complaint();
        complaint.setEmail("kamilak@gmail.com");
        complaint.setOrderNumber("#2311");
        complaint.setDecisionDate("09-03-2021");
        complaint.setShopWorkerID(2);
        complaint.setInfo("You will get 50% od price back");


    }
    public static void createOrder() throws Exception {

        Order order= new Order();
        order.setOrderDate("09-09-2020");
        order.setProduct(new Product());
        order.setClient(new Client());
    }
    public static void createOwner() throws Exception {
        List<ShopWorker>workers= new ArrayList();
        Owner owner= new Owner();
        owner.setWorkerList(workers);
        owner.addWorker(owner);
        owner.setName("Jacek");
        owner.setSurname("Pawlak");
        owner.setEmail("j.pawlak@gmail.com");

    }
    public static void createShopWorker() throws Exception {
        List<Complaint>com= new ArrayList<>();

        ShopWorker shopWorker= new ShopWorker();
        shopWorker.setAddress("Weteranow");
        shopWorker.setEmail("shopworker@gmail.com");
        shopWorker.setId(2);
        shopWorker.setName("Katarzyna");
        shopWorker.setSurname("Wisniewska");
        shopWorker.setPhoneNumber("870029273792");
        shopWorker.setComplaintList(com);
        shopWorker.addComplaint(new Complaint());

    }
    public static void createWorker() throws Exception {
        Worker worker= new Worker();
        worker.setHourRate(17.0);
        worker.setPesel("9992829019");
        worker.setTimeInCompany(1);
        worker.setEmail("viola.lala@gmail.com");
        worker.setName("Viola");
        worker.setSurname("Lala");

    }

}
