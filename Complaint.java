public class Complaint extends Data {
    private String email;
    private String orderNumber;
    private String orderDate;
    private String decisionDate;
    private String info;
    private int shopWorkerID;
    private ShopWorker shopWorker;

    public Complaint() throws Exception {
        super();
    }
    public int getShopWorkerID() {
        return shopWorker.getId();
    }

    public void setShopWorkerID(int shopWorkerID) {
        this.shopWorkerID = shopWorkerID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getDecisionDate() {
        return decisionDate;
    }

    public void setDecisionDate(String decisionDate) {
        this.decisionDate = decisionDate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = getShopWorkerID()+" : "+ info;
    }

    @Override
    public String toString(){
        return "Decision has been made for complain : "+ getOrderNumber()+".In "+getDecisionDate()+". \n"+ getInfo();
    }
}
