package OtherTest;

import java.io.IOException;

public class Bar {
    public static void main(String[] args) throws InterruptedException {
        String bar[] = { " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " };
        int time = 0;

        while (time <= 5) {
            for (int i = 0; i < bar.length; i++) {
                load();

                System.out.print("[");
                System.out.print(bar[0] + bar[1] + bar[2] + bar[3] + bar[4] + bar[5] + bar[6] + bar[7] + bar[8] + bar[9]);
                System.out.print("]");

                bar[i] = ">";
                if (i > 0) {
                    bar[i - 1] = "-";
                }

                if (i >= 6) {
                    bar[i - 6] = " ";
                }
                if (i <= 4) {
                    bar[i + 5] = " ";
                }
            }
            time++;
        }
        System.out.println();
    }

    public static void load() throws InterruptedException {
        Thread.sleep(50);

        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime();
            }
        } catch (IOException | InterruptedException ex) {
        }
    }
}
