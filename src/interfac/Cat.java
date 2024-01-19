package interfac;

class Cat implements Animal  {

    String colour;
    public void getColour(String colour) {
        this.colour = colour;
        System.out.println(colour);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}
