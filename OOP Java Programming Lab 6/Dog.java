class Dog {
    String name;
    String color;

    Dog(String name, String color) {
    this.name = name;
  this.color = color;
    }

    public static void main(String[] args) {
    Dog d = new Dog("Tommy", "Brown");

 System.out.println("Name: " + d.name);
 System.out.println("Color: " + d.color);
    }
}