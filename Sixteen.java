public class Sixteen{
  public static void main(String args[]){
    int Given_Mints= 3456789;
    int Mint_One_Year= 365*24*60;
    int Predicated_Years= (Given_Mints/Mint_One_Year);
    System.out.print("Answer: ");
    System.out.print(Predicated_Years);
  System.out.print(" Years & ");
    int Remaining_Mint= Given_Mints-(Predicated_Years*Mint_One_Year);
    int Mint_One_Day=24*60;
    int Predicated_Days= Remaining_Mint/Mint_One_Day;
  System.out.print(Predicated_Days);
  System.out.println(" Days");
  
  }
}