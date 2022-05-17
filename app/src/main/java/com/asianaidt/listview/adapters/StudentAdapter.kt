package com.asianaidt.listview.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.asianaidt.listview.datas.StudentData

class StudentAdapter(val mContext: Context,
                     val resId : Int,
                     mList: ArrayList<StudentData>) : ArrayAdapter<StudentData>(mContext,resId,mList) {


}