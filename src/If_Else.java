public class If_Else {

    static void useIf_Else(int score){
        if(score >= 75){
            System.out.println("A");
        }
        else if(score >=60){
            System.out.println("B");

        }
        else if(score > 50){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }
    }

    public static void main(String[] args) {
        int num = 80;

        useIf_Else(num);
    }
}
