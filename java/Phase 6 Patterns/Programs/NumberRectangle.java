public class NumberRectangle {

    public static void main(String[] args) {

        for(int row = 1; row <= 4; row++) {

            for(int col = 1; col <= 4; col++) {

                System.out.print(col+" ");

            }

            System.out.println();

        }
        System.out.println();
        //Same row based
        for(int row = 1; row <= 4; row++) {

            for(int col = 1; col <= 4; col++) {

                System.out.print(row+" ");

            }

            System.out.println();

        }
        System.out.println();
        /*Print a 3 × 3 rectangle.
        Print a 6 × 4 rectangle.
        Print a 7 × 7 square.
        Print a rectangle of '#'.
        Print a rectangle of '$'. */
        for(int row = 1; row <= 3; row++) {

            for(int col = 1; col <= 4; col++) {

                System.out.print("# ");

            }

            System.out.println();

        }
    }

}