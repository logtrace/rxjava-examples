package org.logtrace.observables;


import rx.Observable;
import rx.Observer;
import rx.Subscriber;

/**
 * Created by sithum on 5/3/17.
 */
public class CreateObserverble {

    public static void main(String[] args) {
        Observable<Integer> observableString = Observable.create(
                new Observable.OnSubscribe<Integer>() {
                    @Override
                    public void call(Subscriber<? super Integer> observer) {
                        for (int i = 0; i < 5; i++) {
                            observer.onNext(i);
                        }
                        observer.onCompleted();
                    }
                }
        );

        observableString.subscribe(
                new Observer<Integer>() {
                    @Override
                    public void onCompleted() {
                        System.out.printf("Observable completed");
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println("Oh no! Something went wrong!!!!");
                    }

                    @Override
                    public void onNext(Integer integer) {
                        System.out.println(integer);
                    }
                }
        );
    }

}
