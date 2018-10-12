package com.qiwoo.decorator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ConcreteComponent component = new ConcreteComponent();

        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(component);

        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(component);

        decoratorA.operation();

        decoratorB.operation();
    }
}
