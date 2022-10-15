public class Chapter07 {
    public static void main(String[] args){
        int data = 7;
        if ( data <= 5 ){
            System.out.println("とても近いです");
        } else if ( data <= 10){
            System.out.println("近いです");
        } else if ( data <= 15){
            System.out.println("遠いです");
        } else {
            System.out.println("とても遠いです");
        }
    }
}