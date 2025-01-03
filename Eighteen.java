public class Eighteen{
  public static void main(String args[]) {
    int roll=24321307;
    int divider=24321300;
    int last_digit= roll%divider;
    divider= 24321307;
    int second_last_digit= roll%divider;
   System.out.print("The first last digit from right is ");
    System.out.print(last_digit);
    System.out.println(".");
    System.out.print("The second last digit from right is ");
    System.out.print(second_last_digit);
    System.out.println(".");
   }
}
      