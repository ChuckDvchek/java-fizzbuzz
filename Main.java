import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        Integer input = scanner.nextInt();

        boolean isDivByFive = (input % 5 == 0);
        boolean isDivByThree = (input % 3 == 0);

        if (isDivByFive && isDivByThree)
            System.out.println("FizzBuzz");
        else if (isDivByFive)
            System.out.println("Fizz");
        else if (isDivByThree)
            System.out.println("Buzz");
        else
            System.out.println(input);
            
        scanner.close();
    }
}