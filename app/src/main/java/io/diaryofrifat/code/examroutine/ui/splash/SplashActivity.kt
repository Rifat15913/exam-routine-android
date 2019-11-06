package io.diaryofrifat.code.examroutine.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.diaryofrifat.code.examroutine.ui.decisionmaker.SelectExamActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(
                Intent(this, SelectExamActivity::class.java).apply {
                    this.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
                    this.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
        )
    }
}