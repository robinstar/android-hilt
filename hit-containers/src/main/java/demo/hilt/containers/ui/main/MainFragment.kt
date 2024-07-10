package demo.hilt.containers.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import demo.hilt.containers.R
import demo.hilt.containers.dep.ActivityDependency
import demo.hilt.containers.dep.ActivityRetainedDependency
import demo.hilt.containers.dep.FragmentDependency
import demo.hilt.containers.dep.SingletonDependency
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    @Inject
    lateinit var singletonDependency: SingletonDependency

    @Inject
    lateinit var activityRetainedDependency: ActivityRetainedDependency

    @Inject
    lateinit var activityDependency: ActivityDependency

    @Inject
    lateinit var fragmentDependency: FragmentDependency

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.printDependency()
        printDependency()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    fun printDependency() {
        println("---- MainFragment ----")
        println("singletonDependency = $singletonDependency")
        println("activityRetainedDependency = $activityRetainedDependency")
        println("activityDependency = $activityDependency")
        println("fragmentDependency = $fragmentDependency")
    }
}