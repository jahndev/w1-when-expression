package kotlin

import java.Color

class ColorBox(var name : String,var volume : Integer)
    fun ColorBox.updateName(color: Color) {
            name = when (color) {
            Color.RED -> "red"
            Color.BLUE -> "blue"
            Color.WHITE -> "white"
        }
    }