class AndOrNot{
    public static void main (String []args){

// conditional statements
        int adminId = 11;
        int editorId = 15;
        int loggedInUserId = 11;

        if(adminId == loggedInUserId){
            System.out.println("welcome Admin");
        }

        if(loggedInUserId == editorId){
            System.out.println("welcome Editor");
        }

        //AND

        if(adminId == loggedInUserId || editorId == loggedInUserId){
            System.out.println("You can edit the file");
        }else{
            System.out.println("you dont have acess");
        }

        // OR
        if(adminId == loggedInUserId && editorId == loggedInUserId){
            System.out.println("You can edit the file");
        }else{
            System.out.println("you dont have acess");
        }

        // coupon discount task

        int minOrderValue = 500;
        int orderValue = 300;

        if(orderValue >= minOrderValue){
            System.out.println("20% flash20 ");
        }else{
            int difAmount = minOrderValue - orderValue;

            System.out.println("Add" +  difAmount  + "more to get 20% discount");
        }

        //nested if else

        if(loggedInUserId == adminId){
            System.out.print("welocme admin");
        }else if(loggedInUserId == editorId){
            System.out.println("welcome Editor");
        }else{
            System.out.print("you dont have acess");

        }


    }
}