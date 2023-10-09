package org.example;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"457", "455", "459", "5"},
                {"65", "199", "40", "9"},
                {"10", "11", "1", "13"},
                {"13", "15", "13", "17"}
        };
        try {
            int sum = sumArray(arr);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MySimpleException e) {
            e.printStackTrace();
        }
    }
    public static int sumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException, MySimpleException {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 4 || arr[i].length != 4) {
                throw new MyArraySizeException("Размер массива должен быть 4x4");
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                try {
                    sum += Integer.valueOf(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i,j,arr[i][j]);
                    }
                try {
                    int a = Integer.valueOf(arr[i][j]);
                    if (Integer.valueOf(arr[i][j]) <= 500 && Integer.valueOf(arr[i][j]) >= 100 && proverka(a))
                        throw new MySimpleException(i, j, arr[i][j]);
                    } catch(MySimpleException e){
                        e.printStackTrace();
                    }
                }
            }
        return sum;
    }
    public static boolean proverka(int a)
    {
        for (int i = 2; i < a; i++)
        {
            if (a % i == 0)
                return false;
        }
        return true;
    }
}