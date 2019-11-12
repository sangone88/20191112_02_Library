package com.tjoeun.a20191112_02_library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        var url = "http://mblogthumb2.phinf.naver.net/20160921_237/ppanppane_1474429787832yFK7y_PNG/%C4%DA%C4%AB%C4%DD%B6%F3_%B7%CE%B0%ED_%283%29.png?type=w800"

        Glide.with(this).load(url).into(profileimg)

    }


}
