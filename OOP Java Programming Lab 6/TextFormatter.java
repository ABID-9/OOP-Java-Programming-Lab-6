class TextFormatter {

    void formatText(String text) {
   System.out.println(text.toUpperCase());
    }

    void formatText(String text, int times) {
   for (int i = 1; i <= times; i++) {
  System.out.print(text + " ");
   }
  System.out.println();
    }

    void formatText(String text, String prefix) {
        System.out.println(prefix + " " + text);
    }

    public static void main(String[] args) {
 TextFormatter t = new TextFormatter();

  t.formatText("hello");
 t.formatText("Echo", 3);
 t.formatText("System updated", "[INFO]");
    }
}