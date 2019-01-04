package asterixorobelix.aboutme

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.nickname_button).setOnClickListener{
            addNickname(it)
        }
    }

    private fun addNickname(it: View) {
        val textEntry = findViewById<EditText>(R.id.nickname_edit)
        val nickNameTextView = findViewById<TextView>(R.id.nickname_display)

        nickNameTextView.text = textEntry.text

        textEntry.visibility = View.GONE
        it.visibility =View.GONE

        nickNameTextView.visibility = View.VISIBLE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(it.windowToken, 0)
    }
}
