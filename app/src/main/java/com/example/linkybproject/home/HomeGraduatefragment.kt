package com.example.linkybproject.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.linkybproject.R
import com.example.linkybproject.databinding.FragmentHomeGraduateBinding

class HomeGraduatefragment :Fragment(){
        companion object {
            fun newInstance() : HomeFragment  = HomeFragment()
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
        }

        override fun onAttach(context: Context) {
            super.onAttach(context)
        }

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            return inflater.inflate(R.layout.fragment_home_graduate, container, false)
        }
    }
