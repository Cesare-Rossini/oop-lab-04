public class Calculator {

    int nOpDone;
    double lastRes;
    
    void build() {
        this.nOpDone = 0;
        this.lastRes = 0;
    }

    double add (double first, double second) {
        nOpDone++;
        lastRes = first + second;
        return lastRes;
    }

    double sub (double first, double second) {
        nOpDone++;
        lastRes = first - second;
        return lastRes;
    }

    double mul (double first, double second) {
        nOpDone++;
        lastRes = first * second;
        return lastRes;
    }

    double div (double first, double second) {
        nOpDone++;
        lastRes = first / second;
        return lastRes;
    }
}
