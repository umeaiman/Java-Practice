public class AsciiVideo {
    public static void main(String[] args) throws InterruptedException {
        // Frame 1
        int[][] frame1 = {
            {0, 0, 1, 1, 0, 0},
            {0, 2, 3, 3, 2, 0},
            {1, 3, 9, 9, 3, 1},
            {0, 2, 3, 3, 2, 0},
            {0, 0, 1, 1, 0, 0}
        };

        // Frame 2 (slightly different to create motion)
        int[][] frame2 = {
            {0, 0, 0, 0, 0, 0},
            {0, 2, 3, 3, 2, 0},
            {0, 3, 9, 9, 3, 0},
            {0, 2, 3, 3, 2, 0},
            {0, 0, 0, 0, 0, 0}
        };

        // Loop forever (video effect)
        while (true) {
            displayFrame(frame1);
            Thread.sleep(500); // wait 0.5 seconds

            displayFrame(frame2);
            Thread.sleep(500); // wait 0.5 seconds
        }
    }

    // Method to display a frame
    public static void displayFrame(int[][] image) {
        // Clear the console by printing newlines
        for (int i = 0; i < 10; i++) System.out.println();

        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col < image[row].length; col++) {
                int brightness = image[row][col];

                // Map brightness to ASCII character
                char pixel;
                if (brightness == 0) {
                    pixel = ' ';
                } else if (brightness <= 2) {
                    pixel = '.';
                } else if (brightness <= 5) {
                    pixel = '*';
                } else {
                    pixel = '#';
                }

                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
