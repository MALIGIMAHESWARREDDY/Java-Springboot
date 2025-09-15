public class Strings {
    public static void main(String[] args){
       
       
 // charactor or length of the user Name
        String userName = "maligi maheswarreddy";
        System.out.println(userName);
        userName = "maligi";
        System.out.println(userName);
        System.out.println(userName.length());

//unwanted spacing remove
        userName = " maligi  maheswarreddy ";
        System.out.println(userName.trim());
        System.out.println(userName.length());

// first name and lastname adding
        var userFirstName = "maligi";
        var userSecondName = "reddy";
        System.out.println(userFirstName+" "+userSecondName);

// coupon code validation
        String orgCouponcode = "FIRST50";
        String userCouponcode = "first50";

        System.out.println(orgCouponcode.toLowerCase()) ;
        System.out.println(userCouponcode.toLowerCase()) ;

        orgCouponcode = orgCouponcode.toLowerCase();
        System.out.println(orgCouponcode .equals(userCouponcode));

 // Try different string methods on your name, email, state and country.

        String Name = "maligi maheswar reddy";
        Name = "Maligi";
        System.out.println(Name.length());

        Name = " maligi maheswar reddy ";
        System.out.println(Name.length());
        System.out.println(Name.trim());

        String firstName ="maligi";
        String lastName ="mahesh";
        System.out.println(firstName+ " " +lastName);
        String fullName = "maligi maheswar reddy";
        System.out.println(fullName);


// gmail

        String userEmail = "maligimaheswarreddy@gmail.com";
        userEmail=" maligimaheswarreddy@gmail.com ";
        System.out.println(userEmail);
        System.out.println(userEmail.length());
        System.out.println(userEmail.trim());

// state country

        String userState= "ap";
        System.out.println(userState);
        String userAdress1 = "reddyvaripalli";
        String userAdress2 = "vepurikota";
        String userAdress3 = "517351,india";

        System.out.println(userAdress1+ "," +userAdress2 +","+userAdress3);

    }
}
    
