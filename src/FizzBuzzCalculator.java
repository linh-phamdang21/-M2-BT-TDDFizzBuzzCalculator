public class FizzBuzzCalculator {
    public static int checkStringNumber(int number){
        String strNumber = Integer.toString(number);
        String[] arrayNumber = strNumber.split("");
        for (int i = 0; i < arrayNumber.length; i++){
            if (arrayNumber[i].equals("3")){
                return 3;
            } else if (arrayNumber[i].equals("5")){
                return 5;
            }
        }
        return -1;
    }
    public static String translate(int number){
        boolean numberDivideBy3 = number % 3 == 0;
        boolean numberDivideBy5 = number % 5 == 0;
        boolean numberHas3 = checkStringNumber(number) == 3;
        boolean numberHas5 = checkStringNumber(number) == 5;
        if (numberDivideBy3 && numberDivideBy5) {
            return "FizzBuzz";
        }
        else if (numberDivideBy3 || numberHas3) {
            return "Fizz";
        }
        else if (numberDivideBy5 || numberHas5) {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}
