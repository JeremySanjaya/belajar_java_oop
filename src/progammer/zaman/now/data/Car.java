package progammer.zaman.now.data;

public interface Car extends HasBrand, IsMaintenance{

    public abstract void drive();

    int geTier();

    default boolean isBig(){
        return false;
    }
}
