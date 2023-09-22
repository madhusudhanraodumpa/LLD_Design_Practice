package bridge;

public class LongView implements View{
    Resource resource;
    public LongView(Resource resource) {
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
