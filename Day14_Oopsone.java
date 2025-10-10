public class Day14_Oopsone {

    String UserEmail;
    String Userpassword;

    String Title;
    int noofViews;

    public static void main(String[] args) {
        
        Day14_Oopsone obj1 = new Day14_Oopsone("mlaigi@gmail.com", "12345");
        
        System.out.println(obj1.UserEmail);
        System.out.println(obj1.Userpassword);
        
        Day14_Oopsone obj2 = new Day14_Oopsone("@gmail.com", "12345");
        
        System.out.println(obj2.UserEmail+" : "+obj2.Userpassword);

        Day14_Oopsone obj3 = new Day14_Oopsone("iphone 15pro max",867999);
        System.out.println(obj3.Title);
        System.out.println(obj3.noofViews);
        
    }

    public Day14_Oopsone(String inputEmail, String inputPassword) {
        this.UserEmail = inputEmail;
        this.Userpassword = inputPassword;
    }
    public Day14_Oopsone(String inputString,int inputnoofViews){
        this.Title = inputString;
        this.noofViews = inputnoofViews;
    }
    

    public void Login() {
        System.out.println("invalid details");
    }

    public void Signup() {
        System.out.println("Account created");
    }

    public void RestPassword() {
        System.out.println("reset password");
    }

    public void VideoTitles(){
        System.out.println("iphone 14pro max review");

    }
}


