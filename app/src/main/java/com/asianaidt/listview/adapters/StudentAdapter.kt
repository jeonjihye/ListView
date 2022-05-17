package com.asianaidt.listview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.asianaidt.listview.R
import com.asianaidt.listview.datas.StudentData

class StudentAdapter(val mContext: Context,
                     val resId : Int,
                     val mList: ArrayList<StudentData>) : ArrayAdapter<StudentData>(mContext,resId,mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if(tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, null)
        }
//        tempRow는 Null 이 들어있을 가능성이 없다!
        val row = tempRow!! // row 가 리스트뷰의 한 줄에 해당하는 그림(View 타입)

//        화면에 뿌려지기 전에, row 내부를 수정하자!
        val data = mList[position]
//        실제연결
        val txtName = row.findViewById<TextView>(R.id.txtName)
        val txtAge = row.findViewById<TextView>(R.id.txtAge)
        val txtAddress = row.findViewById<TextView>(R.id.txtAddress)

        txtName.text = data.name
        txtAddress.text = data.address
        txtAge.text = "${data.getKoreanAge()}세"

//        만들어진 row의 그림이 리스트뷰에 뿌려짐
        return row
    }

}