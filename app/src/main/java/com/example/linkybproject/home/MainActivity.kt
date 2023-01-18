package com.example.linkybproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.linkybproject.R
import com.example.linkybproject.databinding.ActivityFilterBinding
import com.example.linkybproject.databinding.ActivityMainBinding
import com.example.linkybproject.databinding.FragmentHomeBinding
import com.example.linkybproject.home.HomeFragment
import com.example.linkybproject.home.HomeStudentFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(binding.flMain.id, HomeFragment())
            .commitAllowingStateLoss()
        }

//        binding.hyuna.setOnClickListener {
//            val intent = Intent(this, HomeFragment::class.java)
//            startActivity(intent)
//        }
    }



//        // 1) ViewPager2 참조, TabLayout참조
//        val viewPager: ViewPager2 = homeBinding.mainViewpager2
//        val tabLayout:TabLayout = homeBinding.tabLayout
//
//        // 2) FragmentStateAdapter 생성 : Fragment 여러개를 ViewPager2에 연결해주는 역할
//        val viewpagerFragmentAdapter = ViewPagerFragmentAdapter(supportFragmentManager)
//
//        // 3) ViewPager2의 adapter에 설정
//        viewPager.adapter = viewpagerFragmentAdapter
//
//        // ###### TabLayout과 ViewPager2를 연결
//        // 1. 탭메뉴의 이름을 리스트로 생성해둔다.
//        val tabTitles: List<String> = Arrays.asList("재학생","졸업생")
//
//        // 2. TabLayout과 ViewPager2를 연결하고, TabItem의 메뉴명을 설정한다
//        TabLayoutMediator(tabLayout, viewPager,
//            {tab, position -> tab.text = tabTitles[position]}).attach()
//
//    }

