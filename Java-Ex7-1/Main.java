import java.util.Vector;

class Main {
  public static void main(String[] args) {
    Vector<Integer> v = new Vector<Integer>(3);//7보다 많으면 알아서 늘림
    System.out.println("capacity "+v.capacity());
    v.add(5);
    v.add(4);
    v.add(-1);
    v.add(2,100);//2번 인덱스에 100을 넣어라(4와 -1 사이)
    System.out.println("capacity "+v.capacity());
    System.out.println("size "+v.size());
    for(int i=0; i<v.size(); i++) {
      System.out.println(v.get(i));
    }
    v.remove(1);//인덱스 위치 값 삭제
    int sum=0;
    for(int i=0; i<v.size(); i++)
      sum += v.get(i);
    System.out.println("Sum"+sum);
    System.out.println("last:"+v.lastElement());
    v.removeAllElements();
    System.out.println("capacity "+v.capacity());
    System.out.println("size "+v.size());
  }
}