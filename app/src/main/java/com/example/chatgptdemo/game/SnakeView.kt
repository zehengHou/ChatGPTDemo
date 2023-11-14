package com.example.chatgptdemo.game

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import java.util.LinkedList

class SnakeView : View {
    // 第一个构造函数
    constructor(context: Context) : super(context) {
        init(null, 0)
    }

    // 第二个构造函数
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(attrs, 0)
    }

    // 第三个构造函数
    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        init(attrs, defStyle)
    }

    // 初始化方法
    private fun init(attrs: AttributeSet?, defStyle: Int) {
        // 这里可以添加初始化代码
    }

    var snake: LinkedList<Pair<Int, Int>> = LinkedList()
    var food: Pair<Int, Int>? = null
    var obstacles: List<Pair<Int, Int>> = listOf()

    // 获取蛇每一段的大小
    val snakeBlockSize: Int
        get() = width / 20  // 假设游戏区域被分为20个块

    // 获取视图的宽度和高度
    val viewWidth: Int
        get() = width

    val viewHeight: Int
        get() = height

    private val snakePaint = Paint().apply {
        color = Color.GREEN
        style = Paint.Style.FILL
    }

    private val foodPaint = Paint().apply {
        color = Color.RED
        style = Paint.Style.FILL
    }

    private val obstaclePaint = Paint().apply {
        color = Color.GRAY
        style = Paint.Style.FILL
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        snake.forEach {
            canvas.drawRect(
                it.first * 30f,
                it.second * 30f,
                (it.first + 1) * 30f,
                (it.second + 1) * 30f,
                snakePaint
            )
        }

        food?.let {
            canvas.drawRect(
                it.first * 30f,
                it.second * 30f,
                (it.first + 1) * 30f,
                (it.second + 1) * 30f,
                foodPaint
            )
        }

        obstacles.forEach {
            canvas.drawRect(
                it.first * 30f,
                it.second * 30f,
                (it.first + 1) * 30f,
                (it.second + 1) * 30f,
                obstaclePaint
            )
        }
    }
}
