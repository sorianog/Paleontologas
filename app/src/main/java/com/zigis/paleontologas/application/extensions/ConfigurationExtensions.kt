package com.zigis.paleontologas.application.extensions

import android.content.res.Configuration
import android.os.Build
import java.util.*

fun Configuration.getCurrentLocale(): Locale {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        this.locales.get(0)
    } else {
        this.locale
    }
}