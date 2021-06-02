public class VendingWorld {
    public static void main(String[] args) {
        VendingMachine cseVendingMachine = new VendingMachine();
        VendingMachine eeeVendingMachine = new VendingMachine();
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();
        VendingItem boughtItem = cseVendingMachine.vend(0);
        System.out.println(boughtItem);
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();
        boughtItem = cseVendingMachine.vend(3);
        System.out.println(boughtItem);
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();
        boughtItem = cseVendingMachine.vend(6);
        System.out.println(boughtItem);
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();
//case for vend method when code position does not contain any item
        boughtItem = cseVendingMachine.vend(9);
        System.out.println(boughtItem);
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();
//case for vend method when code position is invalid >=10
        boughtItem = cseVendingMachine.vend(20);
        System.out.println(boughtItem);
        System.out.println(cseVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(cseVendingMachine.getTotalItems());
        System.out.println(cseVendingMachine.getTotalValue());
        System.out.println();
//check if getTotalSales() works correctly
        boughtItem = eeeVendingMachine.vend(0);
        System.out.println(boughtItem);
        System.out.println(eeeVendingMachine);
        System.out.println(VendingMachine.getTotalSales());
        System.out.println(eeeVendingMachine.getTotalItems());
        System.out.println(eeeVendingMachine.getTotalValue());
        System.out.println();


    }


}