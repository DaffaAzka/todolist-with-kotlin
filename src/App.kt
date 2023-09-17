val notes: MutableList<String> = mutableListOf()

fun main() {

    while (true) {
        println("========================")
        showData()
        println("========================")
        println("t. Tambah")
        println("e. Edit")
        println("d. Delete")
        println("========================")
        print("input: ")
        val temp: String = readln()

        if (temp == "t") {
            showAdd()
        } else if(temp == "e") {
            showEdit()
        } else if(temp == "d") {
            showDelete()
        } else {
            break
        }
    }

}

fun showData() {
    if (notes.isEmpty()) {
        println("Tidak ada note untuk saat ini!")
    } else {
        var temp = 1
        for (note in notes) {
            print(temp++)
            print(". $note")
            println("")
        }
    }
}

fun showAdd() {
    println("========================")
    print("Masukan note yang ingin ditambah: ")
    val temp = readln()
    if (addToDo(temp)) {
        println("note berhasil ditambahkan")
    } else {
        println("note gagal ditambahkan")
    }
}

fun showDelete() {
    println("========================")
    print("Masukan id note yang ingin dihapus: ")
    val i = readln().toInt()
    deleteToDo(i)
    println("Note berhasil dihapus")
}

fun showEdit() {
    println("========================")
    print("Masukan id note yang ingin diubah: ")
    val i = readln().toInt()
    print("Masukan note yang ingin diubah: ")
    val temp = readln()
    if (editToDo(i, temp)) {
        println("note berhasil diubah")
    } else {
        println("note gagal diubah")
    }
}

fun addToDo(s: String?): Boolean {
    if (s != null) {
        notes.add(s)
        return true
    }
    return false
}

fun deleteToDo(n: Int) {
    notes.removeAt(n - 1)
}

fun editToDo(n: Int, s: String?): Boolean {
    if (s != null) {
        notes[n-1] = s
        return true
    }
    return false
}