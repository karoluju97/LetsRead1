package ie.wit.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import ie.wit.R
import ie.wit.main.ReaditApp
import ie.wit.models.ReaditModel

import kotlinx.android.synthetic.main.activity_readit.*
import kotlinx.android.synthetic.main.content_readit.*

class Readit : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_readit)
        setSupportActionBar(toolbar)

        post_button.setOnClickListener{
            if(book_name.text.isNotEmpty() && author.text.isNotEmpty() && Genre.text.isNotEmpty() && year_released.toString().isNotEmpty() && summary.text.isNotEmpty())
            {

                book_name.text.toString()
                author.text.toString()
                Genre.text.toString()
                year_released.text.toString()
                summary.text.toString()

            }

            else{



            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_post, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_post -> {startActivity(Intent(this,Post::class.java))
            true
            }
            else->super.onOptionsItemSelected(item)
        }
    }
}

