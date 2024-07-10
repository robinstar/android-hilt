package demo.hilt.bindings.data

import demo.hilt.bindings.api.BizService
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Binding with constructor injection.
 */
@Singleton
class BizRepository @Inject constructor(
    private val service: BizService
) {
    fun getUserName(): String = service.requestUser()
}
