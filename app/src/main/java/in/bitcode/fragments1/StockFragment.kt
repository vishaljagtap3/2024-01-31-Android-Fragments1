package `in`.bitcode.fragments1


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import java.util.Random


class StockFragment : Fragment() {

    private lateinit var txtIndexValue: TextView
    private lateinit var txtIndexPercentageChange: TextView
    private lateinit var btnRefresh : Button

    var indexValue = 65555
    var indexChangePercentage : Float = 2.33f
    private val random = Random()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.stock_fragment, null)
        txtIndexValue = view.findViewById(R.id.txtIndexValue)
        txtIndexPercentageChange = view.findViewById(R.id.txtIndexPercentageChange)
        btnRefresh = view.findViewById(R.id.btnRefresh)

        txtIndexValue.text = indexValue.toString()
        txtIndexPercentageChange.text = "${indexChangePercentage}"

        btnRefresh.setOnClickListener {
            indexValue += (random.nextInt().mod(20))
            indexChangePercentage += (random.nextInt().mod(5))

            txtIndexValue.text = "${indexValue}"
            txtIndexPercentageChange.text = "${indexChangePercentage}"
        }

        return view;

        /*val txtStockMarketName = TextView(context);
        txtStockMarketName.text = "BSE"
        txtStockMarketName.textSize = 40F
        return txtStockMarketName*/
    }

}