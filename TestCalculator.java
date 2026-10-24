class TestCalculator {
  public static void main() {
      Calculator calc = new Calculator();
      IO.println("1 + 2 =" + calc.add(1, 2) + " " + calc.lastRes + " " + calc.nOpDone);
      IO.println("-1 - 2 =" + calc.sub(-1, 2) +  " " + calc.lastRes + " " + calc.nOpDone);
      IO.println("6 * 3 =" + calc.mul(6, 3) + " " + calc.lastRes + " " + calc.nOpDone);
      IO.println("8 / 4 =" + calc.div(8, 4) + " " + calc.lastRes + " " + calc.nOpDone);
  }
}
