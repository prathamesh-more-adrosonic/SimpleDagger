package com.android.prathamesh.simpledagger;

import java.util.Date;

class MyExampleImpl implements MyExample {

    private long date;

    MyExampleImpl(){

        date = new Date().getTime();

    }

    @Override
    public long getDate() {
        return date;
    }
}
