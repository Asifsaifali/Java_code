class Factorial {

    public static int factorial(int n) {
        return n <= 0 ? 1 : n * factorial(n - 1);
    }
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> d3e53b4 (Factorial optimized code)
=======
>>>>>>> 05ff9e9cdb9c05385ab8138cf109ab82c08fc9eb
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}