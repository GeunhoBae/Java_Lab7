import java.util.Vector;

class Main {
  public static void main(String[] args) {
    Vector<Point> v = new Vector<Point>();

    v.add(new Point(2,3));
    v.add(new Point(10,20));
    v.add(new Point(-20, -40));

    for(int i=0; i<v.size(); i++) {
      System.out.println(v.get(i));
    }
  }
}