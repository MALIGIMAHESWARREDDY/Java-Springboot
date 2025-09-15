public class Cart{

public static void main(String[] args){
    System.out.println("Java com");

    Cart crobj= new Cart();
    crobj.Upadte();
    crobj.Addtocart();
    crobj.Deleteitem();
    
}
public void Upadte(){
    System.out.println("update cartsucess");
}
public void Addtocart(){
    System.out.println("added");
}
public void Deleteitem(){
    System.out.println("deleted");
}
}