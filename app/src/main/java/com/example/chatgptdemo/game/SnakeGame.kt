package com.example.chatgptdemo.game

import android.app.Activity
import android.media.MediaPlayer
import androidx.lifecycle.MutableLiveData
import java.util.LinkedList

class SnakeGame(private val view: SnakeView, private val activity: Activity) {
    private val width = 20
    private val height = 20
    private var snake = LinkedList<Pair<Int, Int>>()
    private var food = Pair(0, 0)
    private var direction = Pair(0, -1)
    private var isGameOver = false
    private var score = MutableLiveData<Int>()
    private var obstacles = listOf<Pair<Int, Int>>()

//    private val eatSound: MediaPlayer = MediaPlayer.create(activity, R.raw.eat_sound)
//    private val gameOverSound: MediaPlayer = MediaPlayer.create(activity, R.raw.game_over_sound)

    init {
        resetGame()
    }

    private fun resetGame() {
        snake.clear()
        snake.add(Pair(width / 2, height / 2))
        generateFood()
        generateObstacles()
        score.value = 0
        isGameOver = false
        direction = Pair(0, -1)
    }

    private fun generateFood() {
        // ...
    }

    private fun generateObstacles() {
        // ...
    }

    fun updateDirection(x: Float, y: Float) {
        val snakeHead = snake.first()
        val blockSize = view.snakeBlockSize
        val headX = snakeHead.first * blockSize
        val headY = snakeHead.second * blockSize

        // 比较触摸点与蛇头的坐标，以确定新方向
        // ...[现有的方向判断逻辑]...
    }


    private fun moveSnake() {
        // ...
    }

    private fun checkCollision() {
        // ...
    }

    private fun updateScore() {
        // ...
    }

    fun draw() {
        view.snake = snake
        view.food = food
        view.obstacles = obstacles
        view.invalidate()
    }

    private fun gameLoop() {
        Thread {
            // ...
        }.start()
    }

    fun run() {
        gameLoop()
    }
}
