package uz.ibrokhimov.financierapp.core.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment


abstract class BaseFragment(@LayoutRes view:Int) : Fragment(view) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onCreate(view, savedInstanceState)

    }

    abstract fun onCreate(view: View, savedInstanceState: Bundle?)

}
