package com.kazu.givenwhenthen_junit

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    fun outputName(nameFlag: Int): String {
        var name = ""
        name = if (nameFlag == 1) {
            "Test"
        } else {
            "hogehoge"
        }
        return "$name-san"
    }
}