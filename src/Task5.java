public class Task5 {
    public static void main(String[] args) {
        int grade = 80;
        if(grade >= 90 && grade <= 100){
            System.out.println("A");
        }if(grade >= 80 && grade < 90){
            System.out.println("B");
        }if(grade >= 70 && grade < 80){
            System.out.println("C");
        }if(grade >= 60 && grade < 70){
            System.out.println("D");
        } if(grade < 60){
            System.out.println("F");
        }else if(grade > 100 & grade < 0) {
            System.out.println("Out of range!");
        }
    }
}
