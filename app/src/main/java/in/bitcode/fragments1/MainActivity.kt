package `in`.bitcode.fragments1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var stockFragment: StockFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stockFragment =
        supportFragmentManager.findFragmentById(R.id.stockFragment) as StockFragment

        stockFragment.indexValue = 69999
        stockFragment.indexChangePercentage = 2.345f
    }
}