class SwitchCase{
    public static void main(String [] args){
        
       final int adminId = 10;
       final int editorId = 15;
        int loggedInUserId = 10;
        
        // switch case
        
        switch (loggedInUserId) {
            case adminId:
                System.out.println("welcome Admin");
                break;
            case editorId:
                System.out.println("welcome Editor");
                break;
            default:
                System.out.println("you dont have acess");
        }

        String contentCategory = "sports";

        switch (contentCategory) {
            case "music" :
                System.out.println("Display music realted content");
                break;
            case "sports" :
                System.out.println("Display sports related content");
                break;
            case "enterinment" :
                System.out.println("Display Enterinment realted content");
                break;
            default:
                System.out.println("Display mixed content");
        }

       // switch case another way of writing

        switch (contentCategory) {
            case "music" ->System.out.println("Display music realted content");
            case "sports" ->System.out.println("Display sports related content");
            case "enterinment" ->System.out.println("Display Enterinment realted content");
            default ->System.out.println("Display mixed content");
        }

    }
}

