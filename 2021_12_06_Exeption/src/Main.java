public class Main {

    public static void main(String[] args) {
        System.out.println(divide(10,3)); //3
        //System.out.println(divide(10,0)); //?
        try{
            System.out.println(divideManualException(10,10)); //?
        } catch (CustomArithmeticExeption exep) {
            System.out.println("Custom Arithmetic Exception");
        }

        System.out.println(divide(10,2)); //5

    }

    public static int divide(int a, int b) {
        int res = a/b;
        return res;
    }

    public static int divideManualException(int a, int b) {
        if (b==0) {
            throw new CustomArithmeticExeption();
        }
        return a/b;
    }
}
