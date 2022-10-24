import java.awt.Rectangle;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int width = 10;
        int height = 20;

        int newX = 5;
        int newY = 5;

        double area;
        double perimeter;

        Rectangle box = new Rectangle(x,y,width,height);

        box.setLocation(newX,newY);

        int i;
        for(i=0;i<3;i++){
            Rectangle newBox = new Rectangle(box.x + box.width, box.y,width,height);
            box.add(newBox);
        }
        perimeter = (box.width + box.height)*2;
        area = box.height * box.width;
        System.out.println(box);
        System.out.println(area);
        System.out.println(perimeter);

    }
}