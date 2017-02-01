import java.util.Arrays;

/**
 * Created by Slava on 31.01.2017.
 */
public class AList implements NList {
    private int [] array = new int[MIN_SIZE];
    private final static int MIN_SIZE = 5;
    private int realSize;

    @Override
    public void add(int data) {

        if (array.length == 0) {
            //array = new int[MIN_SIZE];
        }
        //array[realSize++] = data;
        if (array.length > realSize) {
            array[realSize++] = data;
        }
        else {
            array = Arrays.copyOf(array,array.length*3/2+1);
            array[realSize++] = data;
        }
    }

    @Override
    public void add(int index, int data) {
        if (index == realSize-1) {add(data);} else {
            if (array.length==realSize){array = Arrays.copyOf(array,array.length*3/2+1);}
            System.arraycopy(array, index, array, index + 1, realSize - index + 1);
            realSize++;
            array[index] = data;
        }
    }

    @Override
    public int get(int index) {
        try {
            if(index>=realSize) throw new Exception("беда у вас с индексами. ");
        return array[index];}
        catch(Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

    @Override
    public void remove(int index) {
        if (index == realSize-1) {array[realSize]=0; realSize--;}
        else {
            try {
                System.arraycopy(array, index + 1, array, index, realSize - index - 1);
                array[realSize] = 0;
                realSize--;
            }
            catch(IndexOutOfBoundsException e){System.out.printf("Индекс за пределами массива%n");}
        }
    }

    @Override
    public int size() {
        //System.out.print(realSize);
        return realSize;

    }

    @Override
    public void clear() {
        array = new int[MIN_SIZE];
        realSize=0;
    }

    @Override
    public void show() {
        for(int i=0;i<realSize;i++){
            System.out.printf("%d ",array[i]);

        }
        System.out.printf("%n");
    }
}
