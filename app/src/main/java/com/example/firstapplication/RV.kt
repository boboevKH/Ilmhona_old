package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RV : AppCompatActivity() {

    private lateinit var recyclerView1: RecyclerView
    private lateinit var recyclerView2: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv)
        recyclerView1 = findViewById(R.id.recyclerview1)
        recyclerView2 = findViewById(R.id.recyclerview2)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView1.layoutManager = layoutManager

        val adapter1 = RecyclerAdapter()
        adapter1.list.add(
            Composition(resources.getDrawable(R.drawable.ic_launcher_foreground, null), "Born Singer", "Proof", "BTS",))
        adapter1.list.add(
            Composition(resources.getDrawable(R.drawable.ic_launcher_foreground, null), "Born Singer", "Proof", "BTS",))
        adapter1.list.add(
            Composition(resources.getDrawable(R.drawable.ic_launcher_foreground, null), "Born Singer", "Proof", "BTS",))
        adapter1.list.add(
            Composition(resources.getDrawable(R.drawable.ic_launcher_foreground, null), "Born Singer", "Proof", "BTS",))
        adapter1.list.add(
            Composition(resources.getDrawable(R.drawable.ic_launcher_foreground, null), "Born Singer", "Proof", "BTS",))
        adapter1.list.add(
            Composition(resources.getDrawable(R.drawable.ic_launcher_foreground, null), "Born Singer", "Proof", "BTS",))
        adapter1.list.add(
            Composition(resources.getDrawable(R.drawable.ic_launcher_foreground, null), "Born Singer", "Proof", "BTS",))
        adapter1.list.add(
            Composition(resources.getDrawable(R.drawable.ic_launcher_foreground, null), "Born Singer", "Proof", "BTS",))

        recyclerView1.adapter = adapter1
        adapter1.notifyDataSetChanged()


        recyclerView2.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        val adapter2 = RecyclerAdapter()
        adapter2.list.add(
            Composition(resources.getDrawable(R.drawable.ic_launcher_foreground, null), "Harry's House", "Harry's Style", "Singer",))
        adapter2.list.add(
            Composition(resources.getDrawable(R.drawable.ic_launcher_foreground, null), "Harry's House", "Harry's Style", "Singer",))
        adapter2.list.add(
            Composition(resources.getDrawable(R.drawable.ic_launcher_foreground, null), "Harry's House", "Harry's Style", "Singer",))
        adapter2.list.add(
            Composition(resources.getDrawable(R.drawable.ic_launcher_foreground, null), "Harry's House", "Harry's Style", "Singer",))
        adapter2.list.add(
            Composition(resources.getDrawable(R.drawable.ic_launcher_foreground, null), "Harry's House", "Harry's Style", "Singer",))
        adapter2.list.add(
            Composition(resources.getDrawable(R.drawable.ic_launcher_foreground, null), "Harry's House", "Harry's Style", "Singer",))
        adapter2.list.add(
            Composition(resources.getDrawable(R.drawable.ic_launcher_foreground, null), "Harry's House", "Harry's Style", "Singer",))
        adapter2.list.add(
            Composition(resources.getDrawable(R.drawable.ic_launcher_foreground, null), "Harry's House", "Harry's Style", "Singer",))


        recyclerView2.adapter = adapter2
        adapter2.notifyDataSetChanged()
    }


}
class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.TestViewHolder>() {

    val list: MutableList <Composition> = mutableListOf()

inner class TestViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    private var image: ImageView
    private var title: TextView
    private var albom: TextView
    private var author: TextView

    init {
        image = itemView.findViewById(R.id.image)
        title = itemView.findViewById(R.id.title_composition)
        albom = itemView.findViewById(R.id.title_albom)
        author = itemView.findViewById(R.id.title_author)
    }

    fun bind(composition: Composition) {
        image.setImageDrawable(composition.image)
        title.text = composition.title
        albom.text = composition.albom
        author.text = composition.author
    }

}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        val view = inflate.inflate(R.layout.item_composition, parent, false)
        return TestViewHolder(view)
    }

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        holder.bind(list[position])
    }


    override fun getItemCount(): Int {
        return list.size
    }
}