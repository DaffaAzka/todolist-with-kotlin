val notes: MutableList<String> = mutableListOf()

fun main() {

    addToDo("Dest")
    addToDo("Reicader")
    addToDo("Delta")

    deleteToDo(2)

    editToDo(2, "Mid")

    showData()

}

fun showData() {
    if (notes.isEmpty()) {
        println("Tidak ada note untuk saat ini!")
    } else {
        var temp: Int = 1;
        for (note in notes) {
            print(temp++);
            print(". $note")
            println("")
        }
    }
}

fun addToDo(s: String?) {
    if (s != null) {
        notes.add(s)
    }
}

fun deleteToDo(n: Int) {
    notes.removeAt(n - 1)
}

fun editToDo(n: Int, s: String?) {
    if (s != null) {
        notes.set(n-1, s)
    }
}