import java.util.ArrayList

class ConcreteObservable() : `Observable's` {

    private var list = mutableListOf<`Observer's'`>()


    override fun registerObserver(observer: `Observer's'`) {

        list.add(observer)

    }

    override fun removeObserver(observer: `Observer's'`) {

        list.remove(observer)

    }

    override fun notifyObserver(string: String) {

        list.forEach { e -> e.update(string) }

    }

    override fun trigger() {

        val str = "New data"

        notifyObserver(str)

    }
}