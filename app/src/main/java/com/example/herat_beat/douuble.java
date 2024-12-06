package com.example.herat_beat;

public class douuble {
    private volatile static douuble instace;

    private douuble(){}

    public douuble getInstance()
    {
        if (instace==null)

        { synchronized (douuble.class){
            if (instace == null) {
                instace = new douuble();
            }
        }

        }
        return instace;
    }
}
