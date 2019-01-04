package asterixorobelix.aboutme

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import asterixorobelix.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.nicknameButton.setOnClickListener{
            addNickname(it)
        }
    }

    private fun addNickname(it: View) {
        val textEntry = binding.nicknameEdit
        val nickNameTextView = binding.nicknameDisplay

        nickNameTextView.text = textEntry.text

        textEntry.visibility = View.GONE
        it.visibility =View.GONE

        nickNameTextView.visibility = View.VISIBLE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(it.windowToken, 0)
    }
}
