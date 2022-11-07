package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int rowCount = 1;
        for (int i = cathetusLength; i > 0; i--) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = rowCount; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= rowCount-1; j++) {
                System.out.print(j+1);
            }

            System.out.println();
            rowCount++;
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
