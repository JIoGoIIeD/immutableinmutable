package ImmutbleInmutable;

public final class ImmutableClass {
private final MutableClass prl;


    public ImmutableClass(MutableClass prl) {
        this.prl = prl.println();
    }

    public MutableClass getPrl() {
        return prl;//возвращение копии Имени в println
    }
    public String getName(){
        return prl.getName();
    }
}
