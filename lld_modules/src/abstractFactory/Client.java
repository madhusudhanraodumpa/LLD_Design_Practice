package abstractFactory;

import abstractFactory.components.Button.Button;

public class Client {
    public static void main(String[] args) {
      /*  Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatform.ANDROID);

        Button button = uiFactory.createButton();
        button.changeSize();*/
        Integer a =10;
        Integer b =20;
        swap(a,b);
        System.out.println(a+" , "+b);
    }

    private static void swap(Integer a, Integer b) {
        Integer temp=new Integer(a);
        b=new Integer(a);
        a=temp;
    }
}
