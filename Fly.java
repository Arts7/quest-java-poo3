public interface Fly {

    void takeOff();
    void land();
    default void glide(){System.out.println("It glides into the air.");}
    int ascend(int meters);
    int descend(int meters);

}