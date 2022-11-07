package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int newNumberToPrint = numberToPrint;
        for (int i = 1; i < power; i++) {
            newNumberToPrint *= numberToPrint;
        }
        System.out.println(newNumberToPrint);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
