package pl.javastart.junit;

public class Square {

    public static int sumOfSquare(int upTo){
        int sumOfSquare=0, sumSquared=0;
        if (upTo<=0) {
            return 0;
        } else{
            for (int i = 1; i <= upTo; i++) {
                sumOfSquare += Math.pow(i,2);
                sumSquared+=i;
            }
            sumSquared = sumSquared*sumSquared;
        }
        return sumSquared-sumOfSquare;
    }

}
