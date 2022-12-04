package com.abit.mysecondrecycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.abit.mysecondrecycleview.databinding.FragmentMusicBinding

class MusicFragment : Fragment() {

    private  lateinit var binding: FragmentMusicBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentMusicBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val position = arguments?.getInt("POS")
        val musicValue = arguments?.getSerializable("LIST") as ArrayList<Music>
        binding.tvMusic2.text=musicValue[position!!].music
        binding.tvAuthor2.text=musicValue[position].author
        binding.tvTime2.text=musicValue[position].time
    }


}