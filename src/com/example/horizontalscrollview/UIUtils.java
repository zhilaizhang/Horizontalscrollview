package com.example.horizontalscrollview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class UIUtils {
	
	public static final int LLW = LinearLayout.LayoutParams.WRAP_CONTENT;
	public static final int LLF = LinearLayout.LayoutParams.MATCH_PARENT;
	public static final int RLW = RelativeLayout.LayoutParams.WRAP_CONTENT;
	public static final int RLF = RelativeLayout.LayoutParams.MATCH_PARENT;
	public static final int FLW = FrameLayout.LayoutParams.WRAP_CONTENT;
	public static final int FLF = FrameLayout.LayoutParams.MATCH_PARENT;
    public static List<Activity> mListActivities = new ArrayList<Activity>();
	
	public static LinearLayout.LayoutParams getLllp(int width,int height){
		LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(width, height);
		return lp;
	}
	
	public static RelativeLayout.LayoutParams getRllp(int width,int height){
		RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(width, height);
		return lp;
	}
	
	public static FrameLayout.LayoutParams getFllp(int width,int height){
		FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(width, height);
		return lp;
	}
	
	
    /** 
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素) 
     */  
    public static int dip2px(Context context, float dpValue) {  
        final float scale = context.getResources().getDisplayMetrics().density;  
        return (int) (dpValue * scale + 0.5f);  
    }  

    /** 
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp 
     */  
    public static int px2dip(Context context, float pxValue) {  
        final float scale = context.getResources().getDisplayMetrics().density;  
        return (int) (pxValue / scale + 0.5f);  
    }
    

	
}
