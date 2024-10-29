package com.ozgenurbilican.messagingapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ozgenurbilican.messagingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val messages = mutableListOf<Message>()
    private val adapter = MessageAdapter(messages)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        binding.buttonSend.setOnClickListener {
            val messageText = binding.editTextMessage.text.toString()
            if (messageText.isNotBlank()) {
                // Kullanıcı mesajını ekle ve logla
                val userMessage = Message(messageText, isUserMessage = true)
                messages.add(userMessage)
                adapter.notifyItemInserted(messages.size - 1)
                binding.recyclerView.scrollToPosition(messages.size - 1)

                // Kullanıcı mesajını Logcat’e yazdır
                Log.d("MessageLog", "Gönderilen mesaj: ${userMessage.content}, Gönderen: Kullanıcı")

                // Otomatik yanıt ekle ve logla
                val autoReply = Message("Mesaj alındı", isUserMessage = false, isAutoReply = true)
                messages.add(autoReply)
                adapter.notifyItemInserted(messages.size - 1)
                binding.recyclerView.scrollToPosition(messages.size - 1)

                // Sistem yanıtını Logcat’e yazdır
                Log.d("MessageLog", "Gönderilen mesaj: ${autoReply.content}, Gönderen: Sistem")

                // Mesaj gönderildikten sonra metin kutusunu temizle
                binding.editTextMessage.text.clear()
            }
        }
    }
}
