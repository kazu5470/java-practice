public class Test01 {
    public static void main(String[] args){
        String[] items = new String[3];
        items[0] = "コーヒー";
        items[1] = "カフェオレ";
        items[2] = "オレンジジュース";
        for (int n = 0; n < 3; n++) {
            System.out.println(items[n]);
            if (n == 3){
                break;
            }    
        }    
    }
}