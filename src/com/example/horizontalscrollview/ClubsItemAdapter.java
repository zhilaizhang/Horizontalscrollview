package com.example.horizontalscrollview;

import java.util.ArrayList;

import com.nostra13.universalimageloader.core.ImageLoader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 社刊 adapter
 * 
 * @author zhangzhilai 2014.10.9
 * 
 */
public class ClubsItemAdapter extends BaseAdapter {

	public static final String TAG = "ClubsItemAdapter";
	private Context mContext;
	private ArrayList<ClubsItemModel> mClubsItemModelList;
	private ImageLoader mImageLoader;

	public ClubsItemAdapter(Context context, ArrayList<ClubsItemModel> ClubsItemModels) {
		mContext = context;
		mClubsItemModelList = ClubsItemModels;
		mImageLoader = ImageUtils.getImageLoader(mContext);
	}

	@Override
	public int getCount() {
		return mClubsItemModelList.size();
	}

	@Override
	public ClubsItemModel getItem(int position) {
		return mClubsItemModelList.get(position);
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View itemView = convertView;
		ViewHolder viewHolder;

		ClubsItemModel clubsItemModel = mClubsItemModelList.get(position);
		String clubImagePath = clubsItemModel.getClubImagePath();
		String clubTitle = clubsItemModel.getClubTitle() != null ? clubsItemModel.getClubTitle() : "";
		String clubNum = clubsItemModel.getClubNum() != null ? clubsItemModel.getClubNum() : "0";

		if (itemView == null) {
			itemView = LayoutInflater.from(mContext).inflate(R.layout.clubs_scrollview_item, null);
			viewHolder = new ViewHolder();

			viewHolder.clubsImageView = (ImageView) itemView.findViewById(R.id.clubs_imageview);
			viewHolder.clubsTitleTextView = (TextView) itemView.findViewById(R.id.clubs_title);
			viewHolder.clubsNumTextView = (TextView) itemView.findViewById(R.id.clubs_num);
			itemView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) itemView.getTag();
		}
		itemView.setTag(R.id.tag_clubsitem, clubsItemModel);

		mImageLoader.displayImage(clubImagePath, viewHolder.clubsImageView, ImageUtils.getDefaultImageOptions());
		viewHolder.clubsTitleTextView.setText(clubTitle);
		viewHolder.clubsNumTextView.setText(clubNum);

		return itemView;
	}

	private class ViewHolder {
		ImageView clubsImageView;
		TextView clubsTitleTextView;
		TextView clubsNumTextView;
	}

}
