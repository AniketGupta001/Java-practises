//PRACTISE TO LEARN CLASS AND OBJECT
//PRINTING PEN COLOUR AND TYPE USING CLASS and OBJECT.
class Pen{
    String color;
    String type;//[ballpoint;gel]

    public void write(){
        System.out.println("can write in page");
    }
    public void printcolor(){
        System.out.println(this.color);
    }

    public void printtype(){
        System.out.println(this.type);
    }
}

class OOPS {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = " gel";

        Pen pen2 = new Pen();
        pen2.color= "red";
        pen2.color="ball";

        System.out.print("the pen ");
        pen1.write();
        System.out.print("the pen is ");
        pen1.printcolor();
        System.out.print("the pen is ");
        pen1.printtype();

        System.out.println();

        System.out.print("the pen ");
        pen2.write();
        System.out.print("the pen is ");
        pen2.printcolor();
        System.out.print("the pen is ");
        pen2.printtype();
    }
}