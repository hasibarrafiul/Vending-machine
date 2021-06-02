public class VendingMachine {
    private static double totalSales;
    private int totalItems;
    private VendingItem[] shelf=new VendingItem[10];
    public VendingMachine(){
        this.totalSales=0;
        this.totalItems=10;
        restock();
    }
    public void restock(){
        shelf[0] = new VendingItem("Lays", 1.50);
        shelf[1] = new VendingItem("Doritos", 1.50);
        shelf[2] = new VendingItem("Coke", 2.50);
        shelf[3] = new VendingItem("Rubik's Cube", 30);
        shelf[4] = new VendingItem("Pie", 3.14);
        shelf[5] = new VendingItem("Clicker", 55.55);
        shelf[6] = new VendingItem("Cheetos", 1.25);
        shelf[7] = new VendingItem("Cold Pizza", 0.99);
        shelf[8] = new VendingItem("Graphing Calculator", 120);
        shelf[9] = new VendingItem("Ramen", 3.15);
    }
    public VendingItem vend(int code){
        if(code<shelf.length) {
            for (int i = 0; i < shelf.length; i++) {
                if (i == code) {
                    for (int j = 0; j < shelf.length-1; j++) {
                   //     shelf[code + j] = shelf[code + j + 1];

                    }

                    totalItems--;
                    double k;
                    k= shelf[code].getPrice();
                    totalSales=totalSales+k;
                }
            }
        }
              else{
                  System.out.println("null");

              }

               return shelf[code];
    }
    public static double getTotalSales(){
        return totalSales;
    }
    public int getTotalItems() {
        return this.totalItems;
    }
    public double getTotalValue(){
        int totalValue=0;
        double [] valueArray= new double[shelf.length];
        for(int i=0;i<shelf.length;i++){
            valueArray[i]=shelf[i].getPrice();
            totalValue += valueArray[i];
        }
        return totalValue;
    }
    public String toString(){
        String s="";
        for(int i=0;i<shelf.length;i++){
            s+= shelf[i].getString() +",";
        }
        return s;
    }
}
