import java.io.Serializable;
public class Ball implements Serializable{
    String color;
    int size;
    String material;
    String game;

    public Ball(String color, int size, String material, String game) {
        this.color = color; // setting the value
        this.size = size;
        this.material = material;
        this.game = game;
    }
    @Override
    public String toString() {
        return "Ball [color=" + color + ", game=" + game + ", material=" + material + ", size=" + size + "]";
    }
     
    public String getColor() {
        return color;
    }
    public int getSize() {
        return size;
    }
    public String getMaterial() {
        return material;
    }
    public String getGame() {
        return game;
    }

   /* public void setColor(String color) {
        this.color = color;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setGame(String game) {
        this.game = game;
    }*/
  /*  public static void main(String[] args) {
     Ball b1 = new Ball("white", 180, "Rubber", "Football");
     Ball b2 = new Ball("red", 80, "Rubber", "Cricket");

        //System.out.println(b1.toString()); // it convert the object into String
        //System.out.println(b2.toString());
        System.out.println(b1.color+" "+b1.game+" "+b1.material+" "+b1.size);
        System.out.println(b2.color+" "+b2.game+" "+b2.material+" "+b2.size);
    }*/
}
