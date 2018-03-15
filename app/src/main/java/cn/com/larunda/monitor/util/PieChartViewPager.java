package cn.com.larunda.monitor.util;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.github.mikephil.charting.charts.PieChart;

/**
 * Created by sddt on 18-3-15.
 */

public class PieChartViewPager extends PieChart {
    PointF downPoint = new PointF();

    public PieChartViewPager(Context context) {
        super(context);
    }

    public PieChartViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PieChartViewPager(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                downPoint.x = event.getX();
                downPoint.y = event.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                getParent().requestDisallowInterceptTouchEvent(true);
                break;
        }

        return super.onTouchEvent(event);
    }
}
