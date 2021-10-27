package com.evertonrss.businesscard

import android.app.Application
import com.evertonrss.businesscard.data.AppDatabase
import com.evertonrss.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this)}
    val repository by lazy { BusinessCardRepository(database.businessDao()) }


}
