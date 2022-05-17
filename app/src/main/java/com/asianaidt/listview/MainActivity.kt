package com.asianaidt.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asianaidt.listview.datas.StudentData

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(StudentData( "전지혜" ,1999,"서울시은평구"))
        mStudentList.add(StudentData( "권홍비" ,1999,"김포시사우동"))
        mStudentList.add(StudentData( "조아란" ,1999,"서울시서초구"))
        mStudentList.add(StudentData( "박민지" ,1999,"서울시성북구"))
        mStudentList.add(StudentData( "전형욱" ,1999,"서울시성동구"))
        mStudentList.add(StudentData( "김도형" ,1999,"서울시구로구"))
        mStudentList.add(StudentData( "김주홍" ,1999,"서울시서대문구"))
        mStudentList.add(StudentData( "전관" ,1999,"서울시강동구"))
        mStudentList.add(StudentData( "송진영" ,1999,"서울시강서구"))
        mStudentList.add(StudentData( "박성빈" ,1999,"서울시중랑구"))
        mStudentList.add(StudentData( "박규성" ,1999,"서울시양천구"))
        mStudentList.add(StudentData( "이명학" ,1999,"서울시동작구"))









    }
}