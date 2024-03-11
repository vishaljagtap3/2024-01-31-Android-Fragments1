package `in`.bitcode.fragments1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class CurrencyFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val txtCurrencyTitle = TextView(context);
        txtCurrencyTitle.text = "$1 = INR 81.23"
        txtCurrencyTitle.textSize = 40F
        return txtCurrencyTitle
    }

}