/**
 * Created by Slava on 31.01.2017.
 */
public interface NList {
    void add(int data);
    void add(int index, int data);
    int get(int index);
    void remove(int index);
    int size();
    void clear();
    void show();
}