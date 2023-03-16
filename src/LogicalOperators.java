public class LogicalOperators {
    public static void main(String[] args){
        System.out.println("We are here to learn about Logical Operators");

        System.out.println();
        System.out.println("Logical OR Operator");
        boolean isEmployee = true;
        boolean isSeniorCitizen = true;
        if(isEmployee || isSeniorCitizen){
            System.out.println("You are either employee or Senior citizen");
        }
        System.out.println("\n");

        System.out.println("Logical AND Operator");
        if(isEmployee && isSeniorCitizen){
            System.out.println("You are both an Employee and Senior citizen");
            System.out.println("You are eligible for pension");
        }
        System.out.println("\n");

        System.out.println("NOT Operator");
        boolean isMarried = false;
        if(!isMarried){
            System.out.println("Ohh..!! I see you are not married, so you are still a bachelor");
        }
        else{
            System.out.println("You are married, Unfortunately you have responsibilities to take care of");
        }
        System.out.println("\n");

        System.out.println("Working with ternary operator");
        String maritalStatus = isMarried ? "MARRIED" : "UNMARRIED";
        System.out.println("Your Marital Status is " + maritalStatus);

        System.out.println("Yeaaahh Done for the day");
    }
}
