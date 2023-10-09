package org.example;

public class MySimpleException extends RuntimeException{

    public MySimpleException(int i, int j, String value){
        super("Некорректное число в ячейке [" + (j+=1) + "][" + (i+=1) + "] ("+ value +"), не должно быть простых чисел от 100 до 500");
    }

}
