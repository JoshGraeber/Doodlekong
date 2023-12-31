package com.jigcoding.doodlekong.ui.setup.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.jigcoding.doodlekong.databinding.FragmentUsernameBinding

class UsernameFragment : Fragment() {

    private var _binding: FragmentUsernameBinding?  =  null
    private val binding: FragmentUsernameBinding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentUsernameBinding.bind(view)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}

