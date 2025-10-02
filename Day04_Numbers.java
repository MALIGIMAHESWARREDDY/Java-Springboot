
class NumbersVaribles{
    public static void main(String[] args){

    int productprice = 530;
    int quantity = 4;
    System.out.println(productprice*quantity);

    float bisuketMrp = 14.00f;
    System.out.println(bisuketMrp*quantity);

    System.out.println(productprice+bisuketMrp*quantity);

    productprice = 999;
    bisuketMrp = 14.00f;
    quantity = 3;

    System.out.println(productprice-bisuketMrp*quantity);

    System.out.println(productprice-bisuketMrp);

    int Totalprice = productprice * quantity;
    System.out.println("Totalprice" + Totalprice);


// addition

    int chickenbriyaniPrice = 500;
    int vegbriyaniPrice =100;
    int toatalFoodprice = (chickenbriyaniPrice + vegbriyaniPrice);
    System.out.println("toatalFoodprice = "+toatalFoodprice);

// subtraction 
    int overallfoodCost = 6000; 
    int rajufoodPrice = 600;
    int reamingfoodCost = (overallfoodCost-rajufoodPrice);
    System.out.println("remaingfoodcost = "+ (reamingfoodCost));

// multiplication
    int eachBriyaniprice = 680;
    int eachCooldrinkprice= 20;
    quantity = 8;
    int totalCost = (eachBriyaniprice + eachCooldrinkprice);
    System.out.println("totalcost = "+ totalCost * quantity);

    // Division
    // find the each product price
    // toatal price 500;
    // quantity 12;

    int Totalprice2 = 500;
    int quantity2 = 12;
    int eachProductprice = (Totalprice2 / quantity2);
    System.out.println("eachproductprice"+ (eachProductprice));

    // remainder
    eachProductprice = (Totalprice2 % quantity2);
    System.out.println(eachProductprice);
    
    // string to float conversion

     String chickenPrice = "100.0";
     String masalaPrice = "100";
     System.out.println(Float.parseFloat(chickenPrice) * Integer.parseInt(masalaPrice));

     Float TotalPrice =Float.parseFloat(chickenPrice) * Integer.parseInt(masalaPrice);
     System.out.println(TotalPrice);

     String outputMsg = "Totalpriceis"+ String.valueOf(TotalPrice);
     System.out.println(outputMsg);


    //  
     

    }
}