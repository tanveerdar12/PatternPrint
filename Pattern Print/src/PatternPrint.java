import java.util.Scanner;
public class PatternPrint {
    public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array i,e. x and y");
                int x = sc.nextInt();
                int y = sc.nextInt();

                int[][] arr = new int[x][y];

                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < y; j++) {
                        if ((i + j) < 3) {
                            System.out.print(" - ");
                        } else {
                            System.out.print(" * ");
                        }
                    }
                    System.out.println(" ");
                }


    }
}

