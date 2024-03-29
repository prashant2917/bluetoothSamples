/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pocket.bluetoothlechat.chat

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pocket.bluetoothlechat.bluetooth.Message
import com.example.bluetoothlechat.R

class LocalMessageViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val messageText = itemView.findViewById<TextView>(R.id.message_text)

    fun bind(message: Message.LocalMessage) {
        messageText.text = message.text
    }
}