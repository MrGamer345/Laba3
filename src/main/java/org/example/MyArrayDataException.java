package org.example;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(int i, int j, String value){
        super("Некорректные данные в ячейке [" + (j+=1) + "][" + (i+=1) + "] ("+ value +"), должно быть целое число");
    }
}
