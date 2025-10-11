//example online shoping website myntra payment gateways in sales time 

//working processs;
//1 create orderId   //send the orderId to payment Gateway (amount) responce code to the java code
// cancel order
// refund order 


//payment gateways above above 2 is common for all payment gateways
//1 justpay

//process payment
// verify payment

//2 PayU

//process payment
// verify payment

//3 PayTM

//process payment
// verify payment

//4 Razorpay

//process payment
// verify payment

class PaymentGateway{
    int orderId = 0;
    public static void main(String[]args){
        System.out.println(" ");
    }

    public void CreateOrderId(){
        orderId = 20;
        System.out.println("Order id created");

    }
    public void CancelOrderid(){
        System.out.println("cancelling with your orderId = "+orderId);

    }
    public void RefundOrderId(){
        System.out.println("Refund intiated for orderId = "+orderId);

    }
}