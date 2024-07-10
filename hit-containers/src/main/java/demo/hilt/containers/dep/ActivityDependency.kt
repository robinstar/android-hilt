package demo.hilt.containers.dep

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class ActivityDependency @Inject constructor() {
}