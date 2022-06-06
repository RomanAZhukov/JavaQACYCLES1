package ru.netology.sqr;

public class SqrtService {

    public int calcSqrt(int valueX, int valueY) {
        int score = 0;

        for (int i = 10; i <= 99; i = i + 1) {
            int a = i * i;
            if (a <= valueX) {
                continue;
            }
            if (a >= valueY) {
                break;
            }
            score = score + 1;
        }
        return score;

    }
}






