class Numbervar{
    public static void main(String[] args){
        int count = 10;
        System.out.println(count);
        count = count +1;//11
        System.out.println(count);
        count += 1;//12
        System.out.println(count);
        count++;//post increment
        System.out.println(count);//13 
        ++count;//pre increment = 14
        System.out.println(count);

        int count2 = 20;
        System.out.println(count2);
        count2 = count2 -1;//19
        System.out.println(count2);
        count2 -= 1;//18
        System.out.println(count2);
        count2--;//post decrement
        System.out.println(count2);//17 

        System.out.println(count2-- + 10); //17+10=27
        System.out.println(count2);//16

        --count2;//pre decrement = 15
        System.out.println(count2);

        //example problems

        float price = 109.99f;
        int quantitys = 199;

        price = price*quantitys;

        System.out.println(price);

        price *= quantitys;

        System.out.println("Totalprice = "+price);
       
        // example2
        int num1 = 100;

        num1 = num1 / 10;
        System.out.println(num1);

        num1 /= 10;
        System.out.println(num1);

        // assingment otp generator

        double randomNumber = Math.random();
        System.out.println(randomNumber);
        System.out.println(randomNumber * 10000 );

        int otp = (int) (randomNumber * 10000);
        System.out.println(otp);
    }
}