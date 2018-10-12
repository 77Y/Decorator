package com.qiwoo.decorator;

public class ConcreteComponent extends Component {

    @Override
    public void operation() {

        System.out.println("被装饰对象");
    }

}
