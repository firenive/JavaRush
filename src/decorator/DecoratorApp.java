package decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        PrinterInterface printer = new Printer("Value");
        printer.print();
        System.out.println();

        PrinterInterface useDecorator = new QuotesDecorator(new Printer("Hello"));
        useDecorator.print(); // "Hello"
        System.out.println();



        PrinterInterface leftBracketDecorator = new RightBracketDecorator(new Printer("List values"));
        leftBracketDecorator.print(); // {List values
        System.out.println();
        // Допустимо использование сразу нескольких декораторов. Рассмотрим на примере декоратора с правой и левой скобкой

        PrinterInterface bothBracketDecorator = new LeftBracketDecorator(new RightBracketDecorator(new Printer("Check Bracket")));
        bothBracketDecorator.print(); // {Check Bracket}
        System.out.println();

        PrinterInterface allDecorators = new QuotesDecorator(
                new LeftBracketDecorator(
                        new RightBracketDecorator(
                                new Printer("All Decorators"))));
        allDecorators.print(); // "{All Decorators}"
        System.out.println();

        PrinterInterface allDecorators2 =
                new LeftBracketDecorator(
                        new LeftBracketDecorator(
                                new RightBracketDecorator(
                                        new QuotesDecorator(
                                                new Printer("All Decorators")))));
        allDecorators2.print();

    }
}

interface PrinterInterface { // Интерфейс, означающий функцию печати
    void print();
}

class Printer implements PrinterInterface { // Конкретный класс принтер, реализующий функцию печати
    String value;

    public Printer(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}

abstract class Decorator implements PrinterInterface {
    PrinterInterface component;

    public Decorator(PrinterInterface component) {
        this.component = component;
    }

    @Override
    public void print() {
        component.print();
    }
}

class QuotesDecorator extends Decorator { // Класс декоратор. В качестве примера в методе print
    // будем оборачивать переданныый текст в кавычки

    public QuotesDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }
}

class LeftBracketDecorator extends Decorator {

    public LeftBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("{");
        super.print();

    }
}

class RightBracketDecorator extends Decorator {
    public RightBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("}");

    }
}