import java.awt.image.ImageObserver

interface `Observable's` {

    fun registerObserver(observer: `Observer's'`)

    fun removeObserver(observer: `Observer's'`)

    fun notifyObserver(string: String)

    fun trigger()
}