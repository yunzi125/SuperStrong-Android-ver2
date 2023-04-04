package com.superstrong.android.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.superstrong.android.R

class PaymentActivity : AppCompatActivity() {

//    // 전역 변수로 바인딩 객체 선언
//    private var mBinding: PaymentActivityMainBinding? = null
//    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
//    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.navigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener(MyNavigationListener(this))

        val NextButton : Button = findViewById(R.id.next_button);
        // findViewById 대신에 ViewBinding을 사용한다

        val BackButton : ImageView = findViewById(R.id.btn_back);

        NextButton.setOnClickListener {
            val intent = Intent(this, PaymentActivity2::class.java)
            startActivity(intent)
        }

        // TODO: toolbar 연결
        BackButton.setOnClickListener {
            val intent = Intent(this, PaymentActivity2::class.java)
            startActivity(intent)
        }
    }

}