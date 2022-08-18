public class Factorial {

//    5! = 1*2*3*4*5

public int countFactorial(int x) {

    int factor =1;

    for (int i = 1; i<=x; i++) {
        factor *= i;
    }
    return factor;
}

}
