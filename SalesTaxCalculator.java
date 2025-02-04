public class SalesTaxCalculator {
    public static void main(String[] args) {
        // Perform basic input verification
        if (args.length != 2) {
            System.out.println("Error: Incorrect number of arguments");
            return;
        }

        // Create variable to store state
        State state;

        // Initialize state as either Indiana, Alaska, or Hawaii
        // Dynamically set tax behavior to match state
        if (args[0].equals("Indiana")) {
            state = new Indiana();
            state.setTaxBehavior(new SevenPercent());
        }
        else if (args[0].equals("Alaska")) {
            state = new Alaska();
            state.setTaxBehavior(new NoTax());
        }
        else if (args[0].equals("Hawaii")) {
            state = new Hawaii();
            state.setTaxBehavior(new FourAndHalfPercent());
        }
        else {
            System.out.println("Error: Only Indiana, Alaska, and Hawaii are supported states");
            return;
        }

        // Compute sales tax and print message for user
        state.showTax(Double.parseDouble(args[1]));
    }
}
