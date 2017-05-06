package org.logtrace.observables;

import rx.Observable;
import rx.Observer;

/**
 * Created by sithum on 5/3/17.
 */
public class JustObservable {

    public static void main(String[] args) {
        Observable<String> observable = Observable.just(helloWorld());
        observable.subscribe(new Observer<String>() {
            @Override
            public void onCompleted() {
                System.out.println("Observable completed");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Oh on! Something went wrong!!!!");
            }

            @Override
            public void onNext(String s) {
                System.out.println(s);
            }
        });
    }

    private static String helloWorld() {
        return "Hello world!";
    }

}
