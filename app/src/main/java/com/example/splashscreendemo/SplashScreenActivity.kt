package com.example.splashscreendemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Toast.makeText(this,"ONCREATE CALLED",Toast.LENGTH_LONG).show()

        val handler:Handler=Handler()

        handler.postDelayed({
            val i= Intent(this,HomeActivity::class.java)
            startActivity(i)
            finish()
        },4000 )


    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"ONStart CALLED",Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"ONResume CALLED",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"ONPause CALLED",Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"ONStop CALLED",Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"ONRestyart CALLED",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"ONDestroy CALLED",Toast.LENGTH_LONG).show()
    }
}