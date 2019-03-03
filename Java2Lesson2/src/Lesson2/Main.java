package Lesson2;

public class Main {

    public static void main(String[] args) {

        String[][] arr = new String[][]{
                {"1", "2", "3", "4"},
                {"2", "2", "2", "3"},
                {"1", "2", "2", "2"},
                {"2", "2", "2", "2"}};
        try {
            try {
                int result = checker(arr);
                System.out.println(result);
            } catch (MyArraySizeException ex) {
                System.out.println("Array size exceeded");
            }
        } catch (MyArrayDataException ex) {
            System.out.println("Invalid array value");
            System.out.println("Cell Error: " + ex.i + "." + ex.j);
        }

    }


    public static int checker(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return sum;
    }
}