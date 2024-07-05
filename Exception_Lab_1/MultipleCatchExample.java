package test.example;

public class MultipleCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]); // ArrayIndexOutOfBoundsException

            String str = null;
            System.out.println(str.length()); // NullPointerException

            int result = 10 / 0; // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        }
	}

}
