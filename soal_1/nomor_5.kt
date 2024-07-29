package soal_1

class Nomor5(val name: String, val umur: Int, val favoriteFood: String, val address: String) {
    fun <T> sayHello(param: T) {
        println("Hai $param: Nama saya adalah $name, umur saya $umur, makanan favorit saya adalah $favoriteFood, dan saya tinggal di $address.")
    }
}

