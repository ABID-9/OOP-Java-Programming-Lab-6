public class smallest {

static int smallest(int a, int b, int c) {
      int smallest = a;

 if (b < smallest)
   smallest = b;

 if (c < smallest)
  smallest = c;

    return smallest;
    }

    public static void main(String[] args) {
 int a = 25;
  int b = 37;
  int c = 29;

  System.out.println("Smallest number: " + smallest(a, b, c));
    }
}