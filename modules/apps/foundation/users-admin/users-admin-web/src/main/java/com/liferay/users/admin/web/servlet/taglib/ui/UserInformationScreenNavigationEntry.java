/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.users.admin.web.servlet.taglib.ui;

import com.liferay.frontend.taglib.servlet.taglib.ScreenNavigationEntry;
import com.liferay.frontend.taglib.servlet.taglib.util.JSPRenderer;
import com.liferay.users.admin.web.constants.UserFormConstants;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Pei-Jung Lan
 */
@Component(
	property = {"screen.navigation.entry.order:Integer=10"},
	service = ScreenNavigationEntry.class
)
public class UserInformationScreenNavigationEntry
	extends BaseUserScreenNavigationEntry {

	@Override
	public String getCategoryKey() {
		return UserFormConstants.CATEGORY_KEY_GENERAL;
	}

	@Override
	public String getEntryKey() {
		return UserFormConstants.ENTRY_KEY_INFORMATION;
	}

	@Override
	public void render(HttpServletRequest request, HttpServletResponse response)
		throws IOException {

		_jspRenderer.renderJSP(request, response, "/user/information.jsp");
	}

	@Reference
	private JSPRenderer _jspRenderer;

}