package demo.hilt.containers

import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import demo.hilt.containers.dep.ActivityDependency
import demo.hilt.containers.dep.ActivityRetainedDependency
import demo.hilt.containers.dep.SingletonDependency
import demo.hilt.containers.ui.main.MainFragment
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var singletonDependency: SingletonDependency

    @Inject
    lateinit var activityRetainedDependency: ActivityRetainedDependency

    @Inject
    lateinit var activityDependency: ActivityDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        printDependency()

        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }

        findViewById<ViewGroup>(R.id.container).addView(MyView(this))
    }

    fun printDependency() {
        println("---- MainActivity ----")
        println("singletonDependency = $singletonDependency")
        println("activityRetainedDependency = $activityRetainedDependency")
        println("activityDependency = $activityDependency")
    }
}