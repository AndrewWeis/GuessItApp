package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    init {
        Log.i("MVVM", "GameViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("MVVM", "GameViewModel destroyed!")
    }
}

