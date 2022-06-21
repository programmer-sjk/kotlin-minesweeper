package view

object UI {
    fun displays(boards: Array<Array<Boolean>>) {
        for(board in boards) {
            display(board)
            println()
        }
    }

    private fun display(board: Array<Boolean>) {
        board.map { value -> if (value) print("X") else print("O") }
    }
}