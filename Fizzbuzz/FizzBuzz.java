public class FizzBuzz {

    public static String fizzBuzz(int number){
        //for(int i=1; i<=100; i++) {
        if(number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz";
        if(number % 5 == 0)
            return "Fizz";
        if(number % 3 == 0)
            return "Buzz";
        return Integer.toString(number);
        //}
    }

    public static void main(String[] args) {
        
        
        System.out.println(fizzBuzz(9));     // Fizz
        System.out.println(fizzBuzz(10));    // Buzz
        System.out.println(fizzBuzz(15));    // FizzBuzz
        System.out.println(fizzBuzz(16));    // 16
        System.out.println(fizzBuzz(2)); 
        
    }
}



