package com.example.horizontalscrollview;

import java.util.ArrayList;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * 社刊 横向滑动scrollview
 * 
 * @author zhangzhilai 2014.10.9
 * 
 */
public class ClubsHorizonScrollView extends HorizontalScrollView {
	
	public static final String TAG = "ClubsHorizonScrollView";
	private Context mContext;
	private ArrayList<ClubsItemModel> mClubsItemModelList;
	private LinearLayout mClubContainerLayout;
	private ClubsItemAdapter mClubsItemAdapter;
	private final int mMarginLeftDp = 10;

	public ClubsHorizonScrollView(Context context) {
		super(context);
		mContext = context;
		initView();
	}

	public ClubsHorizonScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
		mContext = context;
		initView();
	}

	private void initView() {
		LayoutInflater.from(mContext).inflate(R.layout.clubs_horizon_scrollview, this);
		mClubContainerLayout = (LinearLayout) findViewById(R.id.horizonscrollview_linearlayout);
	}

	public void setListData(ArrayList<ClubsItemModel> clubsItemModelList) {
		mClubsItemModelList = clubsItemModelList;
		mClubsItemAdapter = new ClubsItemAdapter(mContext, mClubsItemModelList);
		addViews();
	}

	// 提供外部设置adapter
	public void setAdapter() {

	}

	private void addViews(){
		for (int i = 0; i < mClubsItemAdapter.getCount(); i++) {
			View itemView = mClubsItemAdapter.getView(i, null, null);
			itemView.setOnClickListener(onClickListener);
			LinearLayout.LayoutParams layoutParams = UIUtils.getLllp(UIUtils.LLW, UIUtils.LLW);
			layoutParams.leftMargin = UIUtils.dip2px(mContext, mMarginLeftDp);
			itemView.setLayoutParams(layoutParams);
			mClubContainerLayout.addView(itemView);
		}
	}
	
	View.OnClickListener onClickListener = new View.OnClickListener() {
		
		@Override
		public void onClick(View view) {
			ClubsItemModel clubsItemModel = (ClubsItemModel)view.getTag(R.id.tag_clubsitem);
			Toast.makeText(mContext, "clubsItemModel" + clubsItemModel.getClubTitle(), Toast.LENGTH_SHORT).show();
		}
	};
}
