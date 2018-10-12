package com.qiwoo.decorator;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();

        addDecoratorA("A");
    }

    private void addDecoratorA(String decorator) {
        System.out.println("给对象装饰" + decorator);
    }
}
