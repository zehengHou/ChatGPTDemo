package com.example.chatgptdemo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.chatgptdemo.game.SnakeGame
import com.example.chatgptdemo.game.SnakeView

class MainActivity : AppCompatActivity() {
    private lateinit var snakeGame: SnakeGame
    private lateinit var snakeView: SnakeView
    private lateinit var pauseButton: Button
    private lateinit var scoreTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        snakeView = findViewById(R.id.snake_view)
        pauseButton = findViewById(R.id.pause_button)
        scoreTextView = findViewById(R.id.score_text_view)

        snakeGame = SnakeGame(snakeView, this)

        snakeView.setOnTouchListener { _, event ->
            snakeGame.updateDirection(event.x, event.y)
            true
        }

        pauseButton.setOnClickListener {
            // ...
        }

        snakeGame.run()
    }

    // ...
}
