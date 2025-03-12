public class Array {

    public static int Arrays(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка данных в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String[][] validArray = {
            {"15", "2", "3", "4"},
            {"5", "67", "7", "8"},
            {"9", "180", "11", "45"},
            {"167", "14", "15", "90"}
        };

        String[][] invalidSizeArray = {
            {"1", "867", "3"},
            {"4", "5", "6"},
            {"78", "8", "97"}
        };

        String[][] invalidDataArray = {
            {"1ty", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
        };

        try {
            // Правильный массив
            int result = Arrays(validArray);
            System.out.println("Сумма элементов: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Неправильный размер массива
            Arrays(invalidSizeArray);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Неверные данные в массиве
            Arrays(invalidDataArray);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        // ArrayIndexOutOfBoundsException
        try {
            String[] testArray = new String[3];
            System.out.println(testArray[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: индекс вне границ массива.");
        }
    }
}