package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        Integer result = 0;
        Integer A = 0;
        Integer B = 0;
        Integer C = 0;
        Integer D = 0;

        for(int i = 0; i < skus.length(); i++) {
            if(skus.charAt(i) == 'A') {A++;}
            else if(skus.charAt(i) == 'B') {B++;}
            else if(skus.charAt(i) == 'C') {C++;}
            else if(skus.charAt(i) == 'D') {D++;}
            else return -1;
        }

        result = result + A%3 * 50;
        if(A>=3){result = result + A/3 * 130;}

        result = result + B%3 * 50;

        return result;
    }
}



