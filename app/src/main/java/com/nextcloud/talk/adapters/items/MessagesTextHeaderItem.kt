/*
 * Nextcloud Talk application
 *
 * @author Álvaro Brey
 * Copyright (C) 2022 Álvaro Brey
 * Copyright (C) 2022 Nextcloud GmbH
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package com.nextcloud.talk.adapters.items

import android.content.Context
import com.nextcloud.talk.R
import com.nextcloud.talk.ui.theme.ViewThemeUtils

class MessagesTextHeaderItem(context: Context, viewThemeUtils: ViewThemeUtils) :
    GenericTextHeaderItem(context.getString(R.string.messages), viewThemeUtils) {
    companion object {
        const val VIEW_TYPE = FlexibleItemViewType.MESSAGES_TEXT_HEADER_ITEM
    }

    override fun getItemViewType(): Int = VIEW_TYPE
}
