package co.za.appbrewery.worklocal.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Oops! nothing has been added yet"
    }
    val text: LiveData<String> = _text
}