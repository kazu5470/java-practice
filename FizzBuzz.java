public class FizzBuzz {
    public static void main(String[] args){
        for (int n = 1; n <= 100; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            }   
            else if (n % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (n % 5 == 0) {
                System.out.println("Buzz");
            } 
            else {
                System.out.println(n); 
            }  
        }    
    } 
}

// 1から100までの整数を1から順に表示してください。

// ただし、表示しようとしている数値が、

// ・3の倍数かつ5の倍数のときには、"Fizz Buzz"
// ・3の倍数のときには、"Fizz"
// ・5の倍数のときには、"Buzz"

// を数値の代わりに表示してください。