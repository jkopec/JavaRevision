public class Type {
    private static void get(Object obj){
        System.out.println(obj);
        System.out.println(obj.getClass());
    }

    public static void main(String[] args){
        get(3/9);
    }
}
