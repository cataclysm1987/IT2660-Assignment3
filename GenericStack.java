

public class GenericStack<T> {
    private T[] Data;
    private int Top;
    private int Size;
    
    public GenericStack(){
        Top = -1;
        Size = 100;
        Data = (T[]) new Object[100];
    }

    public GenericStack(int n){
        Top = -1;
        Size = n;
        Data = (T[]) new Object[n];
    }

    public void push(T newNode){
        Thing node = (Thing) newNode;
        if (Top == Size - 1){
            Size++;
            T[] newData = (T[]) new Object[Size];
            for(int i = 0; i < Size - 1; i++ ){
                newData[i] = Data[i];
            }
            Data = newData;
        } else {
            Top++;
            Data[Top] = (T)node.DeepCopy();
        }
    }

    public T pop(){
        int topLocation;
        if (Top == -1){
            return null;
        } else {
            topLocation = Top;
            Top = Top - 1;
            return Data[topLocation];
        }
    }

    public void showAll(){
        for (int i = Top; i >= 0; i--){
            System.out.println((Thing)Data[i]);
        }
    }

    public int getSize(){
        return Size;
    }

    public int getTop(){
        return Top;
    }
}