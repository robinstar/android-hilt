package demo.hilt.bindings.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import demo.hilt.bindings.api.BizService
import demo.hilt.bindings.api.BizServiceImpl

@Module
@InstallIn(SingletonComponent::class)
abstract class BizServiceModule {

    /**
     * Binding with Binds.
     */
    @Binds
    abstract fun provideBizService(impl: BizServiceImpl): BizService
}
