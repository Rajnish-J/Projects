class SimpleInterest implements InterestCalculator{
    public double calculateInterest(double p, int n, double r){
        return (p*n*r)/100;
    }
}
