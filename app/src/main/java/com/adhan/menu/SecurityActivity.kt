package com.adhan.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_security.*

class SecurityActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_security)
        var name= intent.extras?.getString("name")
        var phone=intent.extras?.getString("phone")

        txtName.text=name
        txtPhone.text=phone
    }
}
