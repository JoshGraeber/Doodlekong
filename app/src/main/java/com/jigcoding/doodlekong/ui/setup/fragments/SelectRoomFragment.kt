package com.jigcoding.doodlekong.ui.setup.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.jigcoding.doodlekong.databinding.FragmentCreateRoomBinding
import com.jigcoding.doodlekong.databinding.FragmentSelectRoomBinding
import com.jigcoding.doodlekong.databinding.FragmentUsernameBinding

class SelectRoomFragment : Fragment() {

    private var _binding: FragmentSelectRoomBinding?  =  null
    private val binding: FragmentSelectRoomBinding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSelectRoomBinding.bind(view)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}

