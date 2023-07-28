package com.example.disastertrackapp_gg30.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.disastertrackapp_gg30.R
import com.example.disastertrackapp_gg30.network.DisasterReport

class DisasterReportAdapter(private val reports: List<DisasterReport>) :
    RecyclerView.Adapter<DisasterReportAdapter.ReportViewHolder>() {

    class ReportViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title = itemView.findViewById<TextView>(R.id.reportTitle)
        val desc = itemView.findViewById<TextView>(R.id.reportDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReportViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_disaster_report, parent, false)
        return ReportViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReportViewHolder, position: Int) {
        val reportlist = reports[position]
        holder.title.text = reportlist.geometries[0].properties.title
        holder.desc.text = reportlist.geometries[0].properties.status
    }

    override fun getItemCount(): Int {
        return reports.size
    }
}
