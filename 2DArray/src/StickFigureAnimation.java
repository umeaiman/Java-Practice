public class StickFigureAnimation {
    public static void main(String[] args) throws InterruptedException {
        // Frame 1: Left leg forward
        String[] frame1 = {
            "   o   ",   // head
            "  /|\\  ",  // arms
            "   |   ",   // body
            "  / \\  "   // legs
        };

        // Frame 2: Right leg forward
        String[] frame2 = {
            "   o   ",
            "  /|\\  ",
            "   |   ",
            "   /\\  "   // legs switched
        };

        // Loop animation
        while (true) {
            displayFrame(frame1);
            Thread.sleep(500); // wait 0.5s

            displayFrame(frame2);
            Thread.sleep(500);
        }
    }

    // Method to display a frame
    public static void displayFrame(String[] frame) {
        // Clear screen (prints new lines)
        for (int i = 0; i < 10; i++) System.out.println();

        for (String line : frame) {
            System.out.println(line);
        }
    }
}
