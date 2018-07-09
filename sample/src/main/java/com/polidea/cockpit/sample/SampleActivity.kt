package com.polidea.cockpit.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.polidea.cockpit.sample.sampleparams.SampleFragment
import com.polidea.cockpit.sample.sampleparams.SamplePresenter
import com.polidea.cockpit.sample.util.replaceFragmentInActivity

class SampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        val sampleFragment = supportFragmentManager.findFragmentById(R.id.contentFrame)
                as SampleFragment? ?: SampleFragment.newInstance().also {
            replaceFragmentInActivity(it, R.id.contentFrame)
        }

        SamplePresenter(sampleFragment)
    }
}