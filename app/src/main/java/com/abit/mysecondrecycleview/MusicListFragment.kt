package com.abit.mysecondrecycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.abit.mysecondrecycleview.databinding.FragmentMusicListBinding

class MusicListFragment : Fragment() {
    lateinit var image: ImageView
    private lateinit var binding: FragmentMusicListBinding
    private lateinit var musicAdapter: MusicAdapter
    private var musicList= arrayListOf<Music>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusicListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        musicList.clear()
        loadData()
        musicAdapter= MusicAdapter(musicList, this::onClick)
        binding.rvMusic.adapter=musicAdapter
    }
    fun onClick(position: Int) {
        /*image=requireActivity().findViewById(R.id.iv_image)
        image.visibility=View.INVISIBLE*/
        val bundle = Bundle()
        bundle.putInt("POS",position)
        bundle.putSerializable("LIST",musicList)
        findNavController().navigate(R.id.musicFragment,bundle)
    }
    private fun loadData() {
        musicList.add(Music("Believer","Imagine Dragon","1","3:10"))
        musicList.add(Music("Believer","Imagine Dragon","1","3:10"))
        musicList.add(Music("Believer","Imagine Dragon","1","3:10"))
        musicList.add(Music("Believer","Imagine Dragon","1","3:10"))
        musicList.add(Music("Believer","Imagine Dragon","1","3:10"))
        musicList.add(Music("Believer","Imagine Dragon","1","3:10"))
        musicList.add(Music("Believer","Imagine Dragon","1","3:10"))
        musicList.add(Music("Believer","Imagine Dragon","1","3:10"))
    }

}


