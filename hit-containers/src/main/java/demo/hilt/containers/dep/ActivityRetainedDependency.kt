package demo.hilt.containers.dep

import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class ActivityRetainedDependency @Inject constructor() {
}