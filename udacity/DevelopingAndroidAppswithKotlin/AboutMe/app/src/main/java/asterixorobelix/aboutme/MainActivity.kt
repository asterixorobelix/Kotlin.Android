package asterixorobelix.aboutme

import android.content.Context
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.inputmethod.InputMethodManager
import asterixorobelix.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val _myName: MyName = MyName("Asterixorobelix", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = _myName

        binding.nicknameButton.setOnClickListener {
            addNickname(it)
        }
    }

    private fun addNickname(it: View) {
        binding.apply {
            myName?.nickname = nicknameEdit.text.toString()
            val textEntry = binding.nicknameEdit
            val nickNameTextView = binding.nicknameDisplay
            textEntry.visibility = View.GONE
            it.visibility = View.GONE

            nickNameTextView.visibility = View.VISIBLE
            invalidateAll()
        }

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(it.windowToken, 0)
    }
}
