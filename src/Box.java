public class Box <T>{
   private T generic;

    public Box(T generic) {
        this.generic = generic;
    }

    public Box() {

    }

    public  T getGeneric() {
        return generic;
    }

    public void setGeneric(T generic) {
        this.generic = generic;
    }
    public static <T> Box<T> getBox(){
        return new Box<>();
    }

    @Override
    public String toString() {
        return "Box{" +
                "generic=" + generic +
                '}';
    }
}
