// Task: 1). Create Array for storing youtube video titles. 
// Print all items and update all items

class ArrayConcept{
    public static void main(String[]args){

        //String array

        String [] titles = {"iphone14 review","iphone15 review","iphone16 review",};
        System.out.println(titles[0]);
        System.out.println(titles[1]);
        System.out.println(titles[2]);

        //Updated Titles
        titles[1] = "iphone15 green color review";
        System.out.println(titles[1]);
        titles[2] = "iphone16 white color review";
        System.out.println(titles[2]);
        titles[0] = "iphone14 blue color review";
        System.out.println(titles[0]);

        //numbers array

        int [] ProductPrices = {999,738,799,1080,699};

        System.out.println(ProductPrices[0]);
        System.out.println(ProductPrices[1]);
        System.out.println(ProductPrices[2]);
        System.out.println(ProductPrices[3]);
        System.out.println(ProductPrices[4]);

        //Updated Values

        ProductPrices [0] = 1099;
        System.out.println(ProductPrices[0]);
        ProductPrices [4] = 99;
        System.out.println(ProductPrices[4]);
    


        
    }
}