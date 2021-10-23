class Main{

  public static void main(String[] args) {

    Calculator myCalculator = new Calculator();
    String operation = args[0];
    int num1 = Integer.parseInt(args[1]);
    int ans = 0;

    switch(operation){
      case "add":{
        int num2 = Integer.parseInt(args[2]);
        ans = myCalculator.add(num1, num2);
        break;
      }
      case "subtract":{
        int num2 = Integer.parseInt(args[2]);
        ans = myCalculator.subtract(num1, num2);
        break;
      }
      case "multiply":{
        int num2 = Integer.parseInt(args[2]);
        ans = myCalculator.multiply(num1, num2);
        break;
      }
      case "divide":{
        int num2 = Integer.parseInt(args[2]);
        ans = myCalculator.divide(num1, num2);
        break;
      }
      case "fib":{
        ans = myCalculator.fibonacciNumberFinder(num1);
        break;
      }
      case "binary":{
        ans = Integer.parseInt(myCalculator.intToBinaryNumber(num1));
        break;
      }

    }

    System.out.println(ans);

  }
}