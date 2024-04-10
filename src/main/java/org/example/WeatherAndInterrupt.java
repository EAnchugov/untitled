package org.example;

public class WeatherAndInterrupt {
    // слово "volatile" мы объясним позже
    private static volatile boolean stopped = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (!stopped) {
                if (getWeather().equals("ливень")) {
                    System.out.println("thread: возьмите зонт!");
                }

                try {
                    System.out.println("thread: засыпаю на 5 секунд");
                    Thread.sleep(5_000L);
                } catch (InterruptedException e) {
                    System.out.println("thread: меня прервали!");
                }

                System.out.println("thread: завершение потока");
            }
        });

        // Запуск "погодного" потока
        thread.start();
        // Немного ждём, чтобы погодный поток успел запуститься и вызвать свой sleep(5 сек)
        Thread.sleep(100L);

        // stopped = true
        System.out.println("main(): присваиваю stopped = true");
        stopped = true;
        // Засекаем время, когда выставили stopped = true
        long stoppedIsTrueTime = System.nanoTime();

        // тот самый interrupt()
//        System.out.println("main(): прерываю поток thread");
//        thread.interrupt();

        // Ждём завершения погодного потока
        thread.join();
        // Засекаем время, когда поток завершился
        long joinedTime = System.nanoTime();

        // Делить на 10^9 надо, чтобы перевести наносекунды в секунды
        double secondsToStop = (joinedTime - stoppedIsTrueTime) / 1_000_000_000.0;
        System.out.printf(
                "main(): погодный поток остановился через %.1f секунд(ы) после stopped = true",
                secondsToStop);
    }

    private static String getWeather() {
        return "ливень";
    }
}