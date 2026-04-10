public class DoOp {
    public static String operate(String[] args) {
        if (args.length != 3) return "Error";

        int n = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[2]);
        String sign = args[1];

        switch (sign) {
            case "+":
                return String.valueOf(n + n2);
            case "*":
                return String.valueOf(n * n2);
            case "/":
                if (n2 == 0) return "Error";
                return String.valueOf(n / n2);
            case "-":
                return String.valueOf(n - n2);
            case "%":
                if (n2 == 0) return "Error";
                return String.valueOf(n % n2);
            default:
                return "Error";
        }
    }
}