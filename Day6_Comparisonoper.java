class Comprassion{
    public static void main( String [] args){
       
        //Boolean, Comparison Operators

        String dbEMail = "maligimaheswarreddy@gmail.com";
        String dbPassword = "mahesh123@";

        String userEMail = "maligimaheswarreddy@gmail.com";
        String userPassword = "mahesh123@";

        System.out.println( dbEMail == userEMail);// true

        System.out.println( dbEMail == userEMail && dbPassword == userPassword);//

        // equal to == 
        
        userEMail = "maligimaheshwarreddy@gmail.com";
        System.out.println( dbEMail == userEMail);// false

        System.out.println( dbPassword == userPassword);// true

        userPassword = "mahesh123";
        System.out.println( dbPassword == userPassword);// false

        // not equalto !=

        int adminId = 10;
        int loginId = 5;

        System.out.println(adminId != loginId); // true    

        // > ,>= ,< ,<= 

        int billTotal = 200;
        int minAmount = 300;

        System.out.println( billTotal > minAmount ); // false

        billTotal = 300;
        System.out.println( billTotal >= minAmount ); // true

        billTotal = 200;
        System.out.println( billTotal < minAmount ); //true

        minAmount = 200;
        System.out.println( billTotal <= minAmount );// true

        

    }
}