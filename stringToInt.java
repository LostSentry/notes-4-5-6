public class stringToInt {
    public static void main(String[] args) {

        String hopeThisIsANumber = "50";
        try {
            int number = Integer.parseInt(hopeThisIsANumber);
            System.out.println("The number is " + number);
        } catch (NumberFormatException e) {
            System.out.println(hopeThisIsANumber + " is not a valid number");
        }

        System.out.println("This is the end of the program");
    }
}
