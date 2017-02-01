/**
 * Created by Slava on 31.01.2017.
 */
public class Start {
    public static void main(String[] args){
        AList aList = new AList();
        aList.add(0);
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);
        aList.add(5);
        aList.add(6);
        aList.add(7);
        aList.show();
        aList.add(2,9);
        aList.show();
        aList.remove(2);
        aList.remove(99);
        aList.clear();
        aList.add(7);
        aList.show();
    }
}
