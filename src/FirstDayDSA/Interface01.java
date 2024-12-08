package FirstDayDSA;

interface Drawable {
    void Draw();
}

interface Movable {
    void Move();
}

class Ram implements Drawable, Movable {
    public void Draw() {
        System.out.println("Drawing........");
    }

    public void Move() {
        System.out.println("Moving..........");
    }
}

public class Interface01 {
    public static void main(String[] args) {
        Ram ram = new Ram();
        ram.Draw();
        ram.Move();
    }
}
