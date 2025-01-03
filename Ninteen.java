public class Ninteen {
public static void main(String args[]) {
  int a= 8;
    int b= 3;
    int A= 8/2;
   double A_to_the_power_two=Math.pow(A, 2);
    double b_to_the_power_two=Math.pow(b, 2); 
    //Here c is the value of the side;
    double c_to_the_power_two= (A_to_the_power_two+b_to_the_power_two);
    double c=Math.sqrt(c_to_the_power_two);
    double circumference= 6*c;
    double area= ((3*Math.pow(3, 3))/2)*c_to_the_power_two;
   System.out.print("This is the value of circumference: ");
   System.out.println(circumference);
   System.out.print("This is the value of area: ");
   System.out.println(area);
}
}