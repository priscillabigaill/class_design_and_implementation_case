public class Main {

    static SalesPerson[] salesPeople;
    public static SalesPerson Highest(SalesPerson[] salesPeople){
        SalesPerson highestSale = null;
        for(int i = 0; i < salesPeople.length; i++){
            if(salesPeople[i] != null){
                if(highestSale == null || salesPeople[i].calcTotalSales() > highestSale.calcTotalSales()){
                    highestSale = salesPeople[i];
                }
            }
        }
        return highestSale;
    }

    public static void addSales(Sales s, String id) {
        //add a new Sales object s, to the salesPerson with a specified ID
        for (SalesPerson salesPerson : salesPeople) {
            if (salesPerson != null && salesPerson.getId().equals(id)) {
                salesPerson.setSalesHistory(s);
                return;
            }
        }
    }
    public static void main(String[] args){

        SalesPerson[]salesPeople=new SalesPerson[6];

        salesPeople[0]=new SalesPerson("100");

        salesPeople[1]=new SalesPerson("101");

        salesPeople[2]=new SalesPerson("102");

        salesPeople[0].setSalesHistory(new Sales("A100",300.00,10));

        salesPeople[0].setSalesHistory(new Sales("A200",1000.00,2));

        salesPeople[1].setSalesHistory(new Sales("A300",2550.40,10));

        System.out.println(salesPeople[2].getId());

        System.out.println(salesPeople[0].getCount());

        System.out.println(salesPeople[1].getSalesHistory()[0].getValue());

        System.out.println(salesPeople[0].calcTotalSales());

    }
}