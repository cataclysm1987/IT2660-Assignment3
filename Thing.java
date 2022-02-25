public class Thing {
    public int Id;
    public String Name;

    public Thing(){

    }

    public Thing(int id, String name){
        Id = id;
        Name = name;
    }

    public Thing(Thing thing){
        Id = thing.Id;
        Name = thing.Name;
    }

    public Thing DeepCopy(){
        return new Thing(this);
    }
}