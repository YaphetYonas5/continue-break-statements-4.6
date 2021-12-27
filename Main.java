class Main {
  public static void main(String[] args) {
     for (int i = 1; i <= 10; i++)
      {
         if (i == 5)
         {
            break;    // terminate loop if i is 5
         }
         if (i % 2 == 0)
         {
            continue;    // skip next statement if i is even
         }

         System.out.print(i + " ");
      }

      System.out.println("Loop is over.");

         
  }
}