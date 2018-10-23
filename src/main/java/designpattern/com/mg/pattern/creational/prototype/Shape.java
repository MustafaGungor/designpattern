package designpattern.com.mg.pattern.creational.prototype;

public abstract class Shape implements Cloneable{
    private String id;
    protected String type;
    abstract void draw();

    public String getId() {
        return id;
    }

    public String getType(){
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone(){
        Object object = null;

        try {
            object = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return object;

    }
}
