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
        Integer G = 0;
        Integer H = 0;
        Integer I = 0;
        Integer J = 0;
        Integer K = 0;
        Integer L = 0;
        Integer M = 0;
        Integer N = 0;
        Integer O = 0;
        Integer P = 0;
        Integer Q = 0;
        Integer R = 0;
        Integer S = 0;
        Integer T = 0;
        Integer U = 0;
        Integer V = 0;
        Integer W = 0;
        Integer X = 0;
        Integer Y = 0;
        Integer Z = 0;

        for(int i = 0; i < skus.length(); i++) {
            if(skus.charAt(i) == 'A') {A++;}
            else if(skus.charAt(i) == 'B') {B++;}
            else if(skus.charAt(i) == 'C') {C++;}
            else if(skus.charAt(i) == 'D') {D++;}
            else if(skus.charAt(i) == 'E') {E++;}
            else if(skus.charAt(i) == 'F') {F++;}
            else if(skus.charAt(i) == 'G') {G++;}
            else if(skus.charAt(i) == 'H') {H++;}
            else if(skus.charAt(i) == 'I') {I++;}
            else if(skus.charAt(i) == 'J') {J++;}
            else if(skus.charAt(i) == 'K') {K++;}
            else if(skus.charAt(i) == 'L') {L++;}
            else if(skus.charAt(i) == 'M') {M++;}
            else if(skus.charAt(i) == 'N') {N++;}
            else if(skus.charAt(i) == 'O') {O++;}
            else if(skus.charAt(i) == 'P') {P++;}
            else if(skus.charAt(i) == 'Q') {Q++;}
            else if(skus.charAt(i) == 'R') {R++;}
            else if(skus.charAt(i) == 'S') {S++;}
            else if(skus.charAt(i) == 'T') {T++;}
            else if(skus.charAt(i) == 'U') {U++;}
            else if(skus.charAt(i) == 'V') {V++;}
            else if(skus.charAt(i) == 'W') {W++;}
            else if(skus.charAt(i) == 'X') {X++;}
            else if(skus.charAt(i) == 'Y') {Y++;}
            else if(skus.charAt(i) == 'Z') {Z++;}
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

        result = result + G * 20;

        result = result + H/10 * 80;
        H = H % 10;
        result = result + H/5 * 45;
        H = H % 5;
        result = result + H * 10;

        result = result + I * 35;

        result = result + J * 60;

        result = result + K/2 * 120;
        K = K%2;
        result = result + K * 70;

        result = result + L * 90;

        result = result + N * 40;
        M = M - N/3;

        if(M>0) {
            result = result + M * 15;
        }

        result = result + O * 10;

        result = result + P/5 * 200;
        P = P%5;
        result = result + P * 50;

        result = result + R * 50;
        Q = Q - R/3;

        if(Q>0) {
            result = result + Q/3 * 80;
            Q = Q % 3;
            result = result + Q * 30;
        }

        if(U % 4 != 0) {
            result = result + U%4 * 40;
        }
        U = U/4;
        result = result + U*3 * 40;

        result = result + V/3 * 130;
        V = V%3;
        result = result + V/2 * 90;
        V = V%2;
        result = result + V * 50;

        result = result + W * 20;

        result = result + (S+T+X+Y+Z)/3 * 45;

        Integer nr = (S+T+X+Y+Z)%3;
//        if(nr!=0){
//            if(X>=nr){result = result + nr * 17;}
//            else if(Y>=nr){result = result + nr * 20;}
//            else if(S>=nr){result = result + nr * 20;}
//            else if(T>=nr){result = result + nr * 20;}
//            else {result = result + nr * 21;}
//        }

        if(nr != 0){
            if(X > 0 && X>=nr){result = result + nr * 17;}
            else{
                result = result + X * 17;
                nr-=X;
                if(Y > 0 && Y>=nr){result = result + nr * 20;}
                else{
                    result = result + Y * 20;
                    nr-=Y;
                    if(S > 0 && S>=nr){result = result + nr * 20;}
                    else{
                        result = result + S * 20;
                        nr-=S;
                        if(T > 0 && T>=nr){result = result + nr * 20;}
                        else{
                            result = result + T * 20;
                            nr-=T;
                            if(Z > 0 && Z>=nr){result = result + nr * 21;}
                            else{
                                result = result + Z * 21;
                            };
                        };
                    };
                };
            };
        }

        return result;
    }
}
