class loop2{
    public static void main (String[]args){

        //break → Used to terminate a loop or switch immediately.

        int [] prices = {99,999,432,599,744};

        for(int i = 0; i < prices.length; i++){
            System.out.println(prices[i]);
            if(prices[i] == 999){
                break;
            }
        }

        // continue → Used to skip the current iteration of a loop and move to the next.

        for(int i = 0; i < prices.length; i++){
            if(prices[i] == 432){
                continue;
            }
            System.out.println(prices[i]);
        }
    }
}