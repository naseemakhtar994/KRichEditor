package com.ebolo.krichtexteditor.ui.widgets

import android.content.Context
import android.support.annotation.IntRange
import com.ebolo.krichtexteditor.R

class ActionImageView(private val context: Context, val type: Int) {
    var activatedColor: Int = R.color.colorAccent
    var deactivatedColor: Int = R.color.tintColor

    companion object {
        const val NONE = 0

        // FONT
        const val FAMILY = 1
        const val SIZE = 2
        const val LINE_HEIGHT = 3
        const val FORE_COLOR = 4
        const val BACK_COLOR = 5

        // Format
        const val BOLD = 6
        const val ITALIC = 7
        const val UNDERLINE = 8
        const val SUBSCRIPT = 9
        const val SUPERSCRIPT = 10
        const val STRIKETHROUGH = 11

        // Style
        const val NORMAL = 12
        const val H1 = 13
        const val H2 = 14
        const val H3 = 15
        const val H4 = 16
        const val H5 = 17
        const val H6 = 18

        //Justify
        const val JUSTIFY_LEFT = 19
        const val JUSTIFY_CENTER = 20
        const val JUSTIFY_RIGHT = 21
        const val JUSTIFY_FULL = 22

        // List Style
        const val ORDERED = 23
        const val UNORDERED = 24

        const val INDENT = 25
        const val OUTDENT = 26

        // Insert
        const val IMAGE = 27
        const val LINK = 28
        const val TABLE = 29
        const val LINE = 30

        const val BLOCK_QUOTE = 31
        const val BLOCK_CODE = 32

        const val CODE_VIEW = 33

        // Actions
        const val UNDO = 34
        const val REDO = 35

        @IntRange(from = 0, to = 35)
        @Retention(AnnotationRetention.SOURCE)
        annotation class ActionType

        val actionButtonDrawables by lazy {
            mapOf(
                    BOLD to R.drawable.ic_format_bold,
                    ITALIC to R.drawable.ic_format_italic,
                    UNDERLINE to R.drawable.ic_format_underlined,
                    STRIKETHROUGH to R.drawable.ic_format_strikethrough,
                    SUBSCRIPT to R.drawable.ic_format_subscript,
                    SUPERSCRIPT to R.drawable.ic_format_superscript,
                    NORMAL to R.drawable.ic_format_para,
                    H1 to R.drawable.ic_format_h1,
                    H2 to R.drawable.ic_format_h2,
                    H3 to R.drawable.ic_format_h3,
                    H4 to R.drawable.ic_format_h4,
                    H5 to R.drawable.ic_format_h5,
                    H6 to R.drawable.ic_format_h6,
                    INDENT to R.drawable.ic_format_indent_decrease,
                    OUTDENT to R.drawable.ic_format_indent_increase,
                    JUSTIFY_LEFT to R.drawable.ic_format_align_left,
                    JUSTIFY_CENTER to R.drawable.ic_format_align_center,
                    JUSTIFY_RIGHT to R.drawable.ic_format_align_right,
                    JUSTIFY_FULL to R.drawable.ic_format_align_justify,
                    ORDERED to R.drawable.ic_format_list_numbered,
                    UNORDERED to R.drawable.ic_format_list_bulleted,
                    LINE to R.drawable.ic_line,
                    BLOCK_CODE to R.drawable.ic_code_block,
                    BLOCK_QUOTE to R.drawable.ic_format_quote,
                    CODE_VIEW to R.drawable.ic_code_review
            )
        }
    }
}