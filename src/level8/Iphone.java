package level8;

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //напишите тут ваш код
    @Override
    public boolean equals(Object object) {

        if (object == null) return false;
        if (!(object instanceof Iphone)) return false;
        Iphone iphone = (Iphone) object;
        if (this.price != iphone.price) return false;
        if (this.model == null) return iphone.model == null;
        if (this.color == null) return iphone.color == null;
        return this.model.equals(iphone.model) && this.color.equals(iphone.color);
    }

    public static void main(String[] args) {
        var iphone1 = new Iphone("X", "Blck", 999);
        var iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }
}
