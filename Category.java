import java.util.List;

public class Category extends Data {
    private String categoryName;
    private List<Product> productList;

    public Category()throws Exception{
        super();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    public void addProduct(Product product){
        productList.add(product);
    }
    public void removeProduct(Product product){
        productList.remove(product);
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public static void show()throws Exception{
        Iterable<Category> iterable= Data.getExtent(Category.class);
        for(Category category : iterable){
            System.out.println("Category: "+category.getCategoryName()+" "+category.getProductList().iterator());
        }
    }

}
