package ru.netology.sqr;

public class SQRService {
    public int sqrCounter(int bottomLimit, int topLimit) {
        int count = 0;
        for (int i = 10 ; i <= 99 ; i++) {
            if(i * i >= bottomLimit && i * i <= topLimit) {
                count++;
            }
        }
        System.out.println("Количество значений в диапазоне: " + count);
        return count;
    }
}
