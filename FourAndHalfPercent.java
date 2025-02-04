public class FourAndHalfPercent implements SalesTaxBehavior {
    @Override
    public Double compute(Double value) {
        return value * 0.045;
    }
}
