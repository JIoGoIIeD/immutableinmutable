package ImmutbleInmutable;

public class MutableClass {
    public String name;
     public MutableClass(String name){
         this.name=name;
            name="Gera";
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public MutableClass println(){
         return new MutableClass(this.name);
    }
}
