package HW12;

public class Exception {
    public static void main(String[] args) {
        classCastException();//Не нужно
        nullPointerException();//он является слишком частым, поэтому не обрабатывается
        numberFormatException();//
        arrayIndexOutOfBoundException();//
    }

    public static void classCastException() {
        String a = "";
        String b = (String) a;
        // не нужно обрабатывать
    }

    public static Object nullPointerException() {
        Object St = new Object();
        return St.hashCode();
        // не нужно
    }

    private static void numberFormatException() {
        String Ob = "123";
        int a = Integer.parseInt(Ob);
        // не нужно
    }

    private static void arrayIndexOutOfBoundException() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            // не нужно
        }
    }
}