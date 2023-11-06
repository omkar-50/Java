public class Cal {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(args[0]);
        String op = args[1];
        double n2 = Double.parseDouble(args[2]);
        double c = 0;

        switch (op) {
            case "+":
                c =  n1 + n2;              
                break;

            case "-":
                c =  n1 - n2;              
                break;

            case "*":
                c =  n1 * n2;              
                break;

            case "/":
                c =  n1 / n2;              
                break;

            case "%":
                c =  n1 % n2;              
                break;
        
            default:
                System.out.println("Invalid input");
        }
        System.out.println("Result is : " + c);

    }
}
