package com.melorriaga.kokemon

import android.app.Application
import com.melorriaga.kokemon.injection.component.ApplicationComponent
import com.melorriaga.kokemon.injection.component.DaggerApplicationComponent
import com.melorriaga.kokemon.injection.module.ApplicationModule
import com.melorriaga.kokemon.injection.module.DataModule

open class KokemonApp : Application() {

    open val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .dataModule(DataModule(BuildConfig.BASE_URL))
                .build()
    }

}
