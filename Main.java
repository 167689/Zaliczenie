import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  char[]tekstodw;
    Scanner input = new Scanner(System.in);
    System.out.print("Podaj ciąg znaków ");
    String tekst = input.nextLine();
    
    tekstodw=tekst.toCharArray();
    

   for(int i = tekst.length()-1; i>=0; i--) 
   {
     System.out.print(tekstodw[i]);
   }
    
    input.close();
  }
}