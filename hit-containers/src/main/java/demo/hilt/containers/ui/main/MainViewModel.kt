package demo.hilt.containers.ui.main

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import demo.hilt.containers.dep.ActivityRetainedDependency
import demo.hilt.containers.dep.SingletonDependency
import demo.hilt.containers.dep.ViewModelDependency
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val singletonDependency: SingletonDependency,
    private val activityRetainedDependency: ActivityRetainedDependency,
    private val viewModelDependency: ViewModelDependency,
) : ViewModel() {

    fun printDependency() {
        println("---- MainViewModel ----")
        println("singletonDependency = $singletonDependency")
        println("activityRetainedDependency = $activityRetainedDependency")
        println("viewModelDependency = $viewModelDependency")
    }
}
