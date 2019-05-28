package asterixorobelix.galactica

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import asterixorobelix.galactica.model.Photo

class RecyclerAdapter(private val photos: List<Photo>) : RecyclerView.Adapter<RecyclerAdapter.PhotoHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount() = photos.size

    override fun onBindViewHolder(holder: PhotoHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class PhotoHolder(v: View) : RecyclerView.ViewHolder(v){
        init {
            v.setOnClickListener {
                
            }
        }
    }
}