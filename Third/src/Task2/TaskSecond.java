package Task2;

import java.util.Random;

public class TaskSecond {
    public static void main(String[] args) {
        Random rnd = new Random();
        int news = rnd.nextInt() % 100;

        System.out.println("Number of news: " + news);

        System.out.println("Number of pages: " + paperCounter(news));
    }

    private static int paperCounter(int newsOnPage) {
        int pCounter = 0;

        if(newsOnPage > 0) {
            pCounter = (newsOnPage / 10);
            if(((newsOnPage / 10) % 10) > 0 && ((newsOnPage / 10) % 10) < 10 || (newsOnPage / 10 % 10) < 10) {
                pCounter += 1;
            }
        }

        return pCounter;
    }
}
