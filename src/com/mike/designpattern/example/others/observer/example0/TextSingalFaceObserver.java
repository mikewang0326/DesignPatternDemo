package com.mike.designpattern.example.others.observer.example0;

import java.util.Observable;

public class TextSingalFaceObserver extends SignalFaceObserver {

    @Override
    public void update(Observable o, Object arg) {
        if (null != arg) {
            NotifyEvent e = (NotifyEvent) arg;
            System.out.println("TextSingalFaceObserver update() event " + e.id);
        }
        SignalFace sf = (SignalFace) o;
        System.out.println("TextSingalFaceObserver update()" + sf.getColor());
    }
}
