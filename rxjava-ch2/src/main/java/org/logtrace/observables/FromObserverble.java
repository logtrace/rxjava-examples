package org.logtrace.observables;

import rx.Observable;
import rx.Observer;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sithum on 5/3/17.
 */
public class FromObserverble {

    public static void main(String[] args) {
        List<Integer> items = Arrays.asList(1, 10, 100, 200);

        Observable<Integer> observable = Observable.from(items);
        observable.subscribe(new Observer<Integer>() {
            @Override
            public void onCompleted() {
                System.out.println("Observable completed");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Oh no! Something went wrong!!!!");
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println(integer);
            }
        });
    }
}
