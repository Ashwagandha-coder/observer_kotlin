fun main() {

    val concreteObservable = ConcreteObservable()
    val concreteObserver = ConcreteObserver()

    concreteObservable.registerObserver(concreteObserver)
    concreteObservable.trigger()



}