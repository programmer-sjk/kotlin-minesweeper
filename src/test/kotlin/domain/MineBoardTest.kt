package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class MineBoardTest {
    @Test
    fun `지뢰판의 초기값은 false다`() {
        assertDoesNotThrow {
            MineBoard(3, 3).boards.flatten().all { !it }
        }
    }

    @Test
    fun `지뢰를 심으면 지뢰판의 해당 값은 true다`() {
        val (width, height) = (3, 3)

        val mineBoard = MineBoard(3, 3)
        val (row, column) = ()
        mineBoard.setMines(listOf(minePoint))

        assertThat(mineBoard.boards[1]).isEqualTo(true)
    }
}