class Paytm extends PaymentGateway{
    public static void main(String[]args){
        
        Paytm obj = new Paytm();
        obj.CreateOrderId();
        obj.processpayment();
        obj.verifypayment();
        obj.CancelOrderid();
        obj.RefundOrderId();
    }

    public void processpayment(){
        System.out.println("Process payments for the order id = "+ orderId);

    }
    public void verifypayment(){
        System.out.println("verifing payments for the order id = "+ orderId);
    }
}