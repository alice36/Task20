package pl.javastart.junit;

public class Euler {
    public static int sumThreeFive(int upTo){
        int sum=0;
        if (upTo<=0) {
            return sum;
        } else {
            for (int i = 1; i < upTo ; i++) {
                if ((i%3)==0 || (i%5)==0){
                    sum+=i;
                }
            }
        }
        return sum;
    }
}
