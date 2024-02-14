package com.example.loginapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var loginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.login_btn)

        loginBtn.setOnClickListener {
            val username = getUsernameInput()
            val password = getPasswordInput()
            Log.i("Test Credentials", "username: $username and password: $password")
        }
    }

    private fun getUsernameInput(): String {
        return usernameInput.text.toString()
    }

    private fun getPasswordInput(): String {
        return passwordInput.text.toString()
    }
}
