package com.android.prathamesh.simpledagger;

import android.app.Application;

public class MyApplication extends Application {

    private MyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myComponent = createMyComponent();
    }

    MyComponent getMyComponent(){
        return myComponent;
    }

    private MyComponent createMyComponent(){
        return DaggerMyComponent.builder().myModule(new MyModule()).build();
    }
}
