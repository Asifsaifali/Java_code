class Factorial {

    public static int factorial(int n) {
        return n <= 0 ? 1 : n * factorial(n - 1);
    }
<<<<<<< HEAD

=======
>>>>>>> d3e53b4 (Factorial optimized code)
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}