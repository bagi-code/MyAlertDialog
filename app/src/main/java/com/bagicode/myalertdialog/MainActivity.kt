package com.bagicode.myalertdialog

import android.content.DialogInterface
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_show.setOnClickListener {

//            default
//            var builder = AlertDialog.Builder(this)
//            builder.setTitle("Title")
//            builder.setMessage("Text Desc");
//            builder.setCancelable(false)
//                    .setPositiveButton("Yes"){dialog, which ->
//                        dialog.dismiss()
//                    }
//                .setNegativeButton("Cancel"){dialog, which ->
//                    dialog.dismiss()
//                }
//
//            var alertdialog = builder.create()
//            alertdialog.show()

//            custom
//            var builder = AlertDialog.Builder(this)
//            builder.setTitle("Error")
//            builder.setMessage("Hello ini adalah desc");
//            builder.setCancelable(false)
//                    .setPositiveButton("Dismiss"){dialog, which ->
//                        dialog.dismiss()
//                    }
//            var alertdialog = builder.create()
//            alertdialog.show()
//            alertdialog.window?.setGravity(Gravity.TOP)
//            alertdialog.window?.setBackgroundDrawableResource(R.color.colorPrimary)
//            alertdialog.window?.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//
//            val buttonPositife = alertdialog.getButton(DialogInterface.BUTTON_POSITIVE)
//            buttonPositife.setTextColor(Color.YELLOW)

        }
    }
}
