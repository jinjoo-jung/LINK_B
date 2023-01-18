package com.example.linkybproject.home

import PagerFragmentStateAdapter
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.linkybproject.R
import com.example.linkybproject.databinding.FragmentHomeBinding
import com.example.linkybproject.databinding.RecyclerHomeItemBinding
import com.example.umc_week5_recyclerview.HomeAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment:Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var adapter: HomeAdapter

    val mDatas = mutableListOf<UserData>()

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root

        initDogRecyclerView()
        initializelist()

    }

        fun initDogRecyclerView() {
            val adapter = HomeAdapter() //어댑터 객체 만듦
            adapter.datalist = mDatas //데이터 넣어줌
            binding.rvHome.adapter = adapter //리사이클러뷰에 어댑터 연결
            binding.rvHome.layoutManager = LinearLayoutManager(activity) //레이아웃 매니저 연결
        }

        fun initializelist() { //임의로 데이터 넣어서 만들어봄
            with(mDatas) {
                add(UserData("", "배고픈 청설모", 20, "정보시스템공학과", "", ""))
                add(UserData("", "배고픈 청설모", 20, "정보시스템공학과", "", ""))
                add(UserData("", "배고픈 청설모", 20, "정보시스템공학과", "", ""))
                add(UserData("", "배고픈 청설모", 20, "정보시스템공학과", "", ""))
                add(UserData("", "배고픈 청설모", 20, "정보시스템공학과", "", ""))
                add(UserData("", "배고픈 청설모", 20, "정보시스템공학과", "", ""))
                add(UserData("", "배고픈 청설모", 20, "정보시스템공학과", "", ""))
                add(UserData("", "배고픈 청설모", 20, "정보시스템공학과", "", ""))
                add(UserData("", "배고픈 청설모", 20, "정보시스템공학과", "", ""))
                add(UserData("", "배고픈 청설모", 20, "정보시스템공학과", "", ""))
                add(UserData("", "배고픈 청설모", 20, "정보시스템공학과", "", ""))


            }
        }

    }



//
//        tabLayout = view.findViewById(R.id.tabLayout)
//        //viewPager = view.findViewById(R.id.main_viewpager2)
//
//        val adapter =PagerFragmentStateAdapter(this)
//        viewPager.adapter = adapter
//
//        val tabName = arrayOf<String>("재학생", "졸업생")
//
//        //슬라이드로 이동했을 때, 탭이 같이 변경되도록
//        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
//            tab.text = tabName[position].toString()
//        }.attach()
//
//        //탭이 선택되었을 때, 뷰페이저가 같이 변경되도록
//        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
//            override fun onTabSelected(tab: TabLayout.Tab?) {
//                viewPager.currentItem = tab!!.position
//            }
//
//            override fun onTabUnselected(tab: TabLayout.Tab?) {
//
//            }
//
//            override fun onTabReselected(tab: TabLayout.Tab?) {
//
//            }
//
//        })
//
//        return view
//    }

