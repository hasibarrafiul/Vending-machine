public class VendingItem {
    private String name;
    private double price;
    public VendingItem(String name, double price){
        this.name=name;
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }
    public String getString(){
        return this.name;
    }
    public String toString(){
        return this.name+":"+this.price;
    }

}
