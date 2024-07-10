package demo.hilt.bindings.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import demo.hilt.bindings.api.BizServiceImpl

@Module
@InstallIn(SingletonComponent::class)
class BizServiceImplModule {

    /**
     * Binding with Providers.
     */
    @Provides
    fun provideBiz2ServiceImpl(): BizServiceImpl {
        return BizServiceImpl()
    }
}
