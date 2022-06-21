import domain.Brick
import domain.MineBoard
import view.UI
import java.util.*

fun main() {
    println("높이를 입력하세요.")
    val height = readln().toInt()

    println("너비를 입력하세요.")
    val width = readln().toInt()

    println("지뢰는 몇 개인가요?")
    val count = readln().toInt()
    val minePoints = (0 until count).map { minePoint(width * height) }.sorted()

    println("지뢰찾기 게임 시작")
    val mineBoard = MineBoard(width, height)
    mineBoard.setMines(minePoints)
    UI.displays(mineBoard.boards)
}

fun minePoint(max: Int): Int {
    return Random().nextInt(max)
}