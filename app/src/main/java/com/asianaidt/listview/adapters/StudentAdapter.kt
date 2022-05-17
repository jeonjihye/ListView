package com.asianaidt.listview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.asianaidt.listview.R
import com.asianaidt.listview.datas.StudentData

class StudentAdapter(val mContext: Context,
                     val resId : Int,
                     mList: ArrayList<StudentData>) : ArrayAdapter<StudentData>(mContext,resId,mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if(tempRow == null) {

            tempRow = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, null)


        }
//        tempRow는 Null 이 들어있을 가능성이 없다!
        val row = tempRow!! // row 가 리스트뷰의 한 줄에 해당하는 그림(View 타입)
        return row

    }

}