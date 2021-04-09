import java.io.*;
import java.util.*;


public abstract class Data implements Serializable {
    private static Hashtable<Class, ArrayList<Data>> dataMap= new Hashtable<>();

    public Data() throws Exception {
        ArrayList<Data> dataList= null;
        Class name = this.getClass();
        if(dataMap.containsKey(name)){
            dataList= dataMap.get(name);
        }
        else{
            dataList= new ArrayList<>();
            dataMap.put(name,dataList);
        }
        dataList.add(this);
    }
    public static void writeData(ObjectOutputStream stream) {
        try{
            stream.writeObject(dataMap);
        }catch(IOException ex){
            ex.printStackTrace();
        }

    }
    public static void readData(ObjectInputStream stream){
        try{
            dataMap=(Hashtable) stream.readObject();
        }catch(IOException ex){
            ex.printStackTrace();
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

    public static <T> Iterable<T> getExtent(Class<T> type) throws ClassNotFoundException {
        if(dataMap.containsKey(type)) {
            return (Iterable<T>) dataMap.get(type);
        }
        throw new ClassNotFoundException(
                String.format("%s. Stored extents: %s",
                        type.toString(),
                        dataMap.keySet()));
    }
}


