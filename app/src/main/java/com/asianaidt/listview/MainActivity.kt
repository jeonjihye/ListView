package com.asianaidt.listview

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import com.asianaidt.listview.adapters.StudentAdapter
import com.asianaidt.listview.datas.StudentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()
    //멤버변수 중 초기화를 나중으로 미루고 싶은 변수에 사용
    // -> context 자리에 this를 넣은 것은 setContentView 함수 이후에 넣어야함
    lateinit var mAdapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(StudentData( "전지혜" ,1995,"서울시은평구"))
        mStudentList.add(StudentData( "권홍비" ,1995,"김포시사우동"))
        mStudentList.add(StudentData( "조아란" ,1996,"서울시서초구"))
        mStudentList.add(StudentData( "박민지" ,1996,"서울시성북구"))
        mStudentList.add(StudentData( "전형욱" ,1994,"서울시성동구"))
        mStudentList.add(StudentData( "김도형" ,1994,"서울시구로구"))
        mStudentList.add(StudentData( "김주홍" ,1992,"서울시서대문구"))
        mStudentList.add(StudentData( "전관" ,1994,"서울시강동구"))
        mStudentList.add(StudentData( "송진영" ,1990,"서울시강서구"))
        mStudentList.add(StudentData( "박성빈" ,1993,"서울시중랑구"))
        mStudentList.add(StudentData( "박규성" ,1994,"서울시양천구"))
        mStudentList.add(StudentData( "이명학" ,1995,"서울시동작구"))

        mAdapter = StudentAdapter(this,R.layout.student_list_item,mStudentList)
        studentListView.adapter = mAdapter

        studentListView.setOnItemClickListener { adapterView, view, position, l ->
//            클릭된 학생을 변수에 저장
            val clickedStudent = mStudentList[position]
            Toast.makeText(this,"${clickedStudent.name} 클릭 됨",Toast.LENGTH_SHORT).show()

        }

        studentListView.setOnItemLongClickListener { adapterView, view, position, l ->

            val student = mStudentList[position]
//          진짜 해당 학생을 지울껀지 물어본다.

            AlertDialog.Builder(this)
                .setTitle("삭제확인")
                .setMessage("정말 ${student.name} 학생을 삭제 하시겠습니까?")
                .setPositiveButton("확인", DialogInterface.OnClickListener { dialogInterface, i ->
                    mStudentList.remove(student)
                    //어댑터의 변경 사항 감지 처리
                    mAdapter.notifyDataSetChanged()
                    // 학생 목록에서, 길게 눌린 학생은 삭제됨
                    Toast.makeText(this,"${student.name} 삭제 됨",Toast.LENGTH_SHORT).show()
                })
                .setNegativeButton("취소",null)
                .show()

            return@setOnItemLongClickListener true
        }

    }
}