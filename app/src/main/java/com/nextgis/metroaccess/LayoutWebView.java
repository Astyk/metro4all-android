/*
 * Project:  Metro4All
 * Purpose:  Routing in subway.
 * Author:   Stanislav Petriakov, becomeglory@gmail.com
 * *****************************************************************************
 * Copyright (c) 2015 NextGIS, info@nextgis.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.nextgis.metroaccess;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.webkit.WebView;

public class LayoutWebView extends WebView {
    public static float AREA_RADIUS = 32;
    private float mX, mY;
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public LayoutWebView(Context context) {
        super(context);
    }

    public LayoutWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (mX > 0 && mY > 0)
            canvas.drawCircle(mX, mY, AREA_RADIUS, mPaint);
    }

    public void defineArea(float x, float y) {
        mPaint.setColor(Color.RED);
        mPaint.setAlpha(128);

        mX = x;
        mY = y;
    }
}
