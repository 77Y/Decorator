package com.qiwoo.decorator;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();

        addDecoratorB("B");
    }

    private void addDecoratorB(String decorator) {
        System.out.println("给对象装饰" + decorator);
    }
}
