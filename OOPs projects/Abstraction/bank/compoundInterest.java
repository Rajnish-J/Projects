class CompoundInterest implements InterestCalculator{
    public double calculateInterest(double p, int n, double r){
        double d = (1 + (r/100));

        return p * pow(d,n);
    }

    public double pow(double d, int n){
        double res = 1;
        for(int i = 0; i<=n; i++){
            res = res * d;
        }
        return res;
    }    
}