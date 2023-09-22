package bridge;

public class ShortView implements View{

    Resource resource;
    public ShortView(Resource resource) {
        this.resource = resource;
    }
    @Override
    public void show() {
        resource.snippet();
    }

    @Override
    public void button() {
        resource.url();

    }
}
