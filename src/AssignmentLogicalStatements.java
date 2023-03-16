public class AssignmentLogicalStatements {
    public static void main(String[] args){
        double firstVariable = 20.00D;
        double secondVariable = 80.00D;
        double multiplicationResult = (firstVariable + secondVariable) * 100.00;
        System.out.println(multiplicationResult);
        double remainder = multiplicationResult % 40.00;
        boolean isZero = remainder == 0 ? true : false; // this can also be written as remainder == 0;
        System.out.println("isZero :" + isZero);
        if(isZero){
            System.out.println("Got Zero Remainder");
        }
        else{
            System.out.println("Got Non-Zero Remainder");
        }

    }
}
