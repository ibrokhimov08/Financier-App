package uz.ibrokhimov.financierapp.ui.sign

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.activityViewBinding
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.ibrokhimov.financierapp.R
import uz.ibrokhimov.financierapp.core.base.BaseFragment
import uz.ibrokhimov.financierapp.databinding.ScreenSignBinding

class SignScreen : BaseFragment(R.layout.screen_sign) {

    private val binding by viewBinding(ScreenSignBinding::bind)


    override fun onCreate(view: View, savedInstanceState: Bundle?) {



    }
}