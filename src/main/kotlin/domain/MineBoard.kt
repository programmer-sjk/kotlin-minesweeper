package domain

class MineBoard (private val width: Int, height: Int) {
    val boards: Array<Array<Coordinate>>

    init {
        boards = Array(height) { y -> Array(width) { x -> Brick(x, y) } }
    }

    fun setMines(points: List<Int>) {
        for(point in points) {
            setMine(point)
        }
    }

    private fun setMine(point: Int) {
        val row = point / width
        val column = point % width

        boards[row][column] = true
    }
}