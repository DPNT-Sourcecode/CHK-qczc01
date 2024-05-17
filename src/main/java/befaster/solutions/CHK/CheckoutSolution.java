package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        Integer result = 0;
        Integer A = 0;
        Integer B = 0;
        Integer C = 0;
        Integer D = 0;
        Integer E = 0;
        Integer F = 0;

        for(int i = 0; i < skus.length(); i++) {
            if(skus.charAt(i) == 'A') {A++;}
            else if(skus.charAt(i) == 'B') {B++;}
            else if(skus.charAt(i) == 'C') {C++;}
            else if(skus.charAt(i) == 'D') {D++;}
            else if(skus.charAt(i) == 'E') {E++;}
            else if(skus.charAt(i) == 'F') {F++;}
            else return -1;
        }

        result = result + A/5 * 200;
        A = A % 5;
        result = result + A/3 * 130;
        A = A % 3;
        result = result + A * 50;

        result = result + E * 40;

        B = B - E/2;

        if(B>0) {
            result = result + B / 2 * 45;
            B = B % 2;
            result = result + B * 30;
        }

        result = result + C * 20;

        result = result + D * 15;

        if(F % 3 != 0) {
            result = result + F%3 * 10;
        }
        F = F/3;
        result = result + F*2 * 10;

        return result;
    }
}



