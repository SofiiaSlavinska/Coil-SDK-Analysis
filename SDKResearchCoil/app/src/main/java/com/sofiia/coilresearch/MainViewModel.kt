package com.sofiia.coilresearch

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {
    val imageUrls = MutableLiveData<List<String>>()

    init {
        val list = mutableListOf<String>()
        for (i in 1..1000) {
            list.add("https://picsum.photos/seed/${i + 100}/800/600")
        }
        imageUrls.value = list
    }
}