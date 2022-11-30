import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            try {
                Scanner scanner=new Scanner(System.in);

                Parallelepiped parallelepiped=new Parallelepiped (scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                System.out.println(parallelepiped);
                parallelepiped.getArea();
                parallelepiped.getVolume();
            } catch (ArithmeticException e){
                System.out.println("number");
            }catch (Exception e){
                System.out.println("nepravilno");
            }

        }

    }
}
