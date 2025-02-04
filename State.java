public class State {

    // The name is set in the constructor of the child classes
    private String name;

    // the tax behavior is set dynamically in SalesTaxCalculator
    private SalesTaxBehavior taxBehavior;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaxBehavior(SalesTaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;
    }

    // showTax implementation is the same for each state, so it is fully implemented in the parent (this) class
    // however, it should not be called in this state as its name and tax behavior need to be set
    public void showTax(double value) {
        try {
            System.out.println("The sales tax on $" + Math.round(value * 100) / 100.0 + " in " + getName() + " is $" + Math.round(taxBehavior.compute(value) * 100) / 100.0 + ".");
        }
        catch (Exception e) {
            System.out.println("Error: Tax was calculated without state or tax behavior being specified");
        }
    }
}