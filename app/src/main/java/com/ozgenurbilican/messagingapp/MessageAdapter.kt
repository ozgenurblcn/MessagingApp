package com.ozgenurbilican.messagingapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MessageAdapter(private val messages: List<Message>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val USER_MESSAGE = 1
        const val SYSTEM_MESSAGE = 2
        const val AUTO_REPLY_MESSAGE = 3
    }

    override fun getItemViewType(position: Int): Int {
        return when {
            messages[position].isAutoReply -> AUTO_REPLY_MESSAGE
            messages[position].isUserMessage -> USER_MESSAGE
            else -> SYSTEM_MESSAGE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            USER_MESSAGE -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.message_item_user, parent, false)
                UserMessageViewHolder(view)
            }
            AUTO_REPLY_MESSAGE -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.message_item_system, parent, false)
                AutoReplyViewHolder(view)
            }
            else -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.message_item_system, parent, false)
                SystemMessageViewHolder(view)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val message = messages[position]
        if (holder is UserMessageViewHolder) {
            holder.textViewMessage.text = message.content
          
        } else if (holder is AutoReplyViewHolder) {
            holder.textViewMessage.text = message.content
            
        } else if (holder is SystemMessageViewHolder) {
            holder.textViewMessage.text = message.content
            
        }
    }

    override fun getItemCount(): Int {
        return messages.size
    }

    class UserMessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewMessage: TextView = itemView.findViewById(R.id.textViewMessage)
    }

    class SystemMessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewMessage: TextView = itemView.findViewById(R.id.textViewMessage)
    }

    class AutoReplyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewMessage: TextView = itemView.findViewById(R.id.textViewMessage)
    }
}
