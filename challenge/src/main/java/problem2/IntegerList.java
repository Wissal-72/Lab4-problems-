package problem2;

public class IntegerList
{
    int[] list;//values in the list
    int currentSize ;
    int numOfElements;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        currentSize = size;
        numOfElements=0;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;

        numOfElements=list.length;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    //-------------------------------------------------------
//increase the size of the array
//-------------------------------------------------------
    public void increaseSize(int newSize){
        if(newSize< list.length) return;
        int[] new_list = new int[newSize];
        for (int i = 0; i<list.length; i++){
            new_list[i]= list[i];
        }

        System.out.println("Size increased !");
        list = new_list;
        currentSize = newSize;
    }

    public void addElement(int newVal){
        if(currentSize == numOfElements){
            increaseSize(currentSize*2);
        }

        list[numOfElements] = newVal;
        numOfElements++;

    }
    public void removeFirst(int val){
        int i =0;
        while(list[i]!= val && i< numOfElements){
            i++;
        }
        if(i == numOfElements) return;
        for (int j = i+1 ; j< numOfElements; j++){
            list[j-1] = list[j];
        }

        numOfElements--;

        list[numOfElements] =0;

    }

    public void removeAll(int val){
        int temp = numOfElements;
        removeFirst(val);
        while(temp != numOfElements){
            temp = numOfElements;
            removeFirst(val);
        }
    }
}