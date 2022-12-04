package com.abit.mysecondrecycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abit.mysecondrecycleview.databinding.ItemMusicListBinding

class MusicAdapter(
    private var musicList: List<Music>,
    val onClick:(position:Int) ->Unit
): RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(
            ItemMusicListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind(musicList[position])
    }

    override fun getItemCount() = musicList.size
    inner class MusicViewHolder(
        private val binding: ItemMusicListBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(music: Music) {
            itemView.setOnClickListener {
                onClick(adapterPosition)
            }
            binding.music.text=music.music
            binding.author.text=music.author
            binding.num.text=music.num
            binding.time.text=music.time
        }
    }
}